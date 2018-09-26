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
    <title>收银系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8"/>
	<jsp:include page="/tags.jsp"></jsp:include>
	<link rel="icon" href="${ctx }/favicon.ico" type="image/x-icon"/>
	<style>
		.hidden{display: none;}
		.title{padding:10px 0;}
		.title h1{font-size: 28px;color:#393D49;font-weight: 300;}
		.wapper{width:80%;margin:0 auto;}
		.info{border: 1px solid #eee;padding: 10px;background: #fff;margin-top: 15px;display: none;}
		.info .item{width: 250px;float: left;padding:5px;height: 28px;line-height: 28px;}
		.totalinfo{border: 1px solid #eee;padding: 10px;background: #fff;margin-top: 15px;}
		.totalinfo .item{width: 300px;float: left;padding:5px;height: 28px;line-height: 28px;}
		.split{border-bottom: 1px solid #eee;width:100%;height:1px;margin-top: 10px;}
		.inputitem{width:250px;margin-top: 10px;}
		.inputtxt{width:150px;;height: 28px;line-height: 28px;border: 1px solid #e6e6e6;background-color: #fff;border-radius: 2px;}
		.lb{text-align: right;display: inline-block;float: left;width:80px;height:28px;line-height: 28px;padding-right: 5px;}
		.js-pop-goods{padding:5px;}
		.js-pop-goods .detailTable{min-height: 300px;border: 1px solid #eee;}
		.js-pop-goods .tip{text-align: center;font-size: 18px;font-weight: 200;padding: 10px 0;}
		.red,#torefund,#topay,#oldprice{color:red;font-weight: bold;}
		.layui-table td, .layui-table th{    padding: 9px 5px;}
		#remainPay{font-size: 18px;}
	</style>
	<script type="text/javascript">
		var ctx="${ctx }";
		var fullrules=eval(${fullRules});
		var weight=parseInt("${INT_WEIGHT}");
		var times=parseInt("${INT_TIMES}");
	</script>
  </head>
  
  <body>
  	<div class="title"><center><h1>收银系统</h1></center></div>
  	
  	<div class="wapper">
  		<div class="inputitem left">
  			会员手机：<input type="text" class="inputtxt" name="phone"/>
  		</div>
  		<div class="clear"></div>
  		<div class="info">
	  		<div class="item">
	  			<label class="lb">姓名:</label><span id="memname"></span>
	  		</div>
	  		<div class="item">
	  			<label class="lb">会员编号:</label><span id="memcode"></span>
	  		</div>
	  		<div class="item">
	  			<label class="lb">联系电话:</label><span id="memphone"></span>
	  		</div>
	  		<div class="item">
	  			<label class="lb">当前积分:</label><span id="meminte"></span>
	  		</div>
	  		<div class="item">
	  			<label class="lb">会员注册时间:</label><span id="memtime"></span>
	  		</div>
	  		<div class="item">
	  			<label class="lb">累计消费金额:</label><span id="memprice"></span>
	  		</div>
	  		<div class="item">
	  			<label class="lb">累计消费订单:</label><span id="memamount"></span>
	  		</div>
	  		<div class="item">
	  			<label class="lb">当前等级:</label><span id="memlevel"></span>
	  		</div>
	  		<div class="item">
	  			<label class="lb">当前折扣:</label><span class="memdiscount"></span>折
	  		</div>
	  		<div class="item">
	  			<label class="lb">当前余额:</label><span class="balance red"></span><span class="red">元</span><input type='button' id='rechargeBtn' style="display:none;margin-left:5px;" class='layui-btn  layui-btn-small layui-btn-normal ' value='&nbsp;&nbsp;充值&nbsp;&nbsp;'/>
	  		</div>
	  		<div class="clear"></div>
	  	</div>
	  	
	  	<div class="split"></div>
	  	
	  	<div class="inputitem left">
  			条形码：<input type="text" class="inputtxt" placeholder="请输入或扫描条形码" name="goodcode"/>
  		</div>
	  	<div class="inputitem right">
  			当前时间：<span id="currenttime"></span>
  		</div>
	  	<div class="inputitem right">
  			收银员：${USER_INFO_CASHIER.name }
  		</div>
	  	<div class="inputitem right">
  			<input type="button" id="searchBtn" class="layui-btn  layui-btn-small layui-btn-normal " value="&nbsp;&nbsp;库存查询&nbsp;&nbsp;"/>
  		</div>
  		<div class="clear"></div>
  		<div class="margintop10" style="min-height: 160px;border:1px solid #eee;">
	  		<table class="layui-table" id="goodsTable">
			  <thead>
			    <tr>
			      <th>序号</th>
			      <th>条形码</th>
			      <th>商品名</th>
			      <th>颜色</th>
			      <th>尺码</th>
			      <th>吊牌价</th>
			      <th>成交价</th>
			      <th>折扣价</th>
			      <th>折扣</th>
			      <th>折扣状态</th>
			      <th>数量</th>
			      <th>金额</th>
			      <th>操作</th>
			    </tr> 
			  </thead>
			  <tbody>
			  </tbody>
			</table>
  		</div>
  		
  		<form class="layui-form" action="${ctx}/manage/initPrintPage.action" target="_blank" id="orderForm">
  			<input type="hidden" name="type" value="1"/>
  			<input type="hidden" name="orderJson"/>
  			<input type="hidden" name="memberid"/>
  			<input type="hidden" name="joinpoints"/>
  			<input type="hidden" name="balancepay"/>
  			<input type="hidden" name="couponids"/>
	  		<div class="totalinfo">
		  		<div class="item">
		  			<label class="lb">商品数量:</label><span id="goodscount">0</span>
		  		</div>
		  		<div class="item">
		  			<input type="hidden" name="oldprice"/>
		  			<label class="lb">订单金额:</label><span class="red" id="oldprice">0</span>
		  		</div>
		  		<div class="item">
		  			<label class="lb">满减金额:</label><span class="red" id="fullreduce">0</span>
		  		</div>
		  		<div class="item hidden">
		  			<label class="lb">积分兑换:</label><input type="text" onkeyup="onlyNum(this)" name="exchange" id="exchange" class="inputtxt"/>分
		  			<span id="exchangetip"></span>
		  		</div>
		  		<div class="item">
		  			<input type="hidden" name="discount"/>
		  			<label class="lb">总优惠金额:</label><span class="red" id="discountPrice">0</span><img src="${ctx }/images/info2.png" style="padding-left: 10px;" width="20"/>
		  		</div>
		  		<div class="item">
		  			<label class="lb">支付方式:</label>
		  			<input type="hidden" name="payway" value="0"/>
		  			<div class="left" style="width:150px;">
		  				<select name="way" style="width:50px;" lay-verify="">
						  <option value="1">现金支付</option>
						  <option value="0">微信支付</option>
						  <option value="2">支付宝</option>
						  <option value="3">银行卡</option>
						</select>
		  			</div>
		  		</div>
		  		<div class="item">
		  			<label class="lb">应付金额:</label><input type="text" class="inputtxt" style="color:red;font-size: 18px;font-weight: bold;" onkeyup="onlyNum(this)" name="totalprice"/>
		  		</div>
		  		<div class="item hidden">
		  			<label class="lb">实收金额:</label><input type="text" onkeyup="onlyNum(this)" id="payed" class="inputtxt"/>
		  		</div>
		  		<div class="item hidden">
		  			<label class="lb">应找金额:</label><span id="torefund"></span>
		  		</div>
		  		<div class="item">
		  			<label class="lb">优惠券:</label>
		  			<span id="couponUse" class="red">0</span>元/<span class="couponBalance red">0</span>元　<input type="button" id="couponUseBtn" class="layui-btn layui-btn-small layui-btn-normal " value="&nbsp;&nbsp;使用&nbsp;&nbsp;"/>
		  		</div>
		  		<div class="item">
		  			<label class="lb">余额使用:</label>
		  			<span id="useBalance" class="red">0</span>元/<span class="balance red">0</span>元　<input type="button" id="useBalanceBtn" class="layui-btn layui-btn-small layui-btn-normal " value="&nbsp;&nbsp;使用&nbsp;&nbsp;"/>
		  		</div>
		  		<div class="item">
		  			<label class="lb">还需支付:</label><span class="red" id="remainPay"></span>元
		  		</div>
		  		<div class="item">
		  			<label class="lb">参与积分:</label>
		  			<input type="checkbox" checked="checked" id="joinpoints" style="display: block;margin-top:8px;float:left;" />
		  		</div>
		  		<div class="clear"></div>
		  		<div>
		  			<label class="lb">备注:</label>
		  			<textarea style="width:770px;height: 50px;border: 1px solid #E6E6E6;" name="remark"></textarea>
		  		</div>
		  		<div class="clear"></div>
			  	<div class="margintop10" style="width:100%;text-align: center;">
			  		<input type="button" id="submitbtn" class="layui-btn  layui-btn-small layui-btn-normal " value="&nbsp;&nbsp;确认结算&nbsp;&nbsp;"/>
			  	</div>
		  	</div>
	  	</form>
  		
  	</div>
  	
  	<div class="js-pop-goods hidden">
  		<div class="detailTable">
	  		<table class="layui-table">
			  <thead>
			    <tr>
			      <th>条形码</th>
			      <th>商品名</th>
			      <th>颜色</th>
			      <th>尺码</th>
			      <th>吊牌价</th>
			      <th>成交价</th>
			      <th>折扣价</th>
			      <th>库存</th>
			      <th>折扣</th>
			      <th>折扣状态</th>
			      <th>数量</th>
			    </tr> 
			  </thead>
			  <tbody>
			  </tbody>
			</table>
  		</div>
  		<div class="tip">按回车确认，esc取消</div>
  	</div>
  	
  	<div class="js-pop-goodsSearch hidden">
  		<div style="padding:5px;">
  			<div class="inputitem left">
	  			商品编码：<input type="text" class="inputtxt" name="code">
	  		</div> 
	  		<div class="inputitem left">
	  			条形码：<input type="text" class="inputtxt" name="detailcode">
	  		</div> 
	  		<div class="inputitem left">
	  			商品名称：<input type="text" class="inputtxt" name="name">
	  		</div> 
		  	<input type="button" id="search" style="margin-top:8px;" class="layui-btn  layui-btn-small layui-btn-normal " value="&nbsp;&nbsp;查询&nbsp;&nbsp;"/>
	  		<div style="clear: both;"></div>
  		</div>
  		<div class="detailTable">
	  		<table class="layui-table">
			  <thead>
			    <tr>
			      <th>商品编码</th>
			      <th>条形码</th>
			      <th>商品名称</th>
			      <th>颜色</th>
			      <th>尺码</th>
			      <th>吊牌价</th>
			      <th>成交价</th>
			      <th>折扣价</th>
			      <th>库存</th>
			      <th>折扣</th>
			    </tr> 
			  </thead>
			  <tbody>
			  </tbody>
			</table>
  		</div>
  	</div>
  	
  	<div class="js-pop-recharge hidden" style="padding:5px;">
  		<div style="padding:5px;">
  			<div class="inputitem left">
	  			姓名：<span class="name"></span>
	  		</div> 
	  		<div class="inputitem left">
	  			当前余额：<span class="curbalance" style="color: red;"></span>
	  		</div> 
	  		<div style="clear: both;"></div>
  		</div>
  		<form id="form2">
	  		<label style="margin-left: 5px;">请选择充值项</label>
	  		<div style="padding:5px; border: 1px solid #ccc;margin: 5px;" class="rulerecharge">
				<div class="inputitem left">
		  			充值金额：<select class="ruleSelect">
				  				<option value="">充值金额</option>
				  			 	<c:forEach items="${rechargeRules }" var="rule">
				  			 		<option value="${rule.id }" js-amount="${rule.amount }" js-giveamount="${rule.giveamount }" js-discount="${rule.discount }">${rule.amount }元</option>
				  			 	</c:forEach>
							</select>
				</div>
				<div style="clear: both;"></div>
				<div class="inputitem left">
		  			　　赠送：<span class="giveamount"></span>元
		  		</div>
		  		<div class="inputitem left">
		  			商品折扣：<span class="discount"></span>折
		  		</div>
		  		<div style="clear: both;"></div>
	  		</div>
	  		<label style="margin-left: 5px;"><input type="checkbox" id="manedrecharge"/>手动充值</label>
	  		<div style="padding:5px; border: 1px solid #ccc;margin: 5px;" class="manedrecharge">
				<div class="inputitem left">
		  			充值金额：<input type="text" disabled="disabled"/>
				</div>
				<div style="clear: both;"></div>
				<div class="inputitem left">
		  			　　赠送：<input type="text" disabled="disabled"/>元
		  		</div>
		  		<div class="inputitem left">
		  			商品折扣：<input type="text" disabled="disabled"/>折
		  		</div>
		  		<div style="clear: both;"></div>
	  		</div>
	  		<div style="text-align: center;"><input type="button" id="submitRecharge" class="layui-btn  layui-btn-small layui-btn-normal " value="&nbsp;&nbsp;确认充值&nbsp;&nbsp;"></div>
	  		<div style="padding:5px;">
	  			<table class="layui-table" id="rechargeHisTable">
				  <thead>
				    <tr>
				      <th>序号</th>
				      <th>充值金额</th>
				      <th>赠送</th>
				      <th>折扣</th>
				      <th>日期</th>
				    </tr> 
				  </thead>
				  <tbody>
				  </tbody>
				</table>
	  		</div>
  		</form>
  	</div>
  	
  	<div class="js-pop-useBalance hidden" style="padding:5px;">
  		<div class="inputitem">
  			余额：<span class="red balance"></span>元
  		</div>
  		<div class="inputitem">
  			使用余额:<input type="text" class="inputtxt" value="0"/>
  		</div>
  		<div style="text-align: center;margin-top:20px;"><input type="button" id="submitUseBalance" class="layui-btn  layui-btn-small layui-btn-normal " value="&nbsp;&nbsp;确认使用&nbsp;&nbsp;"></div>
  	</div>
  	
  	<div class="js-pop-usecoupon hidden">
  		<div class="couponTable">
	  		<table class="layui-table">
			  <thead>
			    <tr>
			      <th>编号</th>
			      <th>面值</th>
			      <th>金额限制</th>
			      <th>有效期起</th>
			      <th>有效期止</th>
			      <th>选择</th>
			    </tr> 
			  </thead>
			  <tbody>
			  </tbody>
			</table>
  		</div>
  		
  		<div style="text-align: center;margin-top:20px;"><input type="button" id="submitUseCoupon" class="layui-btn  layui-btn-small layui-btn-normal " value="&nbsp;&nbsp;确认使用&nbsp;&nbsp;"></div>
  	</div>
  	<script type="text/javascript" src="${ctx }/js/main.js"></script>
  </body>
</html>
