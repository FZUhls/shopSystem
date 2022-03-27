package com.wrk.shopsystem.base.model.form.jsonModel;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class ShopChart {
    private String shop;
    private String barcode;
    private String commodity;
    private String operator;
    private Integer number;
    private Integer totalPrice;
    @JsonFormat(pattern = "yyyy/MM/dd",timezone = "GMT+8")
    private Date time;
}
