package com.manage.service;

import java.util.List;

import com.manage.dao.model.RechargeRule;
import com.manage.dao.model.RechargeRuleExample;

public interface IRechargeRuleService {
	
	int countByExample(RechargeRuleExample example);

    int deleteByExample(RechargeRuleExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(RechargeRule record);

    List<RechargeRule> selectByExample(RechargeRuleExample example);

    RechargeRule selectByPrimaryKey(Long id);

    int updateByExample(RechargeRule record, RechargeRuleExample example);

    int updateByPrimaryKeySelective(RechargeRule record);

}
