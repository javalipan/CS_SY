package com.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.dao.mapper.FullRuleMapper;
import com.manage.dao.model.FullRule;
import com.manage.dao.model.FullRuleExample;
import com.manage.service.IFullRuleService;

@Service
public class FullRuleService implements IFullRuleService {

	@Autowired
	private FullRuleMapper fullRuleMapper;
	
	public int countByExample(FullRuleExample example) {
		return fullRuleMapper.countByExample(example);
	}

	public int deleteByExample(FullRuleExample example) {
		return fullRuleMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Long id) {
		return fullRuleMapper.deleteByPrimaryKey(id);
	}

	public int insertSelective(FullRule record) {
		return fullRuleMapper.insertSelective(record);
	}

	public List<FullRule> selectByExample(FullRuleExample example) {
		return fullRuleMapper.selectByExample(example);
	}

	public FullRule selectByPrimaryKey(Long id) {
		return fullRuleMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(FullRule record) {
		return fullRuleMapper.updateByPrimaryKeySelective(record);
	}

}
