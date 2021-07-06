package com.zxy.shopsystem.service.impl;

import com.zxy.shopsystem.model.Department;
import com.zxy.shopsystem.model.DepartmentExample;
import com.zxy.shopsystem.mapper.DepartmentMapper;
import com.zxy.shopsystem.service.DepartmentService;
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
