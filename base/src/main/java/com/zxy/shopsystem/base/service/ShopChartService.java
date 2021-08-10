package com.zxy.shopsystem.base.service;

import com.zxy.shopsystem.base.model.form.jsonModel.ShopChart;

import java.text.ParseException;
import java.util.List;

public interface ShopChartService {
    List<ShopChart> findByCondition(Integer shopNo, String barcode, Integer operatorNo, String date) throws ParseException;
}
