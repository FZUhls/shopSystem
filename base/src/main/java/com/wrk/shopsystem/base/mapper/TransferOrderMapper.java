package com.wrk.shopsystem.base.mapper;

import com.wrk.shopsystem.base.model.TransferOrder;
import com.wrk.shopsystem.base.model.TransferOrderExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TransferOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    long countByExample(TransferOrderExample example);

    Integer getIndex();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int deleteByExample(TransferOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int deleteByPrimaryKey(Integer tno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int insert(TransferOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int insertSelective(TransferOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    List<TransferOrder> selectByExample(TransferOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    TransferOrder selectByPrimaryKey(Integer tno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByExampleSelective(@Param("record") TransferOrder record, @Param("example") TransferOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByExample(@Param("record") TransferOrder record, @Param("example") TransferOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByPrimaryKeySelective(TransferOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    int updateByPrimaryKey(TransferOrder record);
}