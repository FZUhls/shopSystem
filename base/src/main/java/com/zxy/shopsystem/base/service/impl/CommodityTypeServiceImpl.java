package com.zxy.shopsystem.base.service.impl;

import com.zxy.shopsystem.base.model.CommodityType;
import com.zxy.shopsystem.base.model.CommodityTypeExample;
import com.zxy.shopsystem.base.mapper.CommodityTypeMapper;
import com.zxy.shopsystem.base.service.CommodityTypeService;
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
