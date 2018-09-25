package com.manage.service;

import java.util.List;

import com.manage.dao.model.User;
import com.manage.dao.model.UserExample;

public interface IUserService {
	int countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(String id);

	int insert(User record);
	
	int insert_register(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
	
	/** 
	* @Title: deleteByIds 
	* @Description: 根据ids删除，逗号隔开
	* @param ids: id列表
	* @return void     
	*/
	void deleteByIds(String ids);
}
