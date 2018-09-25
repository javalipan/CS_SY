package com.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.dao.mapper.MemberMapper;
import com.manage.dao.model.Member;
import com.manage.dao.model.MemberExample;
import com.manage.service.IMemberService;

@Service
public class MemberService implements IMemberService {

	@Autowired
	private MemberMapper memberMapper;

	public int countByExample(MemberExample example) {
		return memberMapper.countByExample(example);
	}

	public int deleteByExample(MemberExample example) {
		return memberMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Long id) {
		return memberMapper.deleteByPrimaryKey(id);
	}

	public int insertSelective(Member record) {
		return memberMapper.insertSelective(record);
	}

	public List<Member> selectByExample(MemberExample example) {
		return memberMapper.selectByExample(example);
	}

	public Member selectByPrimaryKey(Long id) {
		return memberMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Member record) {
		return memberMapper.updateByPrimaryKeySelective(record);
	}

}
