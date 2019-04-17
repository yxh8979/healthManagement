<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>家庭成员新增</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="../../layui/css/layui.css">
  <script type="text/javascript" src="../../layui/layui.js"></script>
  <script type="text/javascript" src="../js/useradd.js"></script>
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
    		<label class="layui-form-label">年龄</label>
    		<div class="layui-input-inline">
      			<input type="text" id="age" name="age" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
    		</div>
    	</div>
  		<div class="layui-form-item">
    		<label class="layui-form-label">性别</label>
    		<div class="layui-input-block">
      			<input type="radio" name="sex" value="男" title="男" checked="true">
      			<input type="radio" name="sex" value="女" title="女">
    		</div>
  		</div>
  		<div class="layui-form-item">
    		<label class="layui-form-label">身高(cm)</label>
    		<div class="layui-input-inline">
      			<input type="text" id="height" name="height" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
    		</div>
    	</div>
    	<div class="layui-form-item">
    		<label class="layui-form-label">体重(kg)</label>
    		<div class="layui-input-inline">
      			<input type="text" id="weight" name="weight" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
    		</div>
    	</div>
    	<div class="layui-form-item">
		    <label class="layui-form-label">运动频率</label>
		    <div class="layui-input-block">
		      <select name="frequency" lay-filter="filter">
		        <option value=""></option>
		        <option value="几乎不动">几乎不动</option>
		        <option value="稍微运动">稍微运动（每周1-3次）</option>
		        <option value="中度运动">中度运动（每周3-5次）</option>
		        <option value="积极运动">积极运动（每周6-7次）</option>
		        <option value="专业运动">专业运动（2倍运动量）</option>
		      </select>
		    </div>
		</div>
		<div class="layui-form-item layui-form-text">
    		<label class="layui-form-label">个人简介</label>
    		<div class="layui-input-block">
      		<textarea placeholder="请输入内容" id="des" name="des" class="layui-textarea"></textarea>
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