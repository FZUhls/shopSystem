package com.wrk.shopsystem.base.service.impl;

import com.wrk.shopsystem.base.model.Material;
import com.wrk.shopsystem.base.model.MaterialExample;
import com.wrk.shopsystem.base.mapper.MaterialMapper;
import com.wrk.shopsystem.base.service.MaterialService;
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
