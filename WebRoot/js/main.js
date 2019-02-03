var isrecharge=false;
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
	  		var topay=$("input[name='topay']").val();
	  		if(!topay||isNaN(topay)||parseFloat(topay)<0){
	  			layer.msg("订单异常!");
		  		  return false;
	  		}
	  		layer.closeAll();
	  		layer.load(1,{shade: [0.8, '#393D49']});
		  	  var array=[];
		  	  for(var i=0;i<$("#goodsTable tbody tr").length;i++){
		  		  var val=$("#goodsTable tbody tr").eq(i).children().eq(10).find("input").val();
		  		  if(val&&!isNaN(val)&&parseInt(val)>0){
		  			  var goodsdiscount=parseFloat($("#goodsTable tbody tr").eq(i).find(".discount").val());
			  		  array.push({
			  			  id:$("#goodsTable tbody tr").eq(i).attr("js-value"),
			  			  discount:(goodsdiscount>0&&goodsdiscount<10)?goodsdiscount:0,
			  			  num:parseInt(val)
			  		  });
		  		  }
		  	  }
		  	  $("input[name='orderJson']").val(JSON.stringify(array));
		  	  $("input[name='joinpoints']").val($("#joinpoints").is(":checked"));
		  	  $("input[name='payway']").val($(".layui-this").attr("lay-value"));
		  	  $.ajax({
		  		  url:ctx+'/manage/saveOrder.action',
		  		  dataType:'json',
		  		  method:'post',
		  		  data:$("#orderForm").serializeArray(),
		  		  success:function(result){
		  			  layer.closeAll();
		  			  if(result.status){
		  				  layer.alert("操作成功!",function(){
		  					  window.open(ctx+"/manage/initPrintPage.action?orderid="+result.orderid);
		  					  
		  					  setTimeout(function(){
		  						  location.reload();
		  					  }, 300)
		  				  });
		  			  }
		  			  else{
		  				  if(result.msg){
		  					  layer.alert(result.msg);
		  				  }
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
			layer.tips("当前可兑换积分:"+(memberpoint-(memberpoint%times))+",可兑换:"+((memberpoint-(memberpoint%times))/weight)+"元", "#exchange", {tips: [1, '#0FA6D8'],time :0});
		}
	});
  	  
  	$("input[name='goodcode']").bind("input propertychange",function(){
  		var code=$(this).val();
  		
  		$.ajax({
  			url:ctx+"/manage/getGoodsDetail.action",
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
			  				html+="<tr js-value='"+detailid+"' js-isdiscount='"+trs.eq(i).children().eq(6).attr("js-isdiscount")+"'><td>"+($("#goodsTable tbody tr").length+1)+"</td><td>"+trs.eq(i).children().eq(0).text()+"</td><td>"+trs.eq(i).children().eq(1).text()+"</td><td>"+trs.eq(i).children().eq(2).text()+"</td><td>"+trs.eq(i).children().eq(3).text()+"</td><td>"+trs.eq(i).children().eq(4).text()+"</td><td>"+trs.eq(i).children().eq(5).text()+"</td><td>"+trs.eq(i).children().eq(6).text()+"</td><td><input type='text' class='inputtxt discount' onkeyup='onlyNum(this)' onchange='discountchange(this)' class='discountinput' style='width:50px;text-align:center;' value='"+(trs.eq(i).children().eq(9).text()=="折扣中"?trs.eq(i).children().eq(8).text():"0")+"'></td><td>"+trs.eq(i).children().eq(9).text()+"</td><td><input type='text' class='inputtxt' onkeyup='onlyNum(this)' resamount='"+resamount+"' onchange='numchange(this)' style='width:50px;text-align:center;' value='"+amount+"'></td><td>0</td><td><input type='button' value='删除' onclick='$(this).parent().parent().remove();clearBalance();calc();' class='layui-btn layui-btn-mini'/></td></tr>";
				  			$("#goodsTable tbody").append(html);
	  					}
	  				}
	  			}
	  			layer.closeAll();
	  			clearBalance();
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
  		if(parseInt($(this).val())/weight>parseFloat($("input[name='topay']").val())){
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
  		if($("input[name='topay']").val()&&!isNaN($("input[name='topay']").val())&&parseFloat($("input[name='topay']").val())>0){
	  		var total=parseFloat($("input[name='topay']").val());
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
  	
  	$("input[name='topay']").change(function(){
  		var topay=$(this).val();
  		if(isNaN(topay)||parseFloat(topay)<0){
  			layer.msg("输入金额不合法");
  			$(this).focus();
  			calc();
  			return;
  		}
  		clearBalance();
		$("#remainPay").text(topay);
  		$("input[name='totalprice']").val(topay);
  		$("#discountPrice").text("--");
  		discountDetail="";
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
  			url:ctx+"/manage/goodsSearch.action",
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
  			url:ctx+"/manage/getRechargeHis.action",
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
	  			url:ctx+"/manage/recharge.action",
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
  		$("#useBalance").text(0);
		$("input[name='balancepay']").val(0);
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
  		if(parseFloat(inputTxt)>parseFloat($("input[name='topay']").val())){
  			layer.alert("输入金额大于订单金额!");
  			return;
  		}
  		inputTxt=parseFloat(inputTxt);
  		$("#useBalance").text(inputTxt);
  		$("input[name='balancepay']").val(inputTxt);
  		
  		var topaytxt=$("input[name='topay']").val();
  		if(isNaN(topaytxt)||parseFloat(topaytxt)<0){
  			topaytxt=0;
  		}
  		var remainPay=Number(topaytxt).sub(parseFloat(inputTxt));
  		$("#remainPay").text(remainPay);
  		$("input[name='totalprice']").val(remainPay);
  		
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
  		var orderprice=parseFloat($("input[name='oldprice']").val());
  		for(var i=0;i<checked.length;i++){
  			if(i==0){
  				ids+=checked.eq(i).val();
  			}
  			else{
  				ids+=","+checked.eq(i).val();
  			}
  			var couponprice=parseInt(checked.eq(i).parent().parent().children().eq(1).text());
  			var limitmoney=parseInt(checked.eq(i).parent().parent().children().eq(2).text());
  			if(limitmoney>orderprice){
  				layer.alert("订单金额未达到优惠券限制金额，无法使用!");
  				return;
  			}
  			coupontotal+=couponprice;
  		}
  		/*if(coupontotal==0){
  			layer.alert("请先选择要是用的优惠券!");
  			return;
  		}*/
  		if(parseFloat(coupontotal)>parseFloat($("input[name='topay']").val())){
  			layer.alert("输入金额大于订单金额!");
  			return;
  		}
  		if(coupontotal>0){
  			$("#useBalance").text(0);
  			$("input[name='balancepay']").val(0);
  		}
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
	
	var reduce=getFullReduce(viptotal);		//满减计算
	$("#fullreduce").text(reduce+"元");
	if(reduce&&reduce>0){
		viptotal=Number(viptotal).sub(reduce);		//减去满减部分
		discountDetail+="满减优惠:"+reduce+"元<br/>";
	}
	
	if($("#exchange").val()&&!isNaN($("#exchange").val())&&parseFloat($("#exchange").val())>0){
		var exchange=Number($("#exchange").val()).div(parseInt(weight));
		viptotal=Number(Number(viptotal).sub(exchange)).toFixed(2);
  		$("#exchangetip").text("="+exchange+"元");
	}
	else{
  		$("exchangetip").text("");
	}
	
	var couponUse=parseFloat($("#couponUse").text());		//优惠券支付
	if(couponUse&&couponUse>0){
		viptotal=Number(viptotal).sub(couponUse);
		discountDetail+="优惠券:"+couponUse+"元<br/>";
	}
	
	var memdiscount=parseFloat($(".memdiscount:eq(0)").text());		//会员折扣
	if(memdiscount&&memdiscount>0&&memdiscount<10){
		var a=viptotal;
		viptotal=Number(viptotal).mul(memdiscount/10);		//会员打折
		
		yh_member=Number(Number(a).sub(viptotal)).toFixed(2);
		discountDetail+="会员折扣优惠:"+yh_member+"元<br/>";
	}
	
	$("input[name='topay']").val(viptotal.toFixed(2));
	
	var balancepay=parseFloat($("input[name='balancepay']").val());		//余额支付
	if(balancepay&&balancepay>0){
		
		var topaytxt=$("input[name='topay']").val();
  		if(isNaN(topaytxt)||parseFloat(topaytxt)<0){
  			topaytxt=0;
  		}
  		var remainPay=Number(topaytxt).sub(balancepay);
  		$("#remainPay").text(remainPay);
  		$("input[name='totalprice']").val(remainPay);
	}else{
		var topaytxt=$("input[name='topay']").val();
  		if(isNaN(topaytxt)||parseFloat(topaytxt)<0){
  			topaytxt=0;
  		}
		$("#remainPay").text(topaytxt);
  		$("input[name='totalprice']").val(topaytxt);
	}
	
	var dp=Number(Number(total).sub(Number($("input[name='topay']").val()))).add(parseFloat($("#couponUse").text())).toFixed(2);
	$("#discountPrice").text(dp+"元");	//享受优惠
	$("input[name='discount']").val(dp);
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
	clearBalance();
	calc();
}

//折扣改变事件
function discountchange(t){
	var oldval=$(t).val();
	if(!$(t).val()||isNaN($(t).val())||parseInt($(t).val())<0||parseInt($(t).val())>10){
		$(t).val(oldval);
		calc();
		return;
	}
	clearBalance();
	var price=parseFloat($(t).parent().parent().children().eq(6).text());
	if(parseInt($(t).val())==0||parseInt($(t).val())==10){
		$(t).parent().parent().attr("js-isdiscount","0");
		$(t).parent().parent().children().eq(7).text($(t).parent().parent().children().eq(6).text());
		calc();
	}
	else{
		$(t).parent().parent().attr("js-isdiscount","2");
		$(t).parent().parent().children().eq(7).text(Number(Number(Number(price).mul($(t).val())).div(10)).toFixed(2));
		calc();
	}
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
		url:ctx+"/manage/searchMember.action",
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
					html+="<tr><td>"+result.memberCoupons[i].code+"</td><td>"+result.memberCoupons[i].money+"</td><td>"+result.memberCoupons[i].limitmoney+"</td><td>"+formatdate(result.memberCoupons[i].starttime)+"</td><td>"+formatdate(result.memberCoupons[i].endtime)+"</td><td><input type='checkbox' value='"+result.memberCoupons[i].id+"'/></td></tr>";
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

function clearBalance(){
	$("input[name='balancepay']").val(0);
	$("#useBalance").text(0);
}