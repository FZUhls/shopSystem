package com.wrk.shopsystem.base.dao;

import com.wrk.shopsystem.base.model.form.jsonModel.InventoryJson;

import java.util.List;

public interface InventoryDao {
    List<InventoryJson> findAllInventoryJson();
    List<InventoryJson> findByCondition(String barcode,String name,Integer type_no,Integer supplier_no,Integer department_no);
}
