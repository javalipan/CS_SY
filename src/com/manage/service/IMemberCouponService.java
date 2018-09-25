package com.manage.service;

import java.util.List;

import com.manage.dao.model.MemberCoupon;
import com.manage.dao.model.MemberCouponExample;

public interface IMemberCouponService {

	int countByExample(MemberCouponExample example);

	int deleteByExample(MemberCouponExample example);

	int deleteByPrimaryKey(Long id);

	int insertSelective(MemberCoupon record);

	List<MemberCoupon> selectByExample(MemberCouponExample example);

	MemberCoupon selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(MemberCoupon record);

}
