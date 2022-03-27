package com.wrk.shopsystem.base.dao;

import com.wrk.shopsystem.base.model.form.jsonModel.EmployeeJson;

import java.util.List;

public interface EmployeeDao {
    List<EmployeeJson> findAll();
    List<EmployeeJson> findByCondition(Integer eid, String name, Integer departmentNo, Integer workTypeNo);
    Integer findLarge();
}
