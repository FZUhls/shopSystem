package com.zxy.shopsystem.base.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table employee
 */
public class Employee implements Serializable {
    private Integer eid;

    private String name;

    private String sex;

    private String idcardNumber;

    private Date birthday;

    private String politicsStatus;

    private String educationStatus;

    private Byte ismarried;

    private Date joinTime;

    private Integer salary;

    private Integer departmentNo;

    private Integer workTypeNo;

    private String notes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table employee
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.eid
     *
     * @return the value of employee.eid
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.eid
     *
     * @param eid the value for employee.eid
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.name
     *
     * @return the value of employee.name
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.name
     *
     * @param name the value for employee.name
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.sex
     *
     * @return the value of employee.sex
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.sex
     *
     * @param sex the value for employee.sex
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.idcard_number
     *
     * @return the value of employee.idcard_number
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getIdcardNumber() {
        return idcardNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.idcard_number
     *
     * @param idcardNumber the value for employee.idcard_number
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setIdcardNumber(String idcardNumber) {
        this.idcardNumber = idcardNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.birthday
     *
     * @return the value of employee.birthday
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.birthday
     *
     * @param birthday the value for employee.birthday
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.politics_status
     *
     * @return the value of employee.politics_status
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getPoliticsStatus() {
        return politicsStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.politics_status
     *
     * @param politicsStatus the value for employee.politics_status
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.education_status
     *
     * @return the value of employee.education_status
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getEducationStatus() {
        return educationStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.education_status
     *
     * @param educationStatus the value for employee.education_status
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setEducationStatus(String educationStatus) {
        this.educationStatus = educationStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.ismarried
     *
     * @return the value of employee.ismarried
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Byte getIsmarried() {
        return ismarried;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.ismarried
     *
     * @param ismarried the value for employee.ismarried
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setIsmarried(Byte ismarried) {
        this.ismarried = ismarried;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.join_time
     *
     * @return the value of employee.join_time
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Date getJoinTime() {
        return joinTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.join_time
     *
     * @param joinTime the value for employee.join_time
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.salary
     *
     * @return the value of employee.salary
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Integer getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.salary
     *
     * @param salary the value for employee.salary
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.department_no
     *
     * @return the value of employee.department_no
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Integer getDepartmentNo() {
        return departmentNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.department_no
     *
     * @param departmentNo the value for employee.department_no
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setDepartmentNo(Integer departmentNo) {
        this.departmentNo = departmentNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.work_type_no
     *
     * @return the value of employee.work_type_no
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Integer getWorkTypeNo() {
        return workTypeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.work_type_no
     *
     * @param workTypeNo the value for employee.work_type_no
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setWorkTypeNo(Integer workTypeNo) {
        this.workTypeNo = workTypeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.notes
     *
     * @return the value of employee.notes
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.notes
     *
     * @param notes the value for employee.notes
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eid=").append(eid);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", idcardNumber=").append(idcardNumber);
        sb.append(", birthday=").append(birthday);
        sb.append(", politicsStatus=").append(politicsStatus);
        sb.append(", educationStatus=").append(educationStatus);
        sb.append(", ismarried=").append(ismarried);
        sb.append(", joinTime=").append(joinTime);
        sb.append(", salary=").append(salary);
        sb.append(", departmentNo=").append(departmentNo);
        sb.append(", workTypeNo=").append(workTypeNo);
        sb.append(", notes=").append(notes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}