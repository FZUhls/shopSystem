package com.wrk.shopsystem.base.model.form.jsonModel;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class TransferOrderJson {
    private Integer tno;
    private String fromName;
    private String destinName;
    private String  operator;
    @JsonFormat(pattern = "yyyy/MM/dd",timezone = "GMT+8")
    private Date date;
    private Byte isFinish;
}
