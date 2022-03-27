package com.wrk.shopsystem.base.service;

import com.wrk.shopsystem.base.model.form.jsonModel.Purchase;
import com.wrk.shopsystem.base.model.form.jsonModel.InventoryJson;

import java.util.List;

public interface InventoryService {
    List<InventoryJson> findAll() throws Exception;
    List<InventoryJson> findByCondition(String barcode, String name, Integer type_no, Integer supplier_no, Integer department_no);
    InventoryJson findByCno(Integer cno);
    Boolean purchase(List<Purchase> purchases) throws Exception;
}
