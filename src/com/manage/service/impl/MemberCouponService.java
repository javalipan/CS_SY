package com.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.dao.mapper.MemberCouponMapper;
import com.manage.dao.model.MemberCoupon;
import com.manage.dao.model.MemberCouponExample;
import com.manage.service.IMemberCouponService;
@Service
public class MemberCouponService implements IMemberCouponService {

	@Autowired
	private MemberCouponMapper memberCouponMapper;
	
	public int countByExample(MemberCouponExample example) {
		return memberCouponMapper.countByExample(example);
	}

	public int deleteByExample(MemberCouponExample example) {
		return memberCouponMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Long id) {
		return memberCouponMapper.deleteByPrimaryKey(id);
	}

	public int insertSelective(MemberCoupon record) {
		return memberCouponMapper.insertSelective(record);
	}

	public List<MemberCoupon> selectByExample(MemberCouponExample example) {
		return memberCouponMapper.selectByExample(example);
	}

	public MemberCoupon selectByPrimaryKey(Long id) {
		return memberCouponMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(MemberCoupon record) {
		return memberCouponMapper.updateByPrimaryKeySelective(record);
	}

}
