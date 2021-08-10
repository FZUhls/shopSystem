package com.zxy.shopsystem.base.service.impl;

import com.zxy.shopsystem.base.model.Worktype;
import com.zxy.shopsystem.base.model.WorktypeExample;
import com.zxy.shopsystem.base.mapper.WorktypeMapper;
import com.zxy.shopsystem.base.service.WorkTypeService;
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
