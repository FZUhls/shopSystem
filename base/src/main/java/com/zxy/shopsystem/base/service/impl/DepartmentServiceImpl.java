package com.zxy.shopsystem.base.service.impl;

import com.zxy.shopsystem.base.model.Department;
import com.zxy.shopsystem.base.model.DepartmentExample;
import com.zxy.shopsystem.base.mapper.DepartmentMapper;
import com.zxy.shopsystem.base.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> findAll() {
        DepartmentExample example = new DepartmentExample();
        List<Department> list = departmentMapper.selectByExample(example);
        return list;
    }
}
