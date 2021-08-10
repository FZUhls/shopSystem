package com.zxy.shopsystem.base.dao;

import com.zxy.shopsystem.base.model.form.jsonModel.CommodityJson;

import java.util.List;

public interface CommodityDao {
    List<CommodityJson> findByCondition(String barcode, String name, Integer tno, Integer sno);
    Integer findLarge();
}
