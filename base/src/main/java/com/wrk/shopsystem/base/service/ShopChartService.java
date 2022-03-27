package com.wrk.shopsystem.base.service;

import com.wrk.shopsystem.base.model.form.jsonModel.ShopChart;

import java.text.ParseException;
import java.util.List;

public interface ShopChartService {
    List<ShopChart> findByCondition(Integer shopNo, String barcode, Integer operatorNo, String date) throws ParseException;
}
