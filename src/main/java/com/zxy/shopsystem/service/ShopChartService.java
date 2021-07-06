package com.zxy.shopsystem.service;

import com.zxy.shopsystem.model.form.jsonModel.ShopChart;

import java.text.ParseException;
import java.util.List;

public interface ShopChartService {
    List<ShopChart> findByCondition(Integer shopNo, String barcode, Integer operatorNo, String date) throws ParseException;
}
