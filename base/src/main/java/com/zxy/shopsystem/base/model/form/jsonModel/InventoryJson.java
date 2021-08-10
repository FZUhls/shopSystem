package com.zxy.shopsystem.base.model.form.jsonModel;

import lombok.Data;

@Data
public class InventoryJson {
    private Integer cno;

    private String name;

    private String  commodityType;

    private String  supplier;

    private String color;

    private String barcode;

    private Integer costPrice;

    private Integer sellPrice;

    private String  material;

    private Integer dno;

    private Integer number;
}
