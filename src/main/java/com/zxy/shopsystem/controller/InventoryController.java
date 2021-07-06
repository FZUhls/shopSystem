package com.zxy.shopsystem.controller;

import com.zxy.shopsystem.model.CommodityType;
import com.zxy.shopsystem.model.Department;
import com.zxy.shopsystem.model.Supplier;
import com.zxy.shopsystem.model.form.BaseResultForm;
import com.zxy.shopsystem.model.form.jsonModel.InventoryJson;
import com.zxy.shopsystem.service.InventoryService;
import com.zxy.shopsystem.service.CommodityTypeService;
import com.zxy.shopsystem.service.DepartmentService;
import com.zxy.shopsystem.service.SupplierService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/inventory")
@Slf4j
public class InventoryController {
    private static final String FINDALL = "/findAll";
    private static final String FIND_BY_CONDITION = "/findByCondition";
    @Autowired
    InventoryService inventoryService;
    @Autowired
    SupplierService supplierService;
    @Autowired
    DepartmentService departmentService;
    @Autowired
    CommodityTypeService commodityTypeServicel;
    @GetMapping("")
    public String Conmodity(Model model){
        List<Supplier> suppliers = supplierService.findAll();
        List<Department> departments = departmentService.findAll();
        List<CommodityType> commodityTypes = commodityTypeServicel.findAll();
        model.addAttribute("title","库存查询");
        model.addAttribute("supplierList",suppliers);
        model.addAttribute("departmentList",departments);
        model.addAttribute("typeList",commodityTypes);
        return "inventory/invenTable";
    }


    @GetMapping(FINDALL)
    @ResponseBody
    public BaseResultForm<List<InventoryJson>> findAllCommodity(){
        BaseResultForm<List<InventoryJson>> form = new BaseResultForm<>();
        List<InventoryJson> list;
        try {
            list = inventoryService.findAll();
        }catch (Exception e){
            log.info(e.getMessage());
            form.fail();
            return form;
        }
        form.succ();
        form.setResult(list);
        return form;
    }
    @PostMapping(FIND_BY_CONDITION)
    @ResponseBody
    public BaseResultForm<List<InventoryJson>> findByCondition(String barcode,Integer type_no,String name,Integer supplier_no,Integer department_no){
        BaseResultForm<List<InventoryJson>> form = new BaseResultForm<>();
        List<InventoryJson> list = inventoryService.findByCondition(barcode,name,type_no,supplier_no,department_no);
        if (list==null || list.isEmpty() || list.size()==0){
            form.fail();
            form.setResultMsg("NO FOUND!");
        }else {
            form.succ();
            form.setResult(list);
        }
        return form;
    }
}
