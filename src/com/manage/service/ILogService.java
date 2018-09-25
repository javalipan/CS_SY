package com.manage.service;

import java.util.List;

import com.manage.dao.model.HistoryLog;
import com.manage.dao.model.HistoryLogExample;

public interface ILogService {

	int countByExample(HistoryLogExample example);
	
	List<HistoryLog> selectByExample(HistoryLogExample example);
	 
	HistoryLog selectByPrimaryKey(Long id);
	
	/** 
	* @Title: insertLoginLog 
	* @Description: 插入登录日志
	* @param content： 内容    
	* @return void     
	*/
	void insertLoginLog(String content);
	
	/** 
	* @Title: insertAddLog 
	* @Description: 插入添加日志
	* @param content： 添加内容
	* @return void     
	*/
	void insertAddLog(String content);
	
	/** 
	* @Title: insertDeleteLog 
	* @Description: 插入删除日志
	* @param content： 删除内容
	* @return void     
	*/
	void insertDeleteLog(String content);
	
	/** 
	* @Title: insertUpdateLog 
	* @Description: 插入修改日志
	* @param content：修改内容
	* @return void     
	*/
	void insertUpdateLog(String content);
	
}
