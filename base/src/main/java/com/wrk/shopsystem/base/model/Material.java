package com.wrk.shopsystem.base.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table material
 */
public class Material implements Serializable {
    private Integer mno;

    private String name;

    private String notes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table material
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.mno
     *
     * @return the value of material.mno
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Integer getMno() {
        return mno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.mno
     *
     * @param mno the value for material.mno
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setMno(Integer mno) {
        this.mno = mno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.name
     *
     * @return the value of material.name
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.name
     *
     * @param name the value for material.name
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.notes
     *
     * @return the value of material.notes
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.notes
     *
     * @param notes the value for material.notes
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mno=").append(mno);
        sb.append(", name=").append(name);
        sb.append(", notes=").append(notes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}