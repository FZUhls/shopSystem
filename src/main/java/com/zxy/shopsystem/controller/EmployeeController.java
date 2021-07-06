package com.zxy.shopsystem.controller;

import com.zxy.shopsystem.model.Department;
import com.zxy.shopsystem.model.Employee;
import com.zxy.shopsystem.model.Worktype;
import com.zxy.shopsystem.model.form.BaseResultForm;
import com.zxy.shopsystem.model.form.jsonModel.EmployeeJson;
import com.zxy.shopsystem.service.DepartmentService;
import com.zxy.shopsystem.service.EmployeeSevice;
import com.zxy.shopsystem.service.WorkTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@CrossOrigin
@RequestMapping("/employee")
@Slf4j
public class EmployeeController{

    private static final String NAMESPACE_FIND = "/find";
    private static final String NAMESPACE_UPDATE = "/update";
    private static final String NAMESPACE_DELETE = "/delete";
    private static final String NAMESPACE_INSERT = "/insert";
    private static final String FIND_ALL = NAMESPACE_FIND+"/findAll";
    private static final String FIND_BY_CONDITION = NAMESPACE_FIND+"/findByCondition";
    private static final String DELETE_BY_Key = NAMESPACE_DELETE+"/deleteByKey";
    private static final String INSERT_ONE = NAMESPACE_INSERT+"/insertOne";
    private static final String UPDATE_BD_ID = NAMESPACE_UPDATE+"/update";
    @Autowired
    EmployeeSevice employeeSevice;
    @Autowired
    WorkTypeService workTypeService;
    @Autowired
    DepartmentService departmentService;
    @GetMapping("")
    public String employee(Model model){
        List<Worktype> worktypes = workTypeService.findAll();
        List<Department> departments = departmentService.findAll();
        model.addAttribute("title","职员管理");
        model.addAttribute("workTypes",worktypes);
        model.addAttribute("departments",departments);
        return "/employee/emploTable";
    }


    @PostMapping(FIND_ALL)
    @ResponseBody
    public BaseResultForm<List<EmployeeJson>> findAll(){
        List<EmployeeJson> employees = employeeSevice.findAll();
        BaseResultForm<List<EmployeeJson>> form = new BaseResultForm<>();
        if(employees==null || employees.isEmpty()){
            form.fail();
            form.setResultMsg("no found");
        }else {
            form.succ();
            form.setResult(employees);
        }
        log.info("find all employees");
        return form;
    }
    @PostMapping(FIND_BY_CONDITION)
    @ResponseBody
    public BaseResultForm<List<EmployeeJson>> findByCondition(Integer eid,String name,Integer department,Integer type){
        BaseResultForm<List<EmployeeJson>> form = new BaseResultForm<>();
        List<EmployeeJson> list = null;
        try {
            list = employeeSevice.selectByCondition(eid,name,department,type);
        }catch (Exception e){
            form.fail();
            log.error(e.getMessage());
            form.setResultMsg("find noting");
            return form;
        }
        form.succ();
        form.setResult(list);
        return form;
    }
    @PostMapping(DELETE_BY_Key)
    @ResponseBody
    public BaseResultForm deleteById(Integer id){
        BaseResultForm form = new BaseResultForm();
        try {
            if (employeeSevice.deleteById(id)){
                form.succ();
            }else {
                form.fail();
                form.setResultMsg("删除失败，请稍后再尝试");
            }
        }catch (Exception e){
            form.fail();
            if (e instanceof DataIntegrityViolationException){
                List<EmployeeJson> employeeJsons = null;
                try {
                    employeeJsons = employeeSevice.selectByCondition(id,null,null,null);
                }catch (Exception ee){
                    log.error(ee.getMessage());
                }
                form.setResultMsg("不能删除部门领导,任职部门： "+employeeJsons.get(0).getDepartment());
            }else {
                form.setResultMsg("删除失败，请稍后再尝试");
            }
            log.error(e.getClass().toString());
        }
        return form;
    }
    @PostMapping(INSERT_ONE)
    @ResponseBody
    public BaseResultForm insertOne(String name, String sex, String idCard
            , String birthday, Byte ismarried, String politicsStatus
        , String educationStatus, Integer workTypeNo, Integer departmentNo
            ,String  joinTime,Integer salary,String notes){
        BaseResultForm form = new BaseResultForm();
        try {
            employeeSevice.insert(name, sex, idCard, birthday, ismarried
                    , politicsStatus, educationStatus, workTypeNo, departmentNo, joinTime, salary, notes);
        }catch (Exception e){
            log.error(e.getMessage());
            form.fail();
            form.setResultMsg(e.getMessage());
            return form;
        }
        form.succ();
        return form;
    }
    @GetMapping(UPDATE_BD_ID)
    @ResponseBody
    public BaseResultForm updateById(Employee employee){
        BaseResultForm form = new BaseResultForm();
        if (employeeSevice.update(employee)){
            form.succ();
        }else {
            form.fail();
        }
        return form;
    }
}
