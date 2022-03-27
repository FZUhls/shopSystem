package com.wrk.shopsystem.admin.controller;

import com.wrk.shopsystem.base.model.Department;
import com.wrk.shopsystem.base.model.form.BaseResultForm;
import com.wrk.shopsystem.base.model.form.jsonModel.Purchase;
import com.wrk.shopsystem.base.service.DepartmentService;
import com.wrk.shopsystem.base.service.InventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/purchase")
public class PurchaseController extends BaseController {

    private static final String SUBMIT = "/submit";
    @Autowired
    DepartmentService departmentService;
    @Autowired
    InventoryService inventoryService;

    @GetMapping("")
    public String purchase(Model model) {
        List<Department> warehouses = departmentService.findAll();
        model.addAttribute("title","采购");
        model.addAttribute("warehouses",warehouses);
        return "/inventory/purchase";
    }
    @PostMapping(SUBMIT)
    @ResponseBody
    // TODO: 2021/4/28 记录下来这个ajax传json spring controller收json的坑
    public BaseResultForm submit(@RequestBody Purchase[] data){
        BaseResultForm form = new BaseResultForm();
        Boolean isSubmit = false;
        try {
            isSubmit = inventoryService.purchase(Arrays.asList(data));
        }catch (Exception e){
            log.error(e.getMessage());
            form.fail();
            form.setResultMsg(e.getMessage());
        }
        form.succ();
        return form;
    }
}
