package com.wrk.shopsystem.admin.controller;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import com.wrk.shopsystem.base.model.Color;
import com.wrk.shopsystem.base.model.CommodityType;
import com.wrk.shopsystem.base.model.Material;
import com.wrk.shopsystem.base.model.Supplier;
import com.wrk.shopsystem.base.model.form.BaseResultForm;
import com.wrk.shopsystem.base.model.form.jsonModel.CommodityJson;
import com.wrk.shopsystem.base.model.form.jsonModel.InventoryJson;
import com.wrk.shopsystem.base.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/commodity")
public class CommodityController extends BaseController {

    private static final String FIND_BY_CONDITION = "/find";
    private static final String INSERT = "/addCom";
    private static final String DELETE = "/delete";
    @Autowired
    CommodityService commodityService;
    @Autowired
    SupplierService supplierService;
    @Autowired
    CommodityTypeService commodityTypeServicel;
    @Autowired
    ColorService colorService;
    @Autowired
    MaterialService materialService;
    @Autowired
    InventoryService inventoryService;

    @GetMapping("")
    public String commodity(Model model){
        List<Supplier> suppliers = supplierService.findAll();
        List<CommodityType> commodityTypes = commodityTypeServicel.findAll();
        List<Color> colors = colorService.findAll();
        List<Material> materials = materialService.findAll();
        model.addAttribute("title","商品管理");
        model.addAttribute("types",commodityTypes);
        model.addAttribute("suppliers",suppliers);
        model.addAttribute("colors",colors);
        model.addAttribute("materials",materials);
        return "/commodity/comTable";
    }
    @PostMapping(FIND_BY_CONDITION)
    @ResponseBody
    public BaseResultForm<List<CommodityJson>> findByCondition(String barcode, String name, Integer tno, Integer sno){
        BaseResultForm<List<CommodityJson>> form = new BaseResultForm<>();
        List<CommodityJson> list = null;
        try {
            list = commodityService.findByCondition(barcode,name,tno,sno);
        }catch (Exception e){
            form.fail();
            form.setResultMsg(e.getMessage());
        }
        if (list != null && !list.isEmpty()){
            form.succ();
            form.setResult(list);
        }
        return form;
    }
    @ResponseBody
    @PostMapping(INSERT)
    public BaseResultForm insert(String barcode, String name
            ,@RequestParam("cno") Integer colorNo,@RequestParam("tno") Integer typeNo
            ,@RequestParam("mno") Integer materialNo,@RequestParam("sno") Integer supplierNo
            ,Integer costPrice,Integer sellPrice){
        BaseResultForm form = new BaseResultForm();
        Integer record;
        try {
            record = commodityService.insert(barcode,name,colorNo,typeNo,materialNo,supplierNo,costPrice,sellPrice);
            if (record!=1){
                throw new Exception("添加失败");
            }
        }catch (Exception e){
            form.fail();
            log.error(e.getMessage());
            if (e instanceof MysqlDataTruncation){
                form.setResultMsg("请输入合法的条码号");
            }
            else if (e instanceof SQLException){
                form.setResultMsg("商品已存在");
            }
            else {
                form.setResultMsg("添加失败，请稍后再试");
            }
            return form;
        }
        log.info("添加成功 record = "+record);
        form.succ();
        return form;
    }
    @PostMapping(DELETE)
    @ResponseBody
    public BaseResultForm delete(Integer cno){
        BaseResultForm form = new BaseResultForm();
        Integer i = 0;
        try {
            i = commodityService.delete(cno);
        }catch (Exception e){
            form.fail();

            if (e instanceof DataIntegrityViolationException){

                InventoryJson inventoryJson = inventoryService.findByCno(cno);
                form.setResultMsg("不允许删除库存中存在的商品,库存仍有："+inventoryJson.getNumber());
            }else {
                form.setResultMsg("删除出错请稍后再试");
            }
            log.error(e.getClass().toString());
            return form;
        }
        form.succ();
        return form;
    }
}
