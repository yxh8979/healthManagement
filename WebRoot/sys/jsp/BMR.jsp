<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>BMR</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	</head>
	<body>
		 <div style="padding: 20px; background-color: #F2F2F2;">
			<div class="layui-form-item">
    			<label class="layui-form-label">身高(cm)</label>
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
    			<label class="layui-form-label">年龄</label>
    		<div class="layui-input-inline">
      			<input type="text" id="age" name="age" placeholder="请输入年龄" autocomplete="off" class="layui-input">
    		</div>
    		<div class="layui-form-item">
		    <label class="layui-form-label">性别</label>
		    <div class="layui-input-block">
		      <select name="sex" lay-filter="filter">
		        <option value="男" selected="selected">男</option>
		        <option value="女">女</option>
		      </select>
		    </div>
			</div>
  			</div>
  			<div class="layui-form-item">
    			<label class="layui-form-label">BMR</label>
    		<div class="layui-input-inline">
      			<input type="text" id="bmr" name="bmr" autocomplete="off" class="layui-input">
    		</div>
  			</div>
  			<div class="layui-form-item">
    		<div class="layui-input-block">
    			<button class="layui-btn" onclick="bmr()">计算</button>
    			<button class="layui-btn layui-btn-primary" onclick="reset()">重置</button>
    		</div>
    	</div>
		</div>
	</body>
</html>
<script type="text/javascript">
	function bmr() {
		var height = $('#height').val();
		var weight = $('#weight').val();
		var age = $('#age').val();
		var sex = $('#sex option:selected').val();
		if(sex == '男') {
			var bmr = 66 + ( 13.7 * weight ) + ( 5 * height ) - ( 6.8 * age );
		} else {
			var bmr = 655 + ( 9.6 * weight ) + ( 1.8 * height ) - ( 4.7 * age );
		}
		$('#bmr').attr("value", bmr.toFixed(2));
	};
	function reset() {
		$('#height').attr("value", "");
		$('#weight').attr("value", "");
		$('#age').attr("value", "");
		$('#bmr').attr("value", "");
	}
</script>