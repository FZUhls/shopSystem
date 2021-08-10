package com.zxy.shopsystem.base.model.form;

import lombok.Data;

@Data
public class BaseResultForm<T> {

    public int resultCode;
    public String resultMsg;

    private T result;

    public void succ(){
        this.resultCode = 200;
        this.resultMsg = "success";
    }
    public void fail(){
        this.resultCode = 400;
        this.resultMsg = "failure";
    }
}
