package com.manage.dao.mapper;

import com.manage.dao.model.MemberLabel;
import com.manage.dao.model.MemberLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberLabelMapper {
    int countByExample(MemberLabelExample example);

    int deleteByExample(MemberLabelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberLabel record);

    int insertSelective(MemberLabel record);

    List<MemberLabel> selectByExample(MemberLabelExample example);

    MemberLabel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberLabel record, @Param("example") MemberLabelExample example);

    int updateByExample(@Param("record") MemberLabel record, @Param("example") MemberLabelExample example);

    int updateByPrimaryKeySelective(MemberLabel record);

    int updateByPrimaryKey(MemberLabel record);
}