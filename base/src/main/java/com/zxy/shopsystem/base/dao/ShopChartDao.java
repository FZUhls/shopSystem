package com.zxy.shopsystem.base.dao;

import com.zxy.shopsystem.base.model.form.jsonModel.ShopChart;

import java.util.Date;
import java.util.List;

public interface ShopChartDao {
    List<ShopChart> findByCondition(Integer shopNo, String barcode, Integer operatorNo, Date date);
}
