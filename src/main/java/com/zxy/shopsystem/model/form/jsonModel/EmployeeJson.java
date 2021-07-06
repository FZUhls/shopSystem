package com.zxy.shopsystem.model.form.jsonModel;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class EmployeeJson {
    private Integer eid;
    private String name;
    private String sex;
    private String idCard;
    @JsonFormat(pattern = "yyyy/MM/dd",timezone = "GMT+8")
    private Date birthday;
    private String politics;
    private String education;
    private Byte ismarried;
    @JsonFormat(pattern = "yyyy/MM/dd",timezone = "GMT+8")
    private Date joinTime;
    private Integer salary;
    private String department;
    private String workType;
    private String notes;
}
