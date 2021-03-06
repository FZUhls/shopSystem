package com.wrk.shopsystem.base.mapper;

import com.wrk.shopsystem.base.model.PurchaseOrder;
import com.wrk.shopsystem.base.model.PurchaseOrderExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PurchaseOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    long countByExample(PurchaseOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int deleteByExample(PurchaseOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int deleteByPrimaryKey(Integer pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int insert(PurchaseOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int insertSelective(PurchaseOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    List<PurchaseOrder> selectByExample(PurchaseOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    PurchaseOrder selectByPrimaryKey(Integer pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByExampleSelective(@Param("record") PurchaseOrder record, @Param("example") PurchaseOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByExample(@Param("record") PurchaseOrder record, @Param("example") PurchaseOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByPrimaryKeySelective(PurchaseOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByPrimaryKey(PurchaseOrder record);
}