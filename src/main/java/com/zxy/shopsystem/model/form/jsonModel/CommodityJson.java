package com.zxy.shopsystem.model.form.jsonModel;

import lombok.Data;

@Data
public class CommodityJson {
    private Integer no;
    private String name;
//    private Integer tno;
    private String type;
    private String barcode;
//    private Integer cno;
    private String color;
//    private Integer sno;
    private String supplier;
    private Integer costPrice;
    private Integer sellPrice;
//    private Integer mno;
    private String material;
}
