package com.manage.service;

import java.util.List;

import com.manage.dao.model.OrderDetail;
import com.manage.dao.model.OrderDetailExample;

public interface IOrderDetailService {

	int countByExample(OrderDetailExample example);

    int deleteByExample(OrderDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderDetail record);

    List<OrderDetail> selectByExample(OrderDetailExample example);

    OrderDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderDetail record);

}
