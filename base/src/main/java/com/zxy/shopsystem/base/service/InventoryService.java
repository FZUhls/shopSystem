package com.zxy.shopsystem.base.service;

import com.zxy.shopsystem.base.model.form.jsonModel.InventoryJson;
import com.zxy.shopsystem.base.model.form.jsonModel.Purchase;

import java.util.List;

public interface InventoryService {
    List<InventoryJson> findAll() throws Exception;
    List<InventoryJson> findByCondition(String barcode, String name, Integer type_no, Integer supplier_no, Integer department_no);
    InventoryJson findByCno(Integer cno);
    Boolean purchase(List<Purchase> purchases) throws Exception;
}
