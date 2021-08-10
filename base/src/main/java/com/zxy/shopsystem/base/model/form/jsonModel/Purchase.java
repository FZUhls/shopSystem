package com.zxy.shopsystem.base.model.form.jsonModel;

import lombok.Data;

@Data
public class Purchase {
    private Integer warehouseNo;
    private String warehouseName;
    private String barcode;
    private Integer number;
}
