package com.wrk.shopsystem.base.service.impl;

import com.wrk.shopsystem.base.dao.CommodityDao;
import com.wrk.shopsystem.base.model.Commodity;
import com.wrk.shopsystem.base.mapper.CommodityMapper;
import com.wrk.shopsystem.base.model.form.jsonModel.CommodityJson;
import com.wrk.shopsystem.base.service.CommodityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
@Slf4j
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    CommodityDao commodityDao;
    @Autowired
    CommodityMapper commodityMapper;

    @Override
    public List<CommodityJson> findByCondition(String barcode, String name, Integer tno, Integer sno) throws Exception {
        List<CommodityJson> list;
        try {
            list = commodityDao.findByCondition(barcode,name,tno,sno);
            if(list == null){
                throw new Exception("no found");
            }
        }catch (Exception e){
            throw e;
        }
        return list;
    }
    public Integer insert(String barcode, String name
            ,Integer colorNo,Integer typeNo
            ,Integer materialNo,Integer supplierNo
            ,Integer costPrice,Integer sellPrice) throws Exception{
        Commodity commodity = new Commodity();
        Integer cno = commodityDao.findLarge()+1;
        commodity.setCno(cno);
        commodity.setBarcode(barcode);
        commodity.setName(name);
        commodity.setColorNo(colorNo);
        commodity.setMaterialType(materialNo);
        commodity.setCommodityTypeNo(typeNo);
        commodity.setSupplierNo(supplierNo);
        commodity.setCostprice(costPrice);
        commodity.setSellprice(sellPrice);

        Integer record = commodityMapper.insertSelective(commodity);
        if (record!=1){
            throw new Exception("添加失败");
        }
        return record;
    }

    @Override
    public Integer delete(Integer cno) throws Exception {
        Integer sum = 0;
        try {
            sum = commodityMapper.deleteByPrimaryKey(cno);
            if (sum<1){
                throw new Exception("commodity is not exist");
            }
        }catch (Exception e){

            throw e;
        }
        return sum;
    }
}
