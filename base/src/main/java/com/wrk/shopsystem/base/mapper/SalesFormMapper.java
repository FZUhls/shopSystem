package com.wrk.shopsystem.base.mapper;

import com.wrk.shopsystem.base.model.SalesForm;
import com.wrk.shopsystem.base.model.SalesFormExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SalesFormMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    long countByExample(SalesFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int deleteByExample(SalesFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int insert(SalesForm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int insertSelective(SalesForm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    List<SalesForm> selectByExample(SalesFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    SalesForm selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByExampleSelective(@Param("record") SalesForm record, @Param("example") SalesFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByExample(@Param("record") SalesForm record, @Param("example") SalesFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByPrimaryKeySelective(SalesForm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_form
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByPrimaryKey(SalesForm record);
}