package com.wrk.shopsystem.base.service.impl;

import com.wrk.shopsystem.base.dao.InventoryDao;
import com.wrk.shopsystem.base.mapper.*;
import com.wrk.shopsystem.base.model.Commodity;
import com.wrk.shopsystem.base.model.CommodityExample;
import com.wrk.shopsystem.base.model.CommodityInventory;
import com.wrk.shopsystem.base.model.CommodityInventoryExample;
import com.wrk.shopsystem.base.model.form.jsonModel.InventoryJson;
import com.wrk.shopsystem.base.model.form.jsonModel.Purchase;
import com.wrk.shopsystem.base.service.InventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
@Service
@Slf4j
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    CommodityMapper commodityMapper;
    @Autowired
    InventoryDao inventoryDao;
    @Autowired
    ColorMapper colorMapper;
    @Autowired
    MaterialMapper materialMapper;
    @Autowired
    SupplierMapper supplierMapper;
    @Autowired
    CommodityInventoryMapper commodityInventoryMapper;
    @Override
    public List<InventoryJson> findAll() throws Exception {
        List<InventoryJson> list = null;
        try {
            list = inventoryDao.findAllInventoryJson();
            if (list == null){
                throw new Exception("found nothing!");
            }
        }catch (Exception e){
            throw e;
        }
        return list;
    }

    @Override
    public List<InventoryJson> findByCondition(String barcode,String name,Integer type,Integer supplier_no,Integer department_no) {
        List<InventoryJson> list = null;
        list = inventoryDao.findByCondition(barcode,name,type,supplier_no,department_no);
        return list;
    }
    @Override
    public InventoryJson findByCno(Integer cno) {
        InventoryJson json = null;
        try {
            Commodity commodity = commodityMapper.selectByPrimaryKey(cno);
            json = findByCondition(commodity.getBarcode(),null,null,null,null).get(0);
        }catch (Exception e){
            log.error(e.getMessage());
            return null;
        }
        return json;
    }

    @Override
    public Boolean purchase(List<Purchase> purchases) throws Exception {
        Boolean check = true;
        Purchase temp = new Purchase();
        HashMap<Purchase,Integer> map =new HashMap<>();
        try {
            for (Purchase p : purchases){
                int cno;
                CommodityExample example =new CommodityExample();
                CommodityExample.Criteria criteria = example.createCriteria();
                criteria.andBarcodeEqualTo(p.getBarcode());
                temp = p;
                cno = commodityMapper.selectByExample(example).get(0).getCno();
                map.put(p,cno);
            }
        }catch (Exception e){
            check = false;
            throw new Exception("请先添加商品："+ temp.getBarcode());
        }
        temp = null;
        if (check==true){
            try {
                for (Purchase p : purchases){
                    List<InventoryJson> inventoryJsons = inventoryDao.findByCondition(p.getBarcode(),null,null,null,p.getWarehouseNo());
                    CommodityInventory inventory = new CommodityInventory();
                    if (!inventoryJsons.isEmpty()){

                        InventoryJson inventoryJson = inventoryJsons.get(0);
                        inventory.setCno(null);
                        inventory.setDno(null);
                        inventory.setNote(null);
                        inventory.setCount(inventoryJson.getNumber()+p.getNumber());
                        CommodityInventoryExample example = new CommodityInventoryExample();
                        CommodityInventoryExample.Criteria criteria = example.createCriteria();
                        criteria.andCnoEqualTo(inventoryJson.getCno());
                        criteria.andDnoEqualTo(inventoryJson.getDno());
                        commodityInventoryMapper.updateByExampleSelective(inventory,example);
                    }else {
                        inventory.setCno(map.get(p));
                        inventory.setDno(p.getWarehouseNo());
                        inventory.setCount(p.getNumber());
                        inventory.setNote(new Date().toString());
                        commodityInventoryMapper.insert(inventory);
                    }
                }
            }catch (Exception e){
                log.error(e.getMessage());
                throw e;
            }
        }else {
            return false;
        }
        return true;
    }
}
