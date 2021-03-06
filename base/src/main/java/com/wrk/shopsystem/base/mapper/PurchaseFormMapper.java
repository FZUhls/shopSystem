package com.wrk.shopsystem.base.mapper;

import com.wrk.shopsystem.base.model.PurchaseForm;
import com.wrk.shopsystem.base.model.PurchaseFormExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PurchaseFormMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    long countByExample(PurchaseFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int deleteByExample(PurchaseFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int insert(PurchaseForm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int insertSelective(PurchaseForm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    List<PurchaseForm> selectByExample(PurchaseFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    PurchaseForm selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByExampleSelective(@Param("record") PurchaseForm record, @Param("example") PurchaseFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByExample(@Param("record") PurchaseForm record, @Param("example") PurchaseFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByPrimaryKeySelective(PurchaseForm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByPrimaryKey(PurchaseForm record);
}