package com.wrk.shopsystem.base.service;

import com.wrk.shopsystem.base.model.form.jsonModel.CommodityJson;

import java.util.List;

public interface CommodityService {
    List<CommodityJson> findByCondition(String barcode, String name, Integer tno, Integer sno) throws Exception;
    Integer insert(String barcode, String name
            ,Integer colorNo,Integer typeNo
            ,Integer materialNo,Integer supplierNo
            ,Integer costPrice,Integer sellPrice)throws Exception;
    Integer delete(Integer cno) throws Exception;
}
