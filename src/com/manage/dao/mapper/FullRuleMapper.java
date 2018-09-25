package com.manage.dao.mapper;

import com.manage.dao.model.FullRule;
import com.manage.dao.model.FullRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FullRuleMapper {
    int countByExample(FullRuleExample example);

    int deleteByExample(FullRuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FullRule record);

    int insertSelective(FullRule record);

    List<FullRule> selectByExample(FullRuleExample example);

    FullRule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FullRule record, @Param("example") FullRuleExample example);

    int updateByExample(@Param("record") FullRule record, @Param("example") FullRuleExample example);

    int updateByPrimaryKeySelective(FullRule record);

    int updateByPrimaryKey(FullRule record);
}