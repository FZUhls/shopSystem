package com.zxy.shopsystem.base.model.form.jsonModel;

import lombok.Data;

@Data
public class DistributeForm {
    private Integer fromNo;
    private Integer destinNo;
    private DistributeDetail[] data;
}
