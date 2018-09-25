package com.manage.service;

import java.util.List;

import net.sf.json.JSONObject;

import com.manage.dao.model.Order;
import com.manage.dao.model.OrderExample;

public interface IOrderService {

	int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Long id);
    
    int updateByExampleSelective(Order record, OrderExample example);

    int updateByPrimaryKeySelective(Order record);

//    boolean saveOrder(Order order,String orderJson,Integer exchange,boolean joinpoints)throws Exception;
    
    boolean saveOrder(Order order,String orderJson,Integer exchange,boolean joinpoints,Double balancepay,String couponids)throws Exception;
    
    public JSONObject initPrintPage(Long orderid) throws Exception;
}
