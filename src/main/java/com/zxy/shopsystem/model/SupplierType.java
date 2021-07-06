package com.zxy.shopsystem.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table supplier_type
 */
public class SupplierType implements Serializable {
    private Integer tid;

    private String tname;

    private String notes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table supplier_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_type.tid
     *
     * @return the value of supplier_type.tid
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_type.tid
     *
     * @param tid the value for supplier_type.tid
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_type.tname
     *
     * @return the value of supplier_type.tname
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getTname() {
        return tname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_type.tname
     *
     * @param tname the value for supplier_type.tname
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setTname(String tname) {
        this.tname = tname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_type.notes
     *
     * @return the value of supplier_type.notes
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_type.notes
     *
     * @param notes the value for supplier_type.notes
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_type
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
        sb.append(", tname=").append(tname);
        sb.append(", notes=").append(notes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}