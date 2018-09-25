package com.manage.query.mapper;

import org.apache.ibatis.annotations.Param;

import com.manage.query.model.OrderQuery;

public interface OrderQueryMapper {

	public OrderQuery getBrandLabel(@Param("memberid")Long memberid);
	public OrderQuery getStyleLabel(@Param("memberid")Long memberid);
	public OrderQuery getSizeLabel(@Param("memberid")Long memberid);
	public OrderQuery getOrderCnt(@Param("memberid")Long memberid);
}
