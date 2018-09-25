package com.manage.dao.mapper;

import com.manage.dao.model.MemberTypeChange;
import com.manage.dao.model.MemberTypeChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberTypeChangeMapper {
    int countByExample(MemberTypeChangeExample example);

    int deleteByExample(MemberTypeChangeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberTypeChange record);

    int insertSelective(MemberTypeChange record);

    List<MemberTypeChange> selectByExample(MemberTypeChangeExample example);

    MemberTypeChange selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberTypeChange record, @Param("example") MemberTypeChangeExample example);

    int updateByExample(@Param("record") MemberTypeChange record, @Param("example") MemberTypeChangeExample example);

    int updateByPrimaryKeySelective(MemberTypeChange record);

    int updateByPrimaryKey(MemberTypeChange record);
}