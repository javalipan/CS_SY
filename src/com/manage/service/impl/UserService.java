package com.manage.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.dao.mapper.UserMapper;
import com.manage.dao.model.User;
import com.manage.dao.model.UserExample;
import com.manage.service.ILogService;
import com.manage.service.IUserService;

@Service(value="userService")
public class UserService implements IUserService {
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ILogService logService;

	public int countByExample(UserExample example) {
		return userMapper.countByExample(example);
	}

	public int deleteByExample(UserExample example) {
		int i= userMapper.deleteByExample(example);
		if(i>0){
			logService.insertDeleteLog("删除用户");
		}
		return i;
	}

	public int deleteByPrimaryKey(String id) {
		int i= userMapper.deleteByPrimaryKey(id);
		if(i>0){
			logService.insertDeleteLog("删除用户:"+id);
		}
		return i;
	}

	public int insert(User record) {
		int i= userMapper.insert(record);
		if(i>0){
			logService.insertAddLog("添加用户:"+record.getName());
		}
		return i;
	}

	public List<User> selectByExample(UserExample example) {
		return userMapper.selectByExample(example);
	}

	public User selectByPrimaryKey(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKey(User record) {
		int i= userMapper.updateByPrimaryKey(record);
		if(i>0){
			logService.insertUpdateLog("修改用户:"+record.getName());
		}
		return i;
	}

	public int updateByPrimaryKeySelective(User record) {
		int i= userMapper.updateByPrimaryKeySelective(record);
		if(i>0){
			logService.insertUpdateLog("修改用户:"+record.getName());
		}
		return i;
	}

	public void deleteByIds(String ids) {
		String strs[]=ids.split(",");
		List<String> idlist=new ArrayList<String>();
		for(String str:strs){
			idlist.add(str);
		}
		UserExample userExample=new UserExample();
		UserExample.Criteria crit=userExample.createCriteria();
		crit.andIdIn(idlist);
		userMapper.deleteByExample(userExample);
		logService.insertUpdateLog("删除用户:"+ids);
	}

	public int insert_register(User record) {
		return userMapper.insert(record);
	}


}
