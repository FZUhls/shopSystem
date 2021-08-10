package com.zxy.shopsystem.admin.controller;

import com.zxy.shopsystem.base.model.Department;
import com.zxy.shopsystem.base.model.form.BaseResultForm;
import com.zxy.shopsystem.base.model.form.jsonModel.ShopChart;
import com.zxy.shopsystem.base.service.DepartmentService;
import com.zxy.shopsystem.base.service.ShopChartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/shopchart")
public class ShopController extends BaseController {

    private static final String FIND = "/findByCondition";

    @Autowired
    ShopChartService shopChartService;
    @Autowired
    DepartmentService departmentService;

    @GetMapping("")
    public String shopChart(Model model) {
        List<Department> departments = departmentService.findAll();
        model.addAttribute("shops",departments);
        model.addAttribute("title","门店报表");
        return "/shop/shop";
    }
    @PostMapping(FIND)
    @ResponseBody
    public BaseResultForm<List<ShopChart>> findByCondition(Integer shopNo, String barcode, Integer operator, String date){
        BaseResultForm<List<ShopChart>> form = new BaseResultForm<>();
        List<ShopChart> list = null;
        try {
            list = shopChartService.findByCondition(shopNo, barcode, operator, date);
        }catch (Exception e){
            form.fail();
            if (e instanceof SQLException){
                form.setResultMsg("查询条件有误");
            }
            form.setResultMsg("查询失败");
        }
        form.succ();
        form.setResult(list);
        return form;
    }
}

