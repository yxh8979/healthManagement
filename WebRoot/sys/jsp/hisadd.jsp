<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>家庭成员运动数据新增</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="../../layui/css/layui.css">
  <script type="text/javascript" src="../../layui/layui.js"></script>
  <script type="text/javascript" src="../js/hisadd.js"></script>
  <script type="text/javascript" src="../../js/jquery.js"></script>
</head>
<body>
	<form class="layui-form layui-form-pane" id="addform" action="">
  		<div class="layui-form-item">
    		<label class="layui-form-label">姓名</label>
    		<div class="layui-input-inline">
      			<input type="text" id="username" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
    		</div>
    	</div>
    	<div class="layui-form-item">
    		<label class="layui-form-label">开始时间</label>
    		<div class="layui-input-inline">
      			<input type="text" id="starttime" name="starttime" lay-verify="required" autocomplete="off" class="layui-input">
    		</div>
    	</div>
    	<div class="layui-form-item">
    		<label class="layui-form-label">结束时间</label>
    		<div class="layui-input-inline">
      			<input type="text" id="endtime" name="endtime" lay-verify="required" autocomplete="off" class="layui-input">
    		</div>
    	</div>
    	<div class="layui-form-item">
    		<label class="layui-form-label">病症</label>
    		<div class="layui-input-inline">
      			<input type="text" id="illness" name="illness" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
    		</div>
    	</div>
    	<div class="layui-form-item">
    		<label class="layui-form-label">描述</label>
    		<div class="layui-input-inline">
      			<input type="text" id="des" name="des" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
    		</div>
    	</div>
  		<div class="layui-form-item">
    		<div class="layui-input-block">
    			<button class="layui-btn" lay-filter="formDemo" id="submit">立即提交</button>
    			<button type="reset" class="layui-btn layui-btn-primary">重置</button>
    		</div>
    	</div>
	</form>
</body>
</html>