package com.wrk.shopsystem.base.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table user_oper_record
 */
public class UserOperRecord implements Serializable {
    @ApiModelProperty(value = "记录id")
    private Integer rid;

    @ApiModelProperty(value = "操作用户id")
    private Integer uid;

    @ApiModelProperty(value = "操作id")
    private Integer oid;

    @ApiModelProperty(value = "操作备注")
    private String notes;

    @ApiModelProperty(value = "操作日期")
    private Date operDate;

    @ApiModelProperty(value = "操作成功否")
    private Boolean isSucc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_oper_record
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_oper_record.rid
     *
     * @return the value of user_oper_record.rid
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_oper_record.rid
     *
     * @param rid the value for user_oper_record.rid
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_oper_record.uid
     *
     * @return the value of user_oper_record.uid
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_oper_record.uid
     *
     * @param uid the value for user_oper_record.uid
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_oper_record.oid
     *
     * @return the value of user_oper_record.oid
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_oper_record.oid
     *
     * @param oid the value for user_oper_record.oid
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_oper_record.notes
     *
     * @return the value of user_oper_record.notes
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_oper_record.notes
     *
     * @param notes the value for user_oper_record.notes
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_oper_record.oper_date
     *
     * @return the value of user_oper_record.oper_date
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Date getOperDate() {
        return operDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_oper_record.oper_date
     *
     * @param operDate the value for user_oper_record.oper_date
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_oper_record.is_succ
     *
     * @return the value of user_oper_record.is_succ
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Boolean getIsSucc() {
        return isSucc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_oper_record.is_succ
     *
     * @param isSucc the value for user_oper_record.is_succ
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setIsSucc(Boolean isSucc) {
        this.isSucc = isSucc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_oper_record
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rid=").append(rid);
        sb.append(", uid=").append(uid);
        sb.append(", oid=").append(oid);
        sb.append(", notes=").append(notes);
        sb.append(", operDate=").append(operDate);
        sb.append(", isSucc=").append(isSucc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}