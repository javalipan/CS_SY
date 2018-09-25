<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>小票打印</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
	*{margin:0;padding:0;font-size:12px;}
	.container{width:330px;margin:0 auto;overflow: hidden;padding:20px 20px 0px 30px;}
	.container .qrcode{float: right;}
	.container .logoname{font-size:14px; margin-left: 10px;}
	.container p{padding-top:5px;}
	.container table{border-top:1px solid #ccc;border-bottom: 1px solid #ccc;margin-top:5px; }
	.container th{border-bottom: 1px dashed #ccc;}
	.container th,.container td{height:25px;line-height: 25px;}
	.container .totaltd td{border-top: 1px dashed #ccc;}
	.container .logospan{width:68%;display: inline-block;text-align: left;} 
	.container .leftspan{width:48%;display: inline-block;text-align: left;} 
	.container .rightspan{width:48%;display: inline-block;text-align: right;}
	</style>
	<script type="text/javascript">
	</script>
  </head>
  
  <body>
    <div class="container">
	   	<div class="qrcode"><img src="images/qrcode.jpg" height="90"/></div>
    	<span class="logospan"><img src="images/logo.jpg" height="50"/><font class="logoname">设计师集成平台</font></span>
    	<p>地址：重庆南滨路长嘉汇购物公园L1-27</p>
    	<p>时间：2017-07-04 21:36:00</p>
    	<table width="100%" cellpadding="0" cellspacing="0">
    		<tr>
    			<th width="10%">序号</th>
    			<th width="40%">商品</th>
    			<th width="10%">颜色</th>
    			<th width="10%">尺码</th>
    			<th width="10%">单价</th>
    			<th width="10%">数量</th>
    			<th width="10%">金额</th>
    		</tr>
    		<tr>
    			<td align="center">1</td>
    			<td align="left">裙子裙子裙子裙子裙子裙子裙子裙子</td>
    			<td align="center">黑色</td>
    			<td align="center">S</td>
    			<td align="center">1000</td>
    			<td align="center">2</td>
    			<td align="center">2000</td>
    		</tr>
    		<tr>
    			<td align="center">1</td>
    			<td align="center">裙子</td>
    			<td align="center">黑色</td>
    			<td align="center">S</td>
    			<td align="center">1000</td>
    			<td align="center">2</td>
    			<td align="center">2000</td>
    		</tr>
    		<tr>
    			<td align="center">1</td>
    			<td align="center">裙子</td>
    			<td align="center">黑色</td>
    			<td align="center">S</td>
    			<td align="center">1000</td>
    			<td align="center">2</td>
    			<td align="center">2000</td>
    		</tr>
    		<tr>
    			<td align="center">1</td>
    			<td align="center">裙子</td>
    			<td align="center">黑色</td>
    			<td align="center">S</td>
    			<td align="center">1000</td>
    			<td align="center">2</td>
    			<td align="center">2000</td>
    		</tr>
    		<tr>
    			<td align="center">1</td>
    			<td align="center">裙子</td>
    			<td align="center">黑色</td>
    			<td align="center">S</td>
    			<td align="center">1000</td>
    			<td align="center">2</td>
    			<td align="center">2000</td>
    		</tr>
    		<tr class="totaltd">
    			<td colspan="6">合计金额：两千元整</td>
    			<td align="center">2000</td>
    		</tr>
    	</table>
    	<p><span class="leftspan">积分兑换:1000</span><span class="leftspan">兑换金额:50元</span></p>
    	<p>应收金额=正常金额-兑换金额</p>
    	<p>1、如果商品有质量问题，在未经穿着、使用，请保持商品和包装出售时原装，吊牌未剪，配件齐全不影响再次销售的情况下，贵客可在3天内带上本次小票于本店联系退换，逾期概不受理</p>
    	<p>2、货品请当面点清</p>
    </div>
  </body>
</html>
