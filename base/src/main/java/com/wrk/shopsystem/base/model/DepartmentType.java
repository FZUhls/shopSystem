package com.wrk.shopsystem.base.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table department_type
 */
public class DepartmentType implements Serializable {
    private Integer tid;

    private String name;

    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table department_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_type.tid
     *
     * @return the value of department_type.tid
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_type.tid
     *
     * @param tid the value for department_type.tid
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_type.name
     *
     * @return the value of department_type.name
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_type.name
     *
     * @param name the value for department_type.name
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_type.note
     *
     * @return the value of department_type.note
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_type.note
     *
     * @param note the value for department_type.note
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tid=").append(tid);
        sb.append(", name=").append(name);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}