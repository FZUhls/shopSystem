package com.wrk.shopsystem.base.service.impl;

import com.wrk.shopsystem.base.model.Color;
import com.wrk.shopsystem.base.model.ColorExample;
import com.wrk.shopsystem.base.mapper.ColorMapper;
import com.wrk.shopsystem.base.service.ColorService;
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
