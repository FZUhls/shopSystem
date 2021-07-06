package com.zxy.shopsystem.dao;

import com.zxy.shopsystem.model.form.jsonModel.DistributeDetail;
import com.zxy.shopsystem.model.form.jsonModel.TransferOrderJson;

import java.util.Date;
import java.util.List;

public interface TransferOrderDao {
    List<TransferOrderJson> findByCondition(Integer fromNo, Integer destinNo, Date date);
    List<DistributeDetail> queryDetail(Integer tno);
}
