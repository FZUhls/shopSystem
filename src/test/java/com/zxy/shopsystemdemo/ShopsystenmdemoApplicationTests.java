package com.zxy.shopsystemdemo;

import com.zxy.shopsystem.dao.CommodityDao;
import com.zxy.shopsystem.dao.EmployeeDao;
import com.zxy.shopsystem.model.Supplier;
import com.zxy.shopsystem.model.form.jsonModel.CommodityJson;
import com.zxy.shopsystem.service.CommodityService;
import com.zxy.shopsystem.service.EmployeeSevice;
import com.zxy.shopsystem.service.SupplierService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.List;

@Slf4j
@SpringBootTest
class ShopsystenmdemoApplicationTests {

    @Autowired
    EmployeeSevice employeeSevice;
    @Autowired
    SupplierService supplierService;
    @Autowired
    CommodityDao commodityDao;
    @Autowired
    CommodityService commodityService;
    @Autowired
    EmployeeDao employeeDao;
    @Test
    void contextLoads() throws Exception {
        List<Supplier> list = supplierService.findAll();
        for (Supplier s: list){
            System.out.println(s);
        }
    }
    @Test
    void commodityTest(){
        List<CommodityJson> commodityJsons = commodityDao.findByCondition("","",1,0);
        for(CommodityJson c : commodityJsons){
            System.out.println(c);
        }
    }
    @Test
    void TestInsert(){
        Boolean b = false;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            b = employeeSevice.insert("吴建国","男","350102198706082541","1987-06-08"
            , (byte) 1,"党员","master",1004,1001
                    ,"2011-05-14",16000,"");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(b);
    }
    @Test
    void delteTest(){
        Integer i = 0;
        try {
            i = commodityService.delete(9);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        System.out.println(i);

    }
}
