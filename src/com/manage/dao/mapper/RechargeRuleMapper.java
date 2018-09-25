package com.manage.dao.mapper;

import com.manage.dao.model.RechargeRule;
import com.manage.dao.model.RechargeRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeRuleMapper {
    int countByExample(RechargeRuleExample example);

    int deleteByExample(RechargeRuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RechargeRule record);

    int insertSelective(RechargeRule record);

    List<RechargeRule> selectByExample(RechargeRuleExample example);

    RechargeRule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RechargeRule record, @Param("example") RechargeRuleExample example);

    int updateByExample(@Param("record") RechargeRule record, @Param("example") RechargeRuleExample example);

    int updateByPrimaryKeySelective(RechargeRule record);

    int updateByPrimaryKey(RechargeRule record);
}