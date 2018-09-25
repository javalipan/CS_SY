$.extend({
	/**
	 * 打开对话框
	*/
	openDialog:function(param){
		var width=param.width?param.width:$(window).width();
		var height=param.width?param.height:$(window).height();
		var divId="";
		if(param.id){
			divId=param.id;
		}
		else{
			divId = "dialog" + Math.round(Math.random() * 100);
		}
		var model=param.model?param.model:true;
		$("body").append('<div id="' + divId + '" title="'+param.title+'"><iframe src="'+ param.url +'" frameborder="0" height="99%" width="99%" id="dialogFrame" scrolling="auto"></iframe></div>'); 
		$('#' + divId).dialog({
			autoOpen: false, 
			title: param.title, 
			width: width, 
			height: height, 
			modal: model, 
			bgiframe: true,
			cache: false,
			resizeStop: function () { 
				$("#dialogFrame").css("width", parseInt($(this).css("width")) - 5); 
				$("#dialogFrame").css("height", parseInt($(this).css("height")) - 5); 
			},
			onClose:function(){
				$("#"+divId).remove();
			}
		}); 
	},
	closeDialog:function(id){
		if(id){
			$(id).dialog("close");
		}
		else{
			$.dialog("close");
		}
	}
});

//将对象日期转换成字符串（天）
function formatdate(val) {
	if(val==null) return "";
	if(typeof val=="string") return val;
	if(val.year==undefined||val.year==null){return "";}
	var year=parseInt(val.year)+1900;
	var month=(parseInt(val.month)+1);
	month=month>9?month:('0'+month);
	var date=parseInt(val.date);
	date=date>9?date:('0'+date);
	var time=year+'-'+month+'-'+date;
	return time;
}
//将对象时间转换成字符串（小时分秒）
function formatJStime(val) {
	var year=val.getFullYear();
	var month=(val.getMonth()+1);
	month=month>9?month:('0'+month);
	var date=val.getDay();
	date=date>9?date:('0'+date);
	var hours=val.getHours();
	hours=hours>9?hours:('0'+hours);
	var minutes=val.getMinutes();
	minutes=minutes>9?minutes:('0'+minutes);
	var seconds=val.getSeconds();
	seconds=seconds>9?seconds:('0'+seconds);
	var time=year+'-'+month+'-'+date+' '+hours+':'+minutes+':'+seconds;
	return time;
}

function formatJSdate(val) {
	var year=val.getFullYear();
	var month=(val.getMonth()+1);
	month=month>9?month:('0'+month);
	var date=val.getDate();
	date=date>9?date:('0'+date);
	var hours=val.getHours();
	hours=hours>9?hours:('0'+hours);
	var minutes=val.getMinutes();
	minutes=minutes>9?minutes:('0'+minutes);
	var seconds=val.getSeconds();
	seconds=seconds>9?seconds:('0'+seconds);
	var time=year+'-'+month+'-'+date;
	return time;
}

//加法
Number.prototype.add = function(arg){   
    var r1,r2,m;   
    try{r1=this.toString().split(".")[1].length;}catch(e){r1=0;}   
    try{r2=arg.toString().split(".")[1].length;}catch(e){r2=0;}   
    m=Math.pow(10,Math.max(r1,r2));
    return (this*m+arg*m)/m;
};
 
//减法   
Number.prototype.sub = function (arg){   
    return this.add(-arg);   
};
 
//乘法   
Number.prototype.mul = function (arg)   
{   
    var m=0,s1=this.toString(),s2=arg.toString();   
    try{m+=s1.split(".")[1].length;}catch(e){}   
    try{m+=s2.split(".")[1].length;}catch(e){}   
    return Number(s1.replace(".",""))*Number(s2.replace(".",""))/Math.pow(10,m);
};
 
//除法   
Number.prototype.div = function (arg){   
    var t1=0,t2=0,r1,r2;   
    try{t1=this.toString().split(".")[1].length;}catch(e){}   
    try{t2=arg.toString().split(".")[1].length;}catch(e){}   
    with(Math){   
        r1=Number(this.toString().replace(".",""));
        r2=Number(arg.toString().replace(".",""));
        return (r1/r2)*pow(10,t2-t1);   
    }   
};

function defaultImg(t){
	$(t).attr("src",ctx+"/images/noimg.jpg");
}

//限制只能输入数字
function onlyNum(t){
	var flag=false;
	if(/[^0-9.]/g.test(t.value)){
		flag=true;
	}
	t.value=t.value.replace(/[^0-9.]/g,'');
	if(flag){
		$(t).change();
	}
}