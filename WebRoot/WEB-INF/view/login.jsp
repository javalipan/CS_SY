<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>收银系统统登录</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8"/>
	<jsp:include page="/tags.jsp"></jsp:include>
	<style type="text/css">
		* html,* html body{background-image:url(about:blank);background-attachment:fixed;}
		html{color:#000;background-color:#F2F2F2;}
		body,div,dl,dt,dd,ul,ol,li,h1,h2,h3,h4,h5,h6,pre,form,fieldset,input,textarea,p,blockquote,th,td{margin:0;padding:0;}
		table {border-collapse:collapse;border-spacing:0;}
		img,button,input {vertical-align:middle;border:none;}
		label{font-size:12px;color:#666;cursor:pointer;}
		a,span{color:#666;font-size:12px;text-decoration:none;}
		a:hover{text-decoration:underline;}
		address,caption,cite,code,dfn,em,strong,th,var{font-style:normal;font-weight:normal;}
		ol,ul,li{list-style:none;list-style-type: none;}
		h1,h2,h3,h4,h5,h6{font-size:100%;overflow:hidden;}
		
    	header {width:660px;margin:0 auto;font-size:28px;font-weight:bold;margin-top:20px;color:#ccc;text-shadow:1px 1px 1px #fff;font-family: 'revolt',georgia,'Microsoft yahei';}
		.content {width:350px;margin:90px auto auto;padding:30px 40px;border:2px solid #ccc;border-radius:10px;box-shadow:0 0 30px #ccc;margin-top:10%;}
		.ipt {border:1px solid #ddd;padding:10px 5px;width: 240px;outline:none;border-radius:3px;background-color:#fff;font-family: 'revolt',georgia,'Microsoft yahei';}
		.ipt:focus {background-color:#fefefe;box-shadow:0 0 3px #aaa;}
		.thead {font-weight:bold;font-size:20px;padding-bottom:20px!important;text-shadow:1px 1px 1px #fff;}
		.content th {color:#666;font-size:12px;font-weight:bold;text-shadow: 1px 1px 1px #fff;}
		.content td {padding:5px 0;}
		.submit_btn {background-color:#4797ED;border:none;border-radius:10px;box-shadow:0 0 3px #aaa;width:98px;height:41px;line-height:41px;color:#fff;font-size:18px;font-weight:bold;cursor:pointer;margin-right:20px;display:block;outline:none;text-shadow:0 1px 1px #777;float:left;}
		.submit_btn:hover {background-color:#d8d8d8;color:#666;text-shadow:1px 1px 1px #fff;}
		.line {float:left;margin-top:10px;}
		.pd15 {padding-top:15px!important;}
		.red {color:red;}
		.tooltip {cursor:help;position:relative;text-shadow:2px 2px 2px #999;}
		.tooltip span {font: normal 14px verdana;color: #fff;visibility: hidden;position: absolute;bottom: 30px;left: 50%;z-index: 20000;width: 250px;margin-left: -127px;padding: 10px;border: 2px solid #422A20;background: -moz-linear-gradient(top, #B4784C 0%, #422A20 100%);
background: -webkit-gradient(linear, center top, center bottom, from(#B4784C), to(#422A20));background: -o-gradient(top, #B4784C, #422A20); border-bottom: solid 1px #422A20;-moz-border-radius: 4px;border-radius: 4px;-moz-box-shadow: 0 0 5px 5px #B1A59D;-webkit-box-shadow: 0 0 5px 5px #B1A59D;box-shadow: 0 0 5px 5px #B1A59D;}
		.tooltip:hover span {visibility: visible;} 
    </style>
	<script type="text/javascript">
		if(window.top.location != window.location){
			window.top.location="<%=request.getContextPath()%>/manage/initLogin.do";
		}
		
		$(function(){
			
			if("${errormes}"){
				layer.alert("${errormes}");
			}
			
			$("#submitBtn").click(function(){
				if($("#loginname").val()==""){
					alert("请输入用户名!");
					$("#loginname").focus();
					return;
				}
				if($("#password").val()==""){
					alert("请输入密码!");
					$("#password").focus();
					return;
				}
				$("form").submit();
			});
		});
	</script>
  </head>
  
  <body>
   	<form method="post" id="loginForm" action="<%=request.getContextPath() %>/manage/login.do">
   		<div class="content">
	    	<table width="100%">
	        	<thead>
	            	<tr><td colspan="2" class="thead">收银系统登录</td>
	            </tr></thead>
	            <tbody>
	                <tr>
	                  <th><em class="red">*</em> 用户名：</th>
	                  <td><input class="ipt" name="loginname" onkeydown="if(event.keyCode==13){$('form').submit();}" id="loginname" type="text" /></td>
	                </tr>
	                <tr>
	                  <th><em class="red">*</em> 密码：</th>
	                  <td><input class="ipt" name="password" onkeydown="if(event.keyCode==13){$('form').submit();}" id="password" type="password" /></td>
	                </tr>
	                <tr>
	                  <th class="pd15"></th>
	                  <td class="pd15">
	                  	<input class="submit_btn" id="submitBtn" type="button" value="登录"/>
	                    <input class="submit_btn" type="reset" value="重置"/>
	                  </td>
	                </tr>
	            </tbody>
	        </table>
	    </div>
   	</form>
  </body>
</html>
