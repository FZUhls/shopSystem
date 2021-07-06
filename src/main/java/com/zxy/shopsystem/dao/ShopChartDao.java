package com.zxy.shopsystem.dao;

import com.zxy.shopsystem.model.form.jsonModel.ShopChart;

import java.util.Date;
import java.util.List;

public interface ShopChartDao {
    List<ShopChart> findByCondition(Integer shopNo, String barcode, Integer operatorNo, Date date);
}
