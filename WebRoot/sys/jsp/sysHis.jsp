<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>病史管理</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script type="text/javascript" src="sys/js/sysHis.js"></script>
		<script type="text/html" id="sysUserBar">
			<a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="add">新增</a>
			<a class="layui-btn layui-btn-xs" lay-event="update">编辑</a>
			<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="delete">删除</a>
		</script>
	</head>
	<body>
		 <div style="padding: 20px; background-color: #F2F2F2;">
			<div class="layui-card">
			<div class="layui-card-body">
				<label class="layui-form-label">姓名</label>
				<div class="layui-input-inline">
					<input type="text" id="namekey" name="title" 
						lay-verify="required" class="layui-input">
				</div>
				<button class="layui-btn" id="bt1">
						<i class="layui-icon">&#xe615;</i>
				</button>
				<hr class="layui-bg-gray">
				<table id="sysHisTable" lay-filter="sysHisTable"></table>
			</div>
		</div>
		</div> 
	</body>
</html>
