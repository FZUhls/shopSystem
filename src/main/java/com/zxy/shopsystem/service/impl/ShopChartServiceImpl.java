package com.zxy.shopsystem.service.impl;

import com.zxy.shopsystem.dao.ShopChartDao;
import com.zxy.shopsystem.model.form.jsonModel.ShopChart;
import com.zxy.shopsystem.service.ShopChartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
@Slf4j
public class ShopChartServiceImpl implements ShopChartService {

    @Autowired
    ShopChartDao shopChartDao;
    @Override
    public List<ShopChart> findByCondition(Integer shopNo, String barcode, Integer operatorNo, String date) throws ParseException {
        List<ShopChart> list = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parseDate = null;
            if (date!=null && date!=""){
                parseDate = simpleDateFormat.parse(date);
            }
            list = shopChartDao.findByCondition(shopNo,barcode,operatorNo,parseDate);
        }catch (Exception e){
            log.error(e.getMessage());
            throw e;
        }
        return list;
    }
}
