package com.zxy.shopsystem.base.service.impl;

import com.zxy.shopsystem.base.mapper.SupplierMapper;
import com.zxy.shopsystem.base.model.Supplier;
import com.zxy.shopsystem.base.model.SupplierExample;
import com.zxy.shopsystem.base.service.SupplierService;
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
