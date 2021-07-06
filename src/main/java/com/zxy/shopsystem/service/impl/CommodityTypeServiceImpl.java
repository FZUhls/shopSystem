package com.zxy.shopsystem.service.impl;

import com.zxy.shopsystem.model.CommodityType;
import com.zxy.shopsystem.model.CommodityTypeExample;
import com.zxy.shopsystem.mapper.CommodityTypeMapper;
import com.zxy.shopsystem.service.CommodityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommodityTypeServiceImpl implements CommodityTypeService {
    @Autowired
    CommodityTypeMapper commodityTypeMapper;
    @Override
    public List<CommodityType> findAll() {
        CommodityTypeExample example = new CommodityTypeExample();
        List<CommodityType> list = commodityTypeMapper.selectByExample(example);
        return list;
    }
}
