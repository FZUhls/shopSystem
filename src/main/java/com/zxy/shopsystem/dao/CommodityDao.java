package com.zxy.shopsystem.dao;

import com.zxy.shopsystem.model.form.jsonModel.CommodityJson;

import java.util.List;

public interface CommodityDao {
    List<CommodityJson> findByCondition(String barcode, String name, Integer tno, Integer sno);
    Integer findLarge();
}
