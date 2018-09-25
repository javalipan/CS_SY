package com.manage.service.impl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.manage.dao.mapper.HistoryLogMapper;
import com.manage.dao.model.HistoryLog;
import com.manage.dao.model.HistoryLogExample;
import com.manage.dao.model.User;
import com.manage.service.ILogService;

@Service(value="logService")
public class LogService implements ILogService{
	
	@Autowired
	HistoryLogMapper historyLogMapper;

	public int countByExample(HistoryLogExample example) {
		return historyLogMapper.countByExample(example);
	}

	public void insertAddLog(String content) {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest(); 
		User user= (User) request.getSession().getAttribute("USER_INFO_CASHIER");
		HistoryLog historyLog=new HistoryLog();
		historyLog.setContent(content);
		historyLog.setIpaddress(request.getRemoteHost());
		historyLog.setOperatetime(new Date());
		historyLog.setUserid(user.getId());
		historyLog.setLogtype("1");
		historyLog.setOperatetype("0");
		historyLogMapper.insertSelective(historyLog);
	}

	public void insertDeleteLog(String content) {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest(); 
		User user= (User) request.getSession().getAttribute("USER_INFO_CASHIER");
		HistoryLog historyLog=new HistoryLog();
		historyLog.setContent(content);
		historyLog.setIpaddress(request.getRemoteHost());
		historyLog.setOperatetime(new Date());
		historyLog.setUserid(user.getId());
		historyLog.setLogtype("1");
		historyLog.setOperatetype("2");
		historyLogMapper.insertSelective(historyLog);
	}

	public void insertLoginLog(String content) {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest(); 
		User user= (User) request.getSession().getAttribute("USER_INFO_CASHIER");
		HistoryLog historyLog=new HistoryLog();
		historyLog.setContent(content);
		historyLog.setIpaddress(request.getRemoteHost());
		historyLog.setOperatetime(new Date());
		historyLog.setUserid(user.getId());
		historyLog.setLogtype("0");
		historyLog.setOperatetype("3");
		historyLogMapper.insertSelective(historyLog);
	}

	public void insertUpdateLog(String content) {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest(); 
		User user= (User) request.getSession().getAttribute("USER_INFO_CASHIER");
		HistoryLog historyLog=new HistoryLog();
		historyLog.setContent(content);
		historyLog.setIpaddress(request.getRemoteHost());
		historyLog.setOperatetime(new Date());
		historyLog.setUserid(user.getId());
		historyLog.setLogtype("1");
		historyLog.setOperatetype("2");
		historyLogMapper.insertSelective(historyLog);
	}

	public List<HistoryLog> selectByExample(HistoryLogExample example) {
		return historyLogMapper.selectByExample(example);
	}

	public HistoryLog selectByPrimaryKey(Long id) {
		return historyLogMapper.selectByPrimaryKey(id);
	}

	
}
