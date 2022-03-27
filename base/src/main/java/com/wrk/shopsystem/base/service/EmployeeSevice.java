package com.wrk.shopsystem.base.service;

import com.wrk.shopsystem.base.model.Employee;
import com.wrk.shopsystem.base.model.form.jsonModel.EmployeeJson;

import java.util.List;

public interface EmployeeSevice {
    List<EmployeeJson> findAll();
    List<EmployeeJson> selectByCondition(Integer eid, String name, Integer departmentNo, Integer workTypeNo) throws Exception;
    Boolean deleteById(Integer id) throws Exception;
    // TODO: 2021/4/26 添加insert员工的方法
    Boolean insert(String name, String sex, String idCard
            , String birthday, Byte ismarried, String politicsStatus
            , String educationStatus, Integer workTypeNo, Integer departmentNo
            , String joinTime, Integer salary, String notes) throws Exception;
    Boolean insertBatch(List<Employee> employees);
    Boolean update(Employee employee);
}
