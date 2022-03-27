package com.wrk.shopsystem.base.service;

import com.wrk.shopsystem.base.model.form.jsonModel.DistributeDetail;
import com.wrk.shopsystem.base.model.form.jsonModel.DistributeForm;
import com.wrk.shopsystem.base.model.form.jsonModel.TransferOrderJson;

import java.util.List;

public interface TransferService {
    List<TransferOrderJson> selectByCondition(Integer fromNo, Integer destinNo, String date) throws Exception;
    Boolean submit(DistributeForm distributeForm) throws Exception;
    List<DistributeDetail> queryDetail(Integer tno);
}
