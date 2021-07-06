package com.zxy.shopsystem.service.impl;

import com.zxy.shopsystem.mapper.SupplierMapper;
import com.zxy.shopsystem.model.Supplier;
import com.zxy.shopsystem.model.SupplierExample;
import com.zxy.shopsystem.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    SupplierMapper supplierMapper;
    @Override
    public List<Supplier> findAll() {
        SupplierExample example = new SupplierExample();
        List<Supplier> list = supplierMapper.selectByExample(example);
        return list;
    }
}
