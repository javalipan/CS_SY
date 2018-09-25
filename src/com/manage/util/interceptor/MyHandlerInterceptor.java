package com.manage.util.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.manage.dao.model.User;


public class MyHandlerInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String url = request.getRequestURI();
		if(url.endsWith(".action")){	//拦截后台管理
			String path = request.getContextPath();
			String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
			if(request.getSession().getAttribute("USER_INFO_CASHIER")==null){
				response.sendRedirect(basePath+ "/manage/initLogin.do");	
				return false;
			}
			else{
				User user=(User) request.getSession().getAttribute("USER_INFO_CASHIER");
				if(!"2".equals(user.getType())){
					response.sendRedirect(basePath+ "/manage/initLogin.do");	
					return false;
				}
			}
		}
		return true;
	}
	
}
