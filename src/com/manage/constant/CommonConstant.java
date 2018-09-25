package com.manage.constant;

public interface CommonConstant {

	/**正常*/
	public static final String STATUS_NORMAL = "0";
	/**禁用*/
	public static final String STATUS_DISABLE = "1";
	
	/**未发布*/
	public static final String STATUS_UNPUBLICSH="0";
	/**已发布*/
	public static final String STATUS_PUBLICSH="1";
	/**已出售*/
	public static final String STATUS_SOLD="2";
	
	
	/**日志操作类型*/
	/**添加*/
	public static final String ADD="0";
	/**删除*/
	public static final String DELETE="1";
	/**修改*/
	public static final String UPDATE="2";
	/**登录*/
	public static final String LOGIN="3";
	
	/**系统管理员角色id*/
	public static final String ADMINROLE="b238e5ab-d8c5-4b5d-94f0-26bd50195961";
	
	/**新闻*/
	public static final String INFO_TYPE_NEWS="1401";
	/**动态*/
	public static final String INFO_TYPE_DYN="1402";
	/**其他*/
	public static final String INFO_TYPE_OTHERS="1403";
	
	/**
	 * 积分兑换比例
	 */
	public static final int INT_WEIGHT=20;
	/**
	 * 积分兑换倍数，只能兑换此数额的整数倍
	 */
	public static final int INT_TIMES=1000;
	
	/**
	 * 购买周期
	 */
	public static final String BUYPERIOD="BUYPERIOD";
	
	/**
	 * 注册赠送优惠券id
	 */
	public static final Long REGISTE_COUPON_ID=1l;
	/**
	 * 被邀请人优惠券id
	 */
	public static final Long INVITED_COUPON_ID=2l;
	/**
	 * 邀请人优惠券id
	 */
	public static final Long INVITER_COUPON_ID=3l;
}
