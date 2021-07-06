package com.zxy.shopsystem.service.impl;

import com.zxy.shopsystem.model.Material;
import com.zxy.shopsystem.model.MaterialExample;
import com.zxy.shopsystem.mapper.MaterialMapper;
import com.zxy.shopsystem.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    MaterialMapper materialMapper;

    @Override
    public List<Material> findAll() {

        List<Material> list;
        MaterialExample example = new MaterialExample();
        list = materialMapper.selectByExample(example);
        return list;
    }
}
