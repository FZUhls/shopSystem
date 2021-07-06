package com.zxy.shopsystem.dao;

import java.util.List;

import com.zxy.shopsystem.model.form.jsonModel.EmployeeJson;

public interface EmployeeDao {
    List<EmployeeJson> findAll();
    List<EmployeeJson> findByCondition(Integer eid, String name, Integer departmentNo, Integer workTypeNo);
    Integer findLarge();
}
