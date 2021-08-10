package com.zxy.shopsystem.base.mapper;

import com.zxy.shopsystem.base.model.SupplierType;
import com.zxy.shopsystem.base.model.SupplierTypeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SupplierTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    long countByExample(SupplierTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int deleteByExample(SupplierTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int deleteByPrimaryKey(Integer tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int insert(SupplierType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int insertSelective(SupplierType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    List<SupplierType> selectByExample(SupplierTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    SupplierType selectByPrimaryKey(Integer tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByExampleSelective(@Param("record") SupplierType record, @Param("example") SupplierTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByExample(@Param("record") SupplierType record, @Param("example") SupplierTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByPrimaryKeySelective(SupplierType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByPrimaryKey(SupplierType record);
}