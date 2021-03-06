package com.wrk.shopsystem.base.mapper;

import com.wrk.shopsystem.base.model.DepartmentType;
import com.wrk.shopsystem.base.model.DepartmentTypeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DepartmentTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    long countByExample(DepartmentTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int deleteByExample(DepartmentTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int deleteByPrimaryKey(Integer tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int insert(DepartmentType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int insertSelective(DepartmentType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    List<DepartmentType> selectByExample(DepartmentTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    DepartmentType selectByPrimaryKey(Integer tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByExampleSelective(@Param("record") DepartmentType record, @Param("example") DepartmentTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByExample(@Param("record") DepartmentType record, @Param("example") DepartmentTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByPrimaryKeySelective(DepartmentType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department_type
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByPrimaryKey(DepartmentType record);
}