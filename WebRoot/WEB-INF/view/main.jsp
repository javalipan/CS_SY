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
		  			<label class="lb">余额使用:</label>
		  			<span id="useBalance" class="red">0</span>元/<span class="balance red">0</span>元　<input type="button" id="useBalanceBtn" class="layui-btn layui-btn-small layui-btn-normal " value="&nbsp;&nbsp;使用&nbsp;&nbsp;"/>
		  		</div>
		  		<div class="item">
		  			<label class="lb">优惠券:</label>
		  			<span id="couponUse" class="red">0</span>元/<span class="couponBalance red">0</span>元　<input type="button" id="couponUseBtn" class="layui-btn layui-btn-small layui-btn-normal " value="&nbsp;&nbsp;使用&nbsp;&nbsp;"/>
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
  	<script type="text/javascript">
  	var isrecharge=false;
  	var fullrules=eval(${fullRules});
  	var discountDetail="";
  	var infoindex;
  	
	  	$(function(){
	  		//layer.tips("请输入或扫描条形码", "input[name='goodcode']",{tips: [2, '#0FA6D8'],time :0});
	  		
	  		var form = layui.form();
		  	form.render('select');
		  	
		  	$("#submitbtn").click(function(){
		  		layer.confirm('您确认要结算吗？', {
			  	  btn: ['确认','取消'] //按钮
			  	}, function(){
			  		if($("#goodsTable tbody tr").length<=0){
				  		  layer.msg("清先选择商品!");
				  		  return false;
				  	 }
			  		layer.closeAll();
			  		layer.load(1,{shade: [0.8, '#393D49']});
				  	  var array=[];
				  	  for(var i=0;i<$("#goodsTable tbody tr").length;i++){
				  		  var val=$("#goodsTable tbody tr").eq(i).children().eq(10).find("input").val();
				  		  if(val&&!isNaN(val)&&parseInt(val)>0){
					  		  array.push({
					  			  id:$("#goodsTable tbody tr").eq(i).attr("js-value"),
					  			  num:parseInt(val)
					  		  });
				  		  }
				  	  }
				  	  $("input[name='orderJson']").val(JSON.stringify(array));
				  	  $("input[name='joinpoints']").val($("#joinpoints").is(":checked"));
				  	  $("input[name='payway']").val($(".layui-this").attr("lay-value"));
				  	  $.ajax({
				  		  url:'${ctx}/manage/saveOrder.action',
				  		  dataType:'json',
				  		  method:'post',
				  		  data:$("#orderForm").serializeArray(),
				  		  success:function(result){
				  			  if(result.status){
				  				  layer.alert("操作成功!",function(){
				  					  layer.closeAll();
				  					  window.open("${ctx}/manage/initPrintPage.action?orderid="+result.orderid);
				  					  
				  					  setTimeout(function(){
				  						  location.reload();
				  					  }, 300)
				  				  });
				  			  } 
				  		  }
				  	  });
				  	  return false;
			  	}, function(){
			  	  layer.closeAll();
			  	});
		  	});
		  	
	  		$("#currenttime").text(formatJStime(new Date()));
	  		setInterval("$('#currenttime').text(formatJStime(new Date()))",1000);		//当前时间
	  		
		  	$("input[name='phone']").bind("input propertychange",function(){
		  		getMemberInfo();
		  	});
	  		
	  		$("#exchange").focus(function(){
	  			var memberpoint=$(this).attr("memberpoint");
	  			if(memberpoint&&parseInt(memberpoint)>0){
	  				memberpoint=parseInt(memberpoint);
	  				var weight=parseInt("${INT_WEIGHT}");
	  				var times=parseInt("${INT_TIMES}");
	  				layer.tips("当前可兑换积分:"+(memberpoint-(memberpoint%times))+",可兑换:"+((memberpoint-(memberpoint%times))/weight)+"元", "#exchange", {tips: [1, '#0FA6D8'],time :0});
	  			}
	  		});
		  	  
		  	$("input[name='goodcode']").bind("input propertychange",function(){
		  		var code=$(this).val();
		  		
		  		$.ajax({
		  			url:"${ctx}/manage/getGoodsDetail.action",
		  			data:{
		  				code:code
		  			},
		  			method:"post",
		  			dataType:"json",
		  			success:function(result){
		  				if(result.goodsQuery){
		  					var html="";
		  					var details=result.details;
		  					var discountStatus="";
	  						if(result.goodsQuery.isdiscount=="0"){
	  							discountStatus="无";
	  						}
	  						else if(result.goodsQuery.isdiscount=="1"){
	  							discountStatus="未开始";
	  						}
	  						else if(result.goodsQuery.isdiscount=="2"){
	  							discountStatus="折扣中";
	  						}
	  						else if(result.goodsQuery.isdiscount=="3"){
	  							discountStatus="已结束";
	  						}
		  					for(var i=0;i<details.length;i++){
		  						html+="<tr js-value='"+details[i].id+"'><td>"+details[i].detailcode+"</td><td>"+result.goodsQuery.name+"</td><td>"+details[i].colorName+"</td><td>"+details[i].sizeName+"</td><td>"+details[i].oldprice+"</td><td>"+details[i].price+"</td><td js-isdiscount='"+result.goodsQuery.isdiscount+"'>"+details[i].vipprice+"</td><td>"+details[i].amount+"</td><td>"+details[i].discount+"</td><td>"+discountStatus+"</td><td><input type='text' onkeyup='onlyNum(this)' style='width:50px;text-align:center;' value='0' class='inputtxt'></td></tr>";
		  					}
		  					$(".js-pop-goods table tbody").html(html);
		  					layer.open({
		  			  		  title:'商品选择',
		  			  		  type: 1, 
		  			  		  shade:0.3,
		  			  		  shadeClose:true,
		  			  		  area: ['1000px', 'auto'],
		  			  		  content: $(".js-pop-goods"),
		  			  		  end:function(){
		  			  			$(".js-pop-goods").hide();
		  			  		  }
		  			  	  });
		  				}
		  			}
		  		});
		  		
		  	});
		  	
		  	$(".js-pop-goods").on("keyup","table input[type='text']",function(){
		  		if($(this).val()>parseInt($(this).parent().prev().prev().prev().text())){
		  			layer.msg("数量不能大于库存!");
		  			$(this).val($(this).parent().prev().prev().prev().text());
		  		}
		  	});
		  	
		  	$(".js-pop-goods").on("focus","table input[type='text']",function(){
		  		if($(this).val()=="0"){
		  			$(this).val("");
		  		}
		  	});
		  	
		  	$(".js-pop-goods").on("blur","table input[type='text']",function(){
		  		if($(this).val()==""){
		  			$(this).val(0);
		  		}
		  	});
		  	
		  	$("body").keyup(function(e){
		  		if($(".js-pop-goods").is(":visible")){
			  		if(e.keyCode==13){	//回车
			  			var trs=$(".js-pop-goods table tbody tr");
			  			for(var i=0;i<trs.length;i++){
				  			var html="";
			  				var amounttxt=trs.eq(i).find("input[type='text']").val();
			  				var detailid=trs.eq(i).attr("js-value");		//详细id
			  				var resamount=parseInt(trs.eq(i).children().eq(7).text());	//库存数量
			  				var amount=0;
			  				if(amounttxt&&!isNaN(amounttxt)&&parseInt(amounttxt)>0){
			  					amount=parseInt(amounttxt);
			  				}
			  				if(amount>0){
			  					if($("#goodsTable tbody tr[js-value='"+detailid+"']").length>0){		//已添加修改数量
			  						var newamount=parseInt($("#goodsTable tbody tr[js-value='"+detailid+"']").children().eq(10).find("input[type='text']").val())+amount;
			  						if(newamount>resamount){
			  							newamount=resamount;
			  							layer.msg("数量不能大于库存!");
			  						}
			  						$("#goodsTable tbody tr[js-value='"+detailid+"']").children().eq(10).find("input[type='text']").val(newamount);
			  					}
			  					else{		//未添加则添加至结算列表
					  				html+="<tr js-value='"+detailid+"' js-isdiscount='"+trs.eq(i).children().eq(6).attr("js-isdiscount")+"'><td>"+($("#goodsTable tbody tr").length+1)+"</td><td>"+trs.eq(i).children().eq(0).text()+"</td><td>"+trs.eq(i).children().eq(1).text()+"</td><td>"+trs.eq(i).children().eq(2).text()+"</td><td>"+trs.eq(i).children().eq(3).text()+"</td><td>"+trs.eq(i).children().eq(4).text()+"</td><td>"+trs.eq(i).children().eq(5).text()+"</td><td>"+trs.eq(i).children().eq(6).text()+"</td><td>"+trs.eq(i).children().eq(8).text()+"</td><td>"+trs.eq(i).children().eq(9).text()+"</td><td><input type='text' class='inputtxt' onkeyup='onlyNum(this)' resamount='"+resamount+"' onchange='numchange(this)' style='width:50px;text-align:center;' value='"+amount+"'></td><td>0</td><td><input type='button' value='删除' onclick='$(this).parent().parent().remove();calc();' class='layui-btn layui-btn-mini'/></td></tr>";
						  			$("#goodsTable tbody").append(html);
			  					}
			  				}
			  			}
			  			layer.closeAll();
			  			calc();
			  		}
			  		if(e.keyCode==27){	//esc
			  			layer.closeAll();
			  		}
		  		}
		  	});
		  	
		  	$("#exchange").change(function(){		//兑换积分改变
		  		if(!$("input[name='memberid']").val()){
		  			$(this).val("");
		  			layer.msg("请先输入会员手机号");
		  			return;
		  		}
		  		if(!$(this).attr("memberpoint")||parseInt($(this).attr("memberpoint"))<=0){
		  			$(this).val("");
		  			layer.msg("当前会员暂时没有积分");
		  			return;
		  		}
		  		var memberpoint=parseInt($(this).attr("memberpoint"));
		  		var weight=parseInt("${INT_WEIGHT}");
		  		var times=parseInt("${INT_TIMES}");
		  		if(parseInt($(this).val())>0&&parseInt($(this).val())<times){
		  			layer.msg("只能兑换"+times+"的整数倍");
	  				$(this).val(0);
	  				calc();
	  				return;
		  		}
		  		if(parseInt($(this).val())%times>0){
		  			layer.msg("只能兑换"+times+"的整数倍");
	  				$(this).val(parseInt($(this).val())-(parseInt($(this).val())%times));
	  				calc();
	  				return;
		  		}
		  		if(parseInt($(this).val())/weight>parseFloat($("input[name='totalprice']").val())){
		  			layer.msg("兑换金额不能大于订单总金额");
		  			$(this).val(0);
		  			calc();
	  				return;
		  		}
		  		if($(this).val()&&!isNaN($(this).val())&&parseInt($(this).val())>0){
		  			if(parseInt($(this).val())>memberpoint){
		  				layer.msg("大于当前会员可兑换最大积分");
		  				$(this).val(memberpoint-(memberpoint%times));
		  			}
		  		}
		  		calc();
		  	});
		  	
		  	$("#payed").change(function(){		//实收金额改变
		  		if($("input[name='totalprice']").val()&&!isNaN($("input[name='totalprice']").val())&&parseFloat($("input[name='totalprice']").val())>0){
			  		var total=parseFloat($("input[name='totalprice']").val());
			  		if($("#payed").val()&&!isNaN($("#payed").val())&&parseFloat($("#payed").val())>0){
			  			var refund=(Number(parseFloat($("#payed").val())).sub(total)).toFixed(2);
			  			if(refund<0){
			  				layer.msg("实收金额不能少于应付金额!");
			  				$("#torefund").text("");
			  				return;
			  			}
			  			$("#torefund").text(refund+"元");
			  		}
		  		}
		  	});
		  	
		  	$("input[name='totalprice']").change(function(){
		  		var totalprice=$(this).val();
		  		if(isNaN(totalprice)||parseFloat(totalprice)<=0){
		  			layer.msg("输入金额不合法");
		  			$(this).focus();
		  			calc();
		  			return;
		  		}
		  		if($("#payed").val()&&!isNaN($("#payed").val())&&parseFloat($("#payed").val())>0){
		  			var viptotal=parseFloat(totalprice);
		  			var torefund=Number(parseFloat($("#payed").val())).sub(viptotal).toFixed(2);
		  			if(torefund>=0){
			  			$("#torefund").text(torefund+"元");
		  			}
		  			else{
			  			$("#torefund").text("元");
		  			}
		  		}
		  	});
		  	
		  	$("#searchBtn").click(function(){
		  		layer.open({
			  		  title:'商品库存查询',
			  		  type: 1, 
			  		  shade:0.3,
			  		  shadeClose:true,
			  		  area: ['1000px', '600px'],
			  		  content: $(".js-pop-goodsSearch"),
			  		  end:function(){
			  			$(".js-pop-goodsSearch").hide();
			  		  }
			  	  });
		  	});
		  	
		  	$("#search").click(function(){
		  		$.ajax({
		  			url:"${ctx}/manage/goodsSearch.action",
		  			data:{
		  				codelike:$(".js-pop-goodsSearch input[name='code']").val(),
		  				detailcodelike:$(".js-pop-goodsSearch input[name='detailcode']").val(),
		  				name:$(".js-pop-goodsSearch input[name='name']").val()
		  			},
		  			method:"post",
		  			dataType:"json",
		  			success:function(result){
		  				if(result){
		  					var html="";
		  					var details=result;
		  					for(var i=0;i<details.length;i++){
		  						html+="<tr js-value='"+details[i].id+"'><td>"+details[i].code+"</td><td>"+details[i].detailcode+"</td><td>"+details[i].name+"</td><td>"+details[i].colorName+"</td><td>"+details[i].sizeName+"</td><td>"+details[i].oldprice+"</td><td>"+details[i].price+"</td><td>"+details[i].vipprice+"</td><td>"+details[i].amount+"</td><td>"+details[i].discount+"</td></tr>";
		  					}
		  					$(".js-pop-goodsSearch table tbody").html(html);
		  				}
		  			}
		  		});
		  	});
		  	
		  	$("#rechargeBtn").click(function(){		//点击充值按钮
		  		var memberid=$("input[name='memberid']").val();
		  		$(".js-pop-recharge .name").text($("#memname").text());
		  		$(".js-pop-recharge .curbalance").text($(".balance:eq(0)").text());
		  		$.ajax({
		  			url:"${ctx}/manage/getRechargeHis.action",
		  			data:{
		  				memberid:memberid
		  			},
		  			dataType:'json',
		  			success:function(data){
		  				var html="";
		  				if(!data||data.length==0){
		  					html="<tr><td colspan='5' align='center'>暂无数据</td></tr>";
		  				}
		  				for(var i=0;i<data.length;i++){
		  					html+="<tr><td>"+(i+1)+"</td><td>"+data[i].amount+"</td><td>"+data[i].giveamount+"</td><td>"+data[i].discount+"</td><td>"+formatdate(data[i].dealtime)+"</td></tr>";
		  				}
		  				$("#rechargeHisTable").find("tbody").html(html);
		  				
		  				layer.open({
					  		  title:'会员充值',
					  		  type: 1, 
					  		  shade:0.3,
					  		  shadeClose:true,
					  		  area: ['600px', '600px'],
					  		  content: $(".js-pop-recharge"),
					  		  end:function(){
					  			$(".js-pop-recharge").hide();
					  			if(isrecharge){
					  				getMemberInfo();
					  			}
					  		  }
					  	  });
		  			}
		  		});
		  	});
		  	
		  	$("#manedrecharge").click(function(){		//人工充值和充值规则切换
		  		if($(this).is(":checked")){
		  			$("#manedrecharge").parent().prev().find("input,select").val("");
		  			$("#manedrecharge").parent().prev().find("input,select").attr("disabled",true);
		  			
		  			$("#manedrecharge").parent().next().find("input").attr("disabled",false);
		  		}
		  		else{
		  			$("#manedrecharge").parent().next().find("input").attr("disabled",true);
		  			$("#manedrecharge").parent().next().find("input").val("");
		  			
		  			$("#manedrecharge").parent().prev().find("input,select").attr("disabled",false);
		  		}
		  	});
		  	
		  	$(".ruleSelect").change(function(){		//充值规则选择
		  		if($(this).val()==""){
		  			$(this).parent().parent().find(".giveamount").text("");
		  			$(this).parent().parent().find(".discount").text("");
		  		}
		  		else{
		  			$(this).parent().parent().find(".giveamount").text($(this).find("option:selected").attr("js-giveamount"));
		  			$(this).parent().parent().find(".discount").text($(this).find("option:selected").attr("js-discount"));
		  		}
		  	});
		  	
		  	$("#submitRecharge").click(function(){		//确认充值
		  		var memberid=$("input[name='memberid']").val();
		  		var data={
		  				memberid:memberid
		  		};
		  		if($("#manedrecharge").is(":checked")){		//人工充值
		  			var amount=$(".manedrecharge input:eq(0)").val();
		  			var giveamount=$(".manedrecharge input:eq(1)").val();
		  			var discount=$(".manedrecharge input:eq(2)").val();
		  			if(!/^\d+$/.test(amount)){
		  				layer.alert("充值金额必须为正整数")
		  				return;
		  			}
		  			if(!/^\d+$/.test(giveamount)){
		  				layer.alert("赠送金额必须为正整数")
		  				return;
		  			}
		  			if(!discount||discount<0||discount>10||isNaN(discount)){
		  				layer.alert("折扣必须为大于0小于10的数字")
		  				return;
		  			}
		  			data.amount=amount;
		  			data.giveamount=giveamount;
		  			data.discount=discount;
		  		}else{		//规则充值
		  			if(!$(".js-pop-recharge .ruleSelect").val()){
		  				layer.alert("请选择充值金额")
		  				return;
		  			}
		  			data.ruleid=$(".js-pop-recharge .ruleSelect").val();
		  		}
		  		var confirmindex=layer.confirm('您确认要充值吗？', {
				  	  btn: ['确认','取消'] //按钮
			  	}, function(){
			  		$.ajax({
			  			url:"${ctx}/manage/recharge.action",
			  			data:data,
			  			dataType:"json",
			  			success:function(result){
			  				layer.close(confirmindex);
			  				if(result){
			  					isrecharge=true;
			  					$(".js-pop-recharge .curbalance").text(result.balance+"元");
			  					$("#membalance").text(result.balance+"元");
			  					var amount1,giveamount1,discount1;
			  					if($("#manedrecharge").is(":checked")){		//人工充值
			  			  			amount1=$(".manedrecharge input:eq(0)").val();
			  			  			giveamount1=$(".manedrecharge input:eq(1)").val();
			  			  			discount1=$(".manedrecharge input:eq(2)").val();
			  					}
			  					else{
			  						amount1=$(".js-pop-recharge .ruleSelect").find("option:selected").attr("js-amount");
			  			  			giveamount1=$(".js-pop-recharge .ruleSelect").find("option:selected").attr("js-giveamount");
			  			  			discount1=$(".js-pop-recharge .ruleSelect").find("option:selected").attr("js-discount");
			  					}
			  					if($("#rechargeHisTable tbody tr td").length==1){
			  						$("#rechargeHisTable tbody tr").html("<td>1</td><td>"+amount1+"</td><td>"+giveamount1+"</td><td>"+discount1+"</td><td>"+formatJSdate(new Date())+"</td>");
			  					}
			  					else{
			  						$("#rechargeHisTable tbody tr:eq(0)").before("<tr><td>"+(parseInt($("#rechargeHisTable tbody tr:last").find("td:eq(0)").text())+1)+"</td><td>"+amount1+"</td><td>"+giveamount1+"</td><td>"+discount1+"</td><td>"+formatJSdate(new Date())+"</td></tr>");
			  					}
			  					for(var i=0;i<$("#rechargeHisTable tbody tr").length;i++){
			  						$("#rechargeHisTable tbody tr").eq(i).find("td").eq(0).text(i+1);
			  					}
			  					layer.alert("充值成功");
			  				}
			  				else{
			  					layer.alert("充值失败");
			  				}
			  			}
			  		});
			  	}, function(){
			  	  layer.closeAll();
			  	});
		  	});
		  	
		  	//使用余额按钮
		  	$("#useBalanceBtn").click(function(){
		  		if(!$("input[name='memberid']").val()){
		  			layer.alert("请先输入会员手机号码!");
		  			return;
		  		}
		  		if(parseFloat($(".balance:eq(0)").text())<=0){
		  			layer.alert("用户暂无余额可用!");
		  			return;
		  		}
		  		layer.open({
			  		  title:'使用余额',
			  		  type: 1, 
			  		  shade:0.3,
			  		  shadeClose:true,
			  		  area: ['400px', '200px'],
			  		  content: $(".js-pop-useBalance"),
			  		  end:function(){
			  			$(".js-pop-useBalance").hide();
			  		  }
			  	  });
		  	});
		  	
		  	//使用余额确认
		  	$("#submitUseBalance").click(function(){
		  		var inputTxt=$(".js-pop-useBalance").find("input[type='text']").val();
		  		if(!inputTxt||isNaN(inputTxt)||parseFloat(inputTxt)<0){
		  			layer.alert("余额请输入大于0的数字!");
		  			return;
		  		}
		  		if(parseFloat(inputTxt)>parseFloat($(".balance:eq(0)").text())){
		  			layer.alert("余额不足!");
		  			return;
		  		}
		  		if(parseFloat(inputTxt)>parseFloat($("input[name='totalprice']").val())){
		  			layer.alert("输入金额大于订单金额!");
		  			return;
		  		}
		  		$("#useBalance").text(inputTxt);
		  		$("input[name='balancepay']").val(inputTxt);
		  		calc();
		  		layer.closeAll();
		  	});
		  	
		  //使用优惠券按钮点击
		  	$("#couponUseBtn").click(function(){
		  		if(!$("input[name='memberid']").val()){
		  			layer.alert("请先输入会员手机号码!");
		  			return;
		  		}
		  		if($(".js-pop-usecoupon table tbody tr").length<=0){
		  			layer.alert("用户暂无优惠券可用!");
		  			return;
		  		}
		  		layer.open({
			  		  title:'使用优惠券',
			  		  type: 1, 
			  		  shade:0.3,
			  		  shadeClose:true,
			  		  area: ['600px', '400px'],
			  		  content: $(".js-pop-usecoupon"),
			  		  end:function(){
			  			$(".js-pop-usecoupon").hide();
			  		  }
			  	  });
		  	});
		  
		  //确认使用优惠券
		  	$("#submitUseCoupon").click(function(){
		  		var checked=$(".js-pop-usecoupon input[type='checkbox']:checked");
		  		var ids="";
		  		var coupontotal=0;
		  		for(var i=0;i<checked.length;i++){
		  			if(i==0){
		  				ids+=checked.eq(i).val();
		  			}
		  			else{
		  				ids+=","+checked.eq(i).val();
		  			}
		  			coupontotal+=parseInt(checked.eq(i).parent().prev().prev().prev().text());
		  		}
		  		/*if(coupontotal==0){
		  			layer.alert("请先选择要是用的优惠券!");
		  			return;
		  		}*/
		  		$("#couponUse").text(coupontotal);
		  		$("input[name='couponids']").val(ids);
		  		calc();
		  		layer.closeAll();
		  	});
		  
		  $(".totalinfo .item img").click(function(){
			  if($.trim(discountDetail)){
				layer.tips(discountDetail, '.totalinfo .item img', {
				  tips: [1, '#3595CC'],
				  time: 3000
				});
			  }
		  });
	  	});
	  	
	  	/**
	  	*金额计算
	  	*/
	  	function calc(){
	  		discountDetail="";
	  		var memberid=$("input[name='memberid']").val();
	  		var total=0;
	  		var viptotal=0;
	  		for(var i=0;i<$("#goodsTable tbody tr").length;i++){
  				var numtxt=$("#goodsTable tbody tr").eq(i).children().eq(10).find("input[type='text']").val();
  				if(!/^\d+$/.test(numtxt)||isNaN(numtxt)||parseInt(numtxt)<=0){
  					$("#goodsTable tbody tr").eq(i).children().eq(10).find("input[type='text']").val(1);
  					layer.msg("数量必须为大于0整数");
  				}
  				var price=parseFloat($("#goodsTable tbody tr").eq(i).children().eq(6).text());
  				var vipprice=parseFloat($("#goodsTable tbody tr").eq(i).children().eq(7).text());
  				var num=parseInt(numtxt);
  				var sum=Number(price).mul(num);
  				var vipsum=Number(price).mul(num);
  				var iddiscount=$("#goodsTable tbody tr").eq(i).attr("js-isdiscount");
  				if(iddiscount=="2"){
  					vipsum=Number(vipprice).mul(num);
  				}
  				$("#goodsTable tbody tr").eq(i).children().eq(11).text(vipsum.toFixed(2));
  				total=Number(total).add(sum);
  				viptotal=Number(viptotal).add(vipsum);
  			}
	  		$("#goodscount").text($("#goodsTable tbody tr").length);
	  		
	  		$("#oldprice").text(viptotal.toFixed(2)+"元");		//订单金额
	  		$("input[name='oldprice']").val(viptotal.toFixed(2));
	  		
	  		var yh_goods=Number(Number(total).sub(viptotal)).toFixed(2);		//商品折扣优惠金额
	  		if(yh_goods>0){
	  			discountDetail+="商品折扣优惠:"+yh_goods+"元<br/>";
	  		}
	  		var yh_member;		//会员折扣优惠
	  		
	  		var memdiscount=parseFloat($(".memdiscount:eq(0)").text());		//会员折扣
	  		if(memdiscount&&memdiscount>0&&memdiscount<10){
	  			var a=viptotal;
	  			viptotal=Number(viptotal).mul(memdiscount/10);		//会员打折
	  			
	  			yh_member=Number(Number(a).sub(viptotal)).toFixed(2);
	  			discountDetail+="会员折扣优惠:"+yh_member+"元<br/>";
	  		}
	  		
	  		var reduce=getFullReduce(viptotal);		//满减计算
  			$("#fullreduce").text(reduce+"元");
	  		if(reduce&&reduce>0){
	  			viptotal=Number(viptotal).sub(reduce);		//减去满减部分
	  			discountDetail+="满减优惠:"+reduce+"元<br/>";
	  		}
	  		
	  		if($("#exchange").val()&&!isNaN($("#exchange").val())&&parseFloat($("#exchange").val())>0){
	  			var exchange=Number($("#exchange").val()).div(parseInt("${INT_WEIGHT}"));
	  			viptotal=Number(Number(viptotal).sub(exchange)).toFixed(2);
		  		$("input[name='totalprice']").val(viptotal);
		  		$("#exchangetip").text("="+exchange+"元");
	  		}
	  		else{
		  		$("input[name='totalprice']").val(viptotal.toFixed(2));
		  		$("exchangetip").text("");
	  		}
	  		var balancepay=parseFloat($("input[name='balancepay']").val());		//余额支付
	  		var couponUse=parseFloat($("#couponUse").text());		//优惠券支付
	  		
	  		$("#discountPrice").text(Number(Number(total).sub($("input[name='totalprice']").val())).add(parseFloat($("#couponUse").text())).toFixed(2)+"元");	//享受优惠
	  		$("input[name='discount']").val(Number(Number(total).sub($("input[name='totalprice']").val())).add(parseFloat($("#couponUse").text())).toFixed(2));
	  		
	  		if(balancepay&&balancepay>0){
  				viptotal=Number(viptotal).sub(balancepay);
  			}
	  		if(couponUse&&couponUse>0){
  				viptotal=Number(viptotal).sub(couponUse);
  				discountDetail+="优惠券:"+couponUse+"元<br/>";
  			}
	  		
  			
  			$("#remainPay").text(viptotal>=0?viptotal.toFixed(2):0);
	  		if($("#payed").val()&&!isNaN($("#payed").val())&&parseFloat($("#payed").val())>0){
	  			var torefund=Number(parseFloat($("#payed").val())).sub(viptotal).toFixed(2);
	  			if(torefund>=0){
		  			$("#torefund").text(torefund+"元");
	  			}
	  			else{
		  			$("#torefund").text("元");
	  			}
	  		}
	  	}
	  	
	  	function numchange(t){
	  		if(!$(t).val()||isNaN($(t).val())||parseInt($(t).val())<=0){
	  			$(t).val(1);
	  		}
	  		var val=parseInt($(t).val());
	  		var resamount=parseInt($(t).attr("resamount"));
	  		if(val>resamount){
	  			layer.msg("数量不能大于库存!");
	  			$(t).val(resamount);
	  		}
	  		calc();
	  	}
	  	
	  	//根据满减规则设置计算满减
	  	function getFullReduce(money){
	  		for(var i=fullrules.length-1;i>=0;i--){
	  			if(money>fullrules[i].amount){
	  				return fullrules[i].subtractamount;
	  			}
	  		}
	  		return 0;
	  	}
	  	
	  	function getMemberInfo(){
  			var phone=$("input[name='phone']").val();
	  		$.ajax({
	  			url:"${ctx}/manage/searchMember.action",
	  			data:{
	  				phone:phone
	  			},
	  			method:"post",
	  			dataType:"json",
	  			success:function(result){
	  				if(result.id){	//会员存在
	  					$("input[name='memberid']").val(result.id);
	  					$("#memname").text(result.name?(result.name+"("+result.nickname+")"):result.nickname);
	  					$("#memcode").text(result.membercode);
	  					$("#memphone").text(result.phone);
	  					$("#memlevel").text(result.memberlevel+"星");
	  					$("#meminte").text(result.memberpoint);
	  					$("#memtime").text(formatdate(result.registertime));
	  					$("#memprice").text(result.totalmoney+"元");
	  					$("#memamount").text(result.ordercount+"单");
	  					$("#exchange").attr("memberpoint",result.memberpoint);
	  					$(".memdiscount").text(result.discount);
	  					$("#membalance").text(result.balance+"元");
	  					$(".balance").text(result.balance);
	  					$(".couponBalance").text(result.couponBalance);
	  					$("#rechargeBtn").show();
	  					$(".info").show();
	  					
	  					var html="";
	  					for(var i=0;i<result.memberCoupons.length;i++){
	  						html+="<tr><td>"+result.memberCoupons[i].code+"</td><td>"+result.memberCoupons[i].money+"</td><td>"+formatdate(result.memberCoupons[i].starttime)+"</td><td>"+formatdate(result.memberCoupons[i].endtime)+"</td><td><input type='checkbox' value='"+result.memberCoupons[i].id+"'/></td></tr>";
	  					}
	  					$(".js-pop-usecoupon table tbody").html(html);
	  				}
	  				else{
	  					$("input[name='memberid']").val("");
	  					$("#memname").text("");
	  					$("#memcode").text("");
	  					$("#memphone").text("");
	  					$("#meminte").text("");
	  					$("#memtime").text("");
	  					$("#memprice").text("");
	  					$("#memamount").text("");
	  					$("#exchange").attr("memberpoint","");
	  					$("#memlevel").text("");
	  					$(".memdiscount").text("");
	  					$("#membalance").text("");
	  					$(".balance").text(0);
	  					$(".couponBalance").text(0);
	  					$("#rechargeBtn").hide();
	  					$(".info").hide();
	  					
	  					$("js-pop-usecoupon table tbody").html("");
	  				}
	  				$("#exchange").val(0);
	  				calc();
	  			}
	  		});
  		}
  	</script>
  </body>
</html>
