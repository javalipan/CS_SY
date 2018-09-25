package com.manage.service;

import java.util.List;

import com.manage.dao.model.Member;
import com.manage.dao.model.MemberExample;

public interface IMemberService {

	int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Member record);

}
