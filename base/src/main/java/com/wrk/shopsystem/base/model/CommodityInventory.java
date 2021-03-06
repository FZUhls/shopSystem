package com.wrk.shopsystem.base.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table commodity_inventory
 */
public class CommodityInventory implements Serializable {
    private Integer cno;

    @ApiModelProperty(value = "商品所属部门（仓库或门店）的id")
    private Integer dno;

    private Integer count;

    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table commodity_inventory
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_inventory.cno
     *
     * @return the value of commodity_inventory.cno
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Integer getCno() {
        return cno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_inventory.cno
     *
     * @param cno the value for commodity_inventory.cno
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setCno(Integer cno) {
        this.cno = cno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_inventory.dno
     *
     * @return the value of commodity_inventory.dno
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Integer getDno() {
        return dno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_inventory.dno
     *
     * @param dno the value for commodity_inventory.dno
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setDno(Integer dno) {
        this.dno = dno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_inventory.count
     *
     * @return the value of commodity_inventory.count
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_inventory.count
     *
     * @param count the value for commodity_inventory.count
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_inventory.note
     *
     * @return the value of commodity_inventory.note
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_inventory.note
     *
     * @param note the value for commodity_inventory.note
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_inventory
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cno=").append(cno);
        sb.append(", dno=").append(dno);
        sb.append(", count=").append(count);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}