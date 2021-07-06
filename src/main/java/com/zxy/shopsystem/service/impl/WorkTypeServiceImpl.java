package com.zxy.shopsystem.service.impl;

import com.zxy.shopsystem.model.Worktype;
import com.zxy.shopsystem.model.WorktypeExample;
import com.zxy.shopsystem.mapper.WorktypeMapper;
import com.zxy.shopsystem.service.WorkTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkTypeServiceImpl implements WorkTypeService {

    @Autowired
    WorktypeMapper worktypeMapper;


    @Override
    public List<Worktype> findAll() {
        WorktypeExample example = new WorktypeExample();
        return worktypeMapper.selectByExample(example);
    }
}
