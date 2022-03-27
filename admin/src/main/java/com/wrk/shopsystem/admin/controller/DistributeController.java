package com.wrk.shopsystem.admin.controller;

import com.wrk.shopsystem.base.model.Department;
import com.wrk.shopsystem.base.model.form.BaseResultForm;
import com.wrk.shopsystem.base.model.form.jsonModel.DistributeDetail;
import com.wrk.shopsystem.base.model.form.jsonModel.DistributeForm;
import com.wrk.shopsystem.base.model.form.jsonModel.TransferOrderJson;
import com.wrk.shopsystem.base.service.DepartmentService;
import com.wrk.shopsystem.base.service.TransferService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/distribute")
public class DistributeController extends BaseController {


    private static final String SELECT_BY_CONDITION = "/selectByCondition";
    private static final String SUMIT = "/submit";
    private static final String QUERY_DETAIL = "/queryDetail";
    @Autowired
    TransferService transferService;
    @Autowired
    DepartmentService departmentService;

    @GetMapping("")
    public String distribute(Model model) {
        List<Department> departments = departmentService.findAll();
        model.addAttribute("title","商品分发");
        model.addAttribute("departmentList",departments);
        return "/inventory/distribute";
    }
    @PostMapping(SUMIT)
    @ResponseBody
    public BaseResultForm submit(@RequestBody DistributeForm form){
        BaseResultForm resultForm = new BaseResultForm();
        boolean b = false;
        try{
            b = transferService.submit(form);
        }catch (Exception e){
            log.error(e.getMessage());
            resultForm.fail();
            resultForm.setResultMsg(e.getMessage());
        }
        if(b){
            resultForm.succ();
            return resultForm;
        }
        resultForm.fail();
        return resultForm;
    }
    @PostMapping(SELECT_BY_CONDITION)
    @ResponseBody
    public BaseResultForm<List<TransferOrderJson>> selectByCondition(Integer fromNo, Integer destinNo, String date){
        BaseResultForm<List<TransferOrderJson>> form = new BaseResultForm<>();
        List<TransferOrderJson> list = null;
        try {
            list = transferService.selectByCondition(fromNo,destinNo,date);
        }catch (Exception e){
            log.error(e.getMessage());
            form.fail();
            return form;
        }
        form.succ();
        form.setResult(list);
        return form;
    }
    @PostMapping(QUERY_DETAIL)
    @ResponseBody
    public BaseResultForm<List<DistributeDetail>> queryDetail(Integer tno){
        BaseResultForm form = new BaseResultForm();
        List<DistributeDetail> list = null;
        try {
            list = transferService.queryDetail(tno);
        }catch (Exception e){
            log.error(e.getMessage());
            form.fail();
            form.setResultMsg(e.getMessage());
            return form;
        }
        form.succ();
        form.setResult(list);
        return form;
    }
}
