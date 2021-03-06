package com.wrk.shopsystem.base.mapper;

import com.wrk.shopsystem.base.model.Color;
import com.wrk.shopsystem.base.model.ColorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ColorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    long countByExample(ColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int deleteByExample(ColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int deleteByPrimaryKey(Integer cno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int insert(Color record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int insertSelective(Color record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    List<Color> selectByExample(ColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    Color selectByPrimaryKey(Integer cno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByExampleSelective(@Param("record") Color record, @Param("example") ColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByExample(@Param("record") Color record, @Param("example") ColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByPrimaryKeySelective(Color record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByPrimaryKey(Color record);
}