package com.wrk.shopsystem.base.service.impl;

import com.wrk.shopsystem.base.model.Worktype;
import com.wrk.shopsystem.base.model.WorktypeExample;
import com.wrk.shopsystem.base.mapper.WorktypeMapper;
import com.wrk.shopsystem.base.service.WorkTypeService;
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
