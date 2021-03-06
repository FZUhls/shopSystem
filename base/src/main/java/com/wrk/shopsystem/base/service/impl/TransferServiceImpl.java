package com.wrk.shopsystem.base.service.impl;

import com.wrk.shopsystem.base.dao.InventoryDao;
import com.wrk.shopsystem.base.dao.TransferOrderDao;
import com.wrk.shopsystem.base.model.CommodityInventory;
import com.wrk.shopsystem.base.model.CommodityInventoryExample;
import com.wrk.shopsystem.base.model.TranferForm;
import com.wrk.shopsystem.base.model.TransferOrder;
import com.wrk.shopsystem.base.model.form.jsonModel.DistributeDetail;
import com.wrk.shopsystem.base.model.form.jsonModel.InventoryJson;
import com.wrk.shopsystem.base.mapper.CommodityInventoryMapper;
import com.wrk.shopsystem.base.mapper.TranferFormMapper;
import com.wrk.shopsystem.base.mapper.TransferOrderMapper;
import com.wrk.shopsystem.base.model.form.jsonModel.DistributeForm;
import com.wrk.shopsystem.base.model.form.jsonModel.TransferOrderJson;
import com.wrk.shopsystem.base.service.TransferService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class TransferServiceImpl implements TransferService {
    @Autowired
    TranferFormMapper tranferFormMapper;
    @Autowired
    TransferOrderMapper transferOrderMapper;
    @Autowired
    TransferOrderDao transferOrderDao;
    @Autowired
    InventoryDao inventoryDao;
    @Autowired
    CommodityInventoryMapper commodityInventoryMapper;

    @Override
    public List<TransferOrderJson> selectByCondition(Integer fromNo, Integer destinNo, String date) throws Exception{
        List<TransferOrderJson> list = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        if (date!=null && date!=""){
            date1 = dateFormat.parse(date);
        }
        try{
            list = transferOrderDao.findByCondition(fromNo,destinNo,date1);
            if (list==null){
                throw new Exception("no found");
            }
        }catch (Exception e){
            log.error(e.getMessage());
            throw e;
        }
        return list;
    }

    @Override
    public Boolean submit(DistributeForm distributeForm) throws Exception {
        Integer fromNo = distributeForm.getFromNo();
        Integer destinNo = distributeForm.getDestinNo();
        DistributeDetail[] details = distributeForm.getData();
        if (details!=null && details.length!=0){
            TransferOrder order = new TransferOrder();
            Integer index = transferOrderMapper.getIndex()+1;
            order.setTno(index);
            order.setIsfinish((byte)0);
            order.setFromNo(fromNo);
            order.setDestinationNo(destinNo);
            order.setOperNo(1007);
            order.setDate(new Date());
            Map<DistributeDetail,Integer> map = new HashMap<>();
            try{
                for (DistributeDetail detail :details){
                    String barcode = detail.getBarcode();
                    InventoryJson inventoryJson = inventoryDao
                            .findByCondition(barcode,null,null,null,fromNo).get(0);
                    if(inventoryJson.getNumber()<detail.getNumber()){
                        String exceptionMsg = ""+detail.getBarcode()+"????????????";
                        throw new Exception(exceptionMsg);
                    }
                    map.put(detail,inventoryJson.getCno());
                }
            }catch (Exception e){
                log.error(e.getMessage());
                throw e;
            }
            try{
                transferOrderMapper.insert(order);
            }catch (Exception e){
                String exception = "??????????????????";
                throw new Exception(exception);
            }
            for (DistributeDetail detail :details){
                TranferForm tranferForm = new TranferForm();
                tranferForm.setCno(map.get(detail));
                tranferForm.setNumber(detail.getNumber());
                tranferForm.setTno(index);
                tranferFormMapper.insert(tranferForm);
                distribute(map.get(detail),fromNo,destinNo,detail.getNumber());
            }
        }else {
            throw new Exception("??????????????????");
        }
        return true;
    }

    private void distribute(Integer cno,Integer fromNo,Integer toNo,Integer number){

        CommodityInventoryExample from = new CommodityInventoryExample();
        CommodityInventoryExample.Criteria fromCriteria =  from.createCriteria();
        fromCriteria.andCnoEqualTo(cno)
                .andDnoEqualTo(fromNo);
        CommodityInventory fromInventory = commodityInventoryMapper.selectByExample(from).get(0);

        CommodityInventoryExample to = new CommodityInventoryExample();
        CommodityInventoryExample.Criteria toCriteria =  to.createCriteria();
        toCriteria.andCnoEqualTo(cno)
                .andDnoEqualTo(toNo);
        List<CommodityInventory> toInventorys = commodityInventoryMapper.selectByExample(to);

        fromInventory.setCount(fromInventory.getCount()-number);
        commodityInventoryMapper.updateByExample(fromInventory,from);
        if(toInventorys == null || toInventorys.isEmpty()){
            CommodityInventory record = new CommodityInventory();
            record.setCno(cno);
            record.setDno(toNo);
            record.setCount(number);
            commodityInventoryMapper.insert(record);
        }else {
            CommodityInventory record = new CommodityInventory();
            record.setCno(null);
            record.setDno(null);
            record.setNote(null);
            record.setCount(toInventorys.get(0).getCount()+number);
            commodityInventoryMapper.updateByExampleSelective(record,to);
        }
    }
    @Override
    public List<DistributeDetail> queryDetail(Integer tno) {
        List<DistributeDetail> list = null;
        try{
            list = transferOrderDao.queryDetail(tno);
        }catch (Exception e){
            log.error(e.getMessage());
            throw e;
        }
        return list;
    }
}
