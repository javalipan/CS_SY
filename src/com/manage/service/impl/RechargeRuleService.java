package com.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.dao.mapper.RechargeRuleMapper;
import com.manage.dao.model.RechargeRule;
import com.manage.dao.model.RechargeRuleExample;
import com.manage.service.IRechargeRuleService;

@Service
public class RechargeRuleService implements IRechargeRuleService {
	
	@Autowired
	private RechargeRuleMapper rechargeRuleMapper;

	public int countByExample(RechargeRuleExample example) {
		return rechargeRuleMapper.countByExample(example);
	}

	public int deleteByExample(RechargeRuleExample example) {
		return rechargeRuleMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Long id) {
		return rechargeRuleMapper.deleteByPrimaryKey(id);
	}

	public int insertSelective(RechargeRule record) {
		return rechargeRuleMapper.insertSelective(record);
	}

	public List<RechargeRule> selectByExample(RechargeRuleExample example) {
		return rechargeRuleMapper.selectByExample(example);
	}

	public RechargeRule selectByPrimaryKey(Long id) {
		return rechargeRuleMapper.selectByPrimaryKey(id);
	}

	public int updateByExample(RechargeRule record, RechargeRuleExample example) {
		return rechargeRuleMapper.updateByExampleSelective(record, example);
	}

	public int updateByPrimaryKeySelective(RechargeRule record) {
		return rechargeRuleMapper.updateByPrimaryKeySelective(record);
	}

}
