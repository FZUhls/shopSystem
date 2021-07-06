package com.zxy.shopsystem.service.impl;

import com.zxy.shopsystem.model.Color;
import com.zxy.shopsystem.model.ColorExample;
import com.zxy.shopsystem.mapper.ColorMapper;
import com.zxy.shopsystem.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {

    @Autowired
    ColorMapper colorMapper;

    @Override
    public List<Color> findAll() {
        ColorExample example = new ColorExample();
        return colorMapper.selectByExample(example);
    }
}
