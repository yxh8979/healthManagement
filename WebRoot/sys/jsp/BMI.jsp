<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>BMI</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	</head>
	<body>
		 <div style="padding: 20px; background-color: #F2F2F2;">
			<div class="layui-form-item">
    			<label class="layui-form-label">身高(m)</label>
    		<div class="layui-input-inline">
      			<input type="text" id="height" name="height" placeholder="请输入身高" autocomplete="off" class="layui-input">
    		</div>
  			</div>
  			<div class="layui-form-item">
    			<label class="layui-form-label">体重(kg)</label>
    		<div class="layui-input-inline">
      			<input type="text" id="weight" name="weight" placeholder="请输入体重" autocomplete="off" class="layui-input">
    		</div>
  			</div>
  			<div class="layui-form-item">
    			<label class="layui-form-label">BMI</label>
    		<div class="layui-input-inline">
      			<input type="text" id="bmi" name="bmi" autocomplete="off" class="layui-input">
    		</div>
  			</div>
  			<div class="layui-form-item">
    		<div class="layui-input-block">
    			<button class="layui-btn" onclick="bmi()">计算</button>
    			<button class="layui-btn layui-btn-primary" onclick="reset()">重置</button>
    		</div>
    	</div>
		</div>
	</body>
</html>
<script type="text/javascript">
	function bmi() {
		var height = $('#height').val();
		var weight = $('#weight').val();
		var bmi = weight / (height * height);
		$('#bmi').attr("value", bmi.toFixed(2));
	};
	function reset() {
		$('#height').attr("value", "");
		$('#weight').attr("value", "");
		$('#bmi').attr("value", "");
	}
</script>