package com.zxy.shopsystem.service;

import com.zxy.shopsystem.model.form.jsonModel.CommodityJson;

import java.util.List;

public interface CommodityService {
    List<CommodityJson> findByCondition(String barcode, String name, Integer tno, Integer sno) throws Exception;
    Integer insert(String barcode, String name
            ,Integer colorNo,Integer typeNo
            ,Integer materialNo,Integer supplierNo
            ,Integer costPrice,Integer sellPrice)throws Exception;
    Integer delete(Integer cno) throws Exception;
}
