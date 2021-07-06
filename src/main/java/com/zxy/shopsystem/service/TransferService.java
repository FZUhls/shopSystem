package com.zxy.shopsystem.service;

import com.zxy.shopsystem.model.form.jsonModel.DistributeDetail;
import com.zxy.shopsystem.model.form.jsonModel.DistributeForm;
import com.zxy.shopsystem.model.form.jsonModel.TransferOrderJson;

import java.util.List;

public interface TransferService {
    List<TransferOrderJson> selectByCondition(Integer fromNo, Integer destinNo, String date) throws Exception;
    Boolean submit(DistributeForm distributeForm) throws Exception;
    List<DistributeDetail> queryDetail(Integer tno);
}
