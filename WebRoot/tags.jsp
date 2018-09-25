<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/style.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/layui/css/layui.css" />
<script>
	var ctx="${ctx}";
</script>
<script language="javascript" type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script language="javascript" type="text/javascript" src="<%=request.getContextPath()%>/js/layui/lay/dest/layui.all.js"></script>
<script language="javascript" type="text/javascript" src="<%=request.getContextPath()%>/js/common.js"></script>
<script>
	var layer=layui.layer;
	
	function showImg(t){
		var src=$(t).attr("src");
		if(src){
			layer.photos({
				shade : 0.3,
				photos: {data: [{src:src}]}
			});
		}
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
</script>