package com.manage.service;

import java.util.List;

import com.manage.dao.model.Member;
import com.manage.dao.model.Recharge;
import com.manage.dao.model.RechargeExample;

public interface IRechargeService {
	int countByExample(RechargeExample example);

    int deleteByExample(RechargeExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(Recharge record);

    List<Recharge> selectByExample(RechargeExample example);

    Recharge selectByPrimaryKey(Long id);

    int updateByExampleSelective(Recharge record, RechargeExample example);

    int updateByPrimaryKeySelective(Recharge record);

    Member recharge(Long memberid,Long ruleid,Integer amount,Integer giveamount,Double discount);
}
