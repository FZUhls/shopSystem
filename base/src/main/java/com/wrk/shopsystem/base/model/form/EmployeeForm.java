package com.wrk.shopsystem.base.model.form;

import lombok.Data;

@Data
public class EmployeeForm {
    private int eId;
    private String eName;
    private String idCardNumber;
    private String politicsStatus;
    private String educationStatus;
    private String isMarry;
    private String joinTime;
    private int salary;
    private int departmentNo;
    private int workType;
    private String notes;
}
