package com.manage.service;

import java.util.List;

import com.manage.dao.model.FullRule;
import com.manage.dao.model.FullRuleExample;

public interface IFullRuleService {

	int countByExample(FullRuleExample example);

    int deleteByExample(FullRuleExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(FullRule record);

    List<FullRule> selectByExample(FullRuleExample example);

    FullRule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FullRule record);

}
