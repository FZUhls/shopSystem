package com.zxy.shopsystem.base.service.impl;

import com.zxy.shopsystem.base.dao.EmployeeDao;
import com.zxy.shopsystem.base.model.Employee;
import com.zxy.shopsystem.base.model.EmployeeExample;
import com.zxy.shopsystem.base.model.form.jsonModel.EmployeeJson;
import com.zxy.shopsystem.base.mapper.EmployeeMapper;
import com.zxy.shopsystem.base.service.EmployeeSevice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;
@Service
@Slf4j
public class EmployeeSeviceImpl implements EmployeeSevice {
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    EmployeeDao employeeDao;

    public Employee selectByPrimaryKey(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    public List<EmployeeJson> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public List<EmployeeJson> selectByCondition(Integer eid, String name, Integer departmentNo, Integer workTypeNo) throws Exception{
        List <EmployeeJson> employeeJsons = null;
        try {
            employeeJsons = employeeDao.findByCondition(eid,name,departmentNo,workTypeNo);
            if (employeeJsons==null || employeeJsons.isEmpty()){
                throw new Exception("no found");
            }
        }catch (Exception e){
            throw e;
        }
        return employeeJsons;
    }
    public Boolean deleteById(Integer id) throws Exception {
        try {
            int num = employeeMapper.deleteByPrimaryKey(id);
            if (num<1){
                throw new Exception("no this id");
            }

        }catch (Exception e){
            log.error("deleting in Employee happens a error : "+e.getMessage());
            throw e;
        }
        return true;
    }
    @Override
    public Boolean insert(String name, String sex, String idCard
            , String birthday, Byte ismarried, String politicsStatus
            , String educationStatus, Integer workTypeNo, Integer departmentNo
            , String joinTime, Integer salary, String notes) throws Exception {

        Employee employee = new Employee();
        try {

            Integer eid = employeeDao.findLarge()+1;
            employee.setEid(eid);
            if (name==null || name == "" || sex==null || sex == ""
            || idCard==null || idCard == "" || birthday==null || birthday == "" || ismarried==null || politicsStatus==null
            || politicsStatus=="" || educationStatus==null || educationStatus=="" || workTypeNo==null
            || departmentNo==null || joinTime==null || joinTime=="" || salary== null){
                throw new Exception("信息不全");
            }
            if (idCard.length()!=18){
                throw new Exception("身份证位数不正确");
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            employee.setName(name);
            employee.setSex(sex);

            employee.setIdcardNumber(idCard);
            employee.setBirthday(simpleDateFormat.parse(birthday));
            employee.setIsmarried(ismarried);
            employee.setPoliticsStatus(politicsStatus);
            employee.setEducationStatus(educationStatus);
            employee.setWorkTypeNo(workTypeNo);
            employee.setDepartmentNo(departmentNo);
            employee.setJoinTime(simpleDateFormat.parse(joinTime));
            employee.setSalary(salary);
            employee.setNotes(notes);
            employeeMapper.insert(employee);
        }catch (Exception e){
            log.error("inserting " + employee.getEid() + " into Employee happens a error : "+e.getMessage());
            throw e;
        }
        return true;
    }
    @Override
    public Boolean insertBatch(List<Employee> employees) {
        return true;
    }
    public Boolean update(Employee employee){
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andEidEqualTo(employee.getEid());
        if(employeeMapper.updateByExampleSelective(employee,employeeExample) >0){
            log.info("update employee success");
            return true;
        }else {
            return false;
        }
    }
}
