function upload(t,obj1,obj2){
	var id=$(t).attr("id");
	$.ajaxFileUpload({
        url: ctx+'/attachment/uploadFile.action', //用于文件上传的服务器端请求地址
        secureuri: false, //是否需要安全协议，一般设置为false
        fileElementId: id, //文件上传域的ID
        dataType: 'json', //返回值类型 一般设置为json
        success: function (data, status)  //服务器成功响应处理函数
        {
            $("#"+obj1).attr("src", "${ftppath}"+data.filePath);
            $("input[name='"+obj2+"']").val(data.filePath);
        },
        error: function (data, status, e)//服务器响应失败处理函数
        {
            alert(e);
        }
    });
}

function addUpload(t){
	var index=$(".uploaditem").length;
	var html="<div class='item uploaditem'>"
	+"<div class='label'>图片:</div>"
	+"<div class='input'>"
	+"<img  onerror='defaultImg(this)' src='"+ctx+"/images/noimg.jpg' id='img"+index+"' width='90' height='90'/><a href='javascript:void(0)' onclick='removeUpload(this)'><img src='"+ctx+"/images/remove.png'/></a>"
	+"<input type='file' class='imgupload' name='file1' accept='image/png,image/gif,image/jpg,image/jpeg' onchange=\"upload(this,'img"+index+"','img"+index+"')\" id='typeicon"+index+"'/>"
	+"<input type='hidden' name='img"+index+"' value=''/>"
	+"</div>"
	+"</div>";
	$(t).parent().parent().after(html);
}

function removeUpload(t){
	$(t).parent().parent().remove();
}

function clickSpecValue(obj){
	if(!$("input[name='code']").val()){
		$.messager.alert('提示','请先填写或者扫描条形码','info');
		return;
	}
	
	if($(obj).hasClass("notChange")&&$(obj).hasClass("on")) {
		$.messager.alert('提示','历史规格不能取消','info');
		return;
	}
	var clickid=$(obj).attr("js-value");
	var specid=$(obj).parent().attr("js-value");
	if($(obj).attr("class") == "on"){	//取消选择
		$(obj).attr("class","off");
		$("#dptable tr[id*="+specid+"-"+clickid+"_"+"]").remove();
		if(hasunchecked()){		//如果分类下有未选择分类
			return;
		}
	}
	else{//选择
		$(obj).attr("class","on");
		if(hasunchecked()){	//如果分类下有未选择分类
			return;
		}
		generateRow();
	}
}

 function hasunchecked(){  //判断是否有为选择的规格
	var flag=false;
	var dd=$(".dd-box .dd");
	for(var i=0;i<dd.length;i++){
		if(dd.eq(i).find(".on").length<=0){
			flag=true;
			break;
		}
	}
	return flag;
}
 
 function generateRow(){
	var goodscode=$("input[name='code']").val();
	var gg=$(".dd-box .dd");
	var speclist=[];
	for(var i=0;i<gg.length;i++){
		if(gg.eq(i).find(".on").length<=0){
			//continue;
		}
		speclist.push(gg.eq(i));
	}
	var spectr="";
	if(speclist.length==2){
		var labels=$(speclist[0]).find(".on");
		for(var i=0;i<labels.length;i++){
			var labels1=$(speclist[1]).find(".on");
			for(var j=0;j<labels1.length;j++){
				var rowid=labels.eq(i).parent().attr("js-value")+"-"+labels.eq(i).attr("js-value")+"_"+labels1.eq(i).parent().attr("js-value")+"-"+labels1.eq(j).attr("js-value")+"_";
				if($("#"+rowid).length<=0){
					var html="<tr id='"+rowid+"'>"
						+"<td>"+($("#dptable tbody").children().length+1)+"</td>"
						+"<td specid='"+labels.eq(i).attr("js-value")+"'>"+labels.eq(i).text()+"</td>"
						+"<td specid='"+labels1.eq(i).attr("js-value")+"'>"+labels1.eq(j).text()+"</td>"
						+"<td><input type='text' value='"+goodscode+"-"+($("#dptable tbody").children().length+1)+"' class='easyui-validatebox' data-options=\"required:true\"/></td>"
						+"<td><input type='text' class='easyui-validatebox' data-options=\"required:true,validType:['moreThanZero']\"/></td>"
						+"<td><input type='text' class='easyui-validatebox' data-options=\"required:true,validType:['moreThanZero']\"/></td>"
						+"<td><input type='text' class='easyui-validatebox' data-options=\"required:true,validType:['moreThanZero']\"/></td>"
						+"<td class='deleteRow' onclick='$(this).parent().remove();'>删除</td>"
						+"</tr>";
					$("#dptable tbody").append(html);
					$("#"+rowid).find(".easyui-validatebox").validatebox();
				}
			}
		}
	}
	else {
		$("#dptable tbody").empty();
	}
 }