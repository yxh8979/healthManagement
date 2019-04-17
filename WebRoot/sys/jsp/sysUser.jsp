<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>用户管理</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script type="text/javascript" src="sys/js/sysUser.js"></script>
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
				<table id="sysUserTable" lay-filter="sysUserTable"></table>
			</div>
		</div>
		</div> 
		
		<div class="layui-row" id="UpdateTest" style="display:none;">
	    <div class="layui-col-md10">
	        <form id="updateform" class="layui-form layui-from-pane" lay-filter="updateform" action="" style="margin-top:20px" >
	            <div class="layui-form-item">
	                <label class="layui-form-label">姓名</label>
	                <div class="layui-input-block">
	                    <input type="text" name="newusername" readonly="readonly" lay-verify="required" autocomplete="off" placeholder="请输入" class="layui-input">
	                </div>
	            </div>
	            <div class="layui-form-item">
	                <label class="layui-form-label">年龄</label>
	                <div class="layui-input-block">
	                    <input type="text" name="newage" lay-verify="required" autocomplete="off" placeholder="请输入" class="layui-input">
	                </div>
	            </div>
	            <div class="layui-form-item">
	                <label class="layui-form-label">性别</label>
	                <div class="layui-input-block">
	                    <input type="text" name="newsex" readonly="readonly" lay-verify="required" autocomplete="off" placeholder="请输入" class="layui-input">
	                </div>
	            </div>
	            <div class="layui-form-item">
	                <label class="layui-form-label">身高(cm)</label>
	                <div class="layui-input-block">
	                    <input type="text" name="newheight" lay-verify="required" autocomplete="off" placeholder="请输入" class="layui-input">
	                </div>
	            </div>
	            <div class="layui-form-item">
	                <label class="layui-form-label">体重(kg)</label>
	                <div class="layui-input-block">
	                    <input type="text" name="newweight" lay-verify="required" autocomplete="off" placeholder="请输入" class="layui-input">
	                </div>
	            </div>
	            <div class="layui-form-item">
		    		<label class="layui-form-label">运动频率</label>
				    <div class="layui-input-block">
				      <select name="newfrequency" lay-filter="filter">
				        <option value=""></option>
				        <option value="几乎不动">几乎不动</option>
				        <option value="稍微运动">稍微运动（每周1-3次）</option>
				        <option value="中度运动">中度运动（每周3-5次）</option>
				        <option value="积极运动">积极运动（每周6-7次）</option>
				        <option value="专业运动">专业运动（2倍运动量）</option>
				      </select>
				    </div>
				</div>
	
	            <div class="layui-form-item" style="margin-top:40px">
	                <div class="layui-input-block">
	                    <button class="layui-btn  layui-btn-submit " lay-submit="" lay-filter="demo11">确认修改</button>
	                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
	                </div>
	            </div>
	        </form>
	    </div>
		</div>
	</body>
</html>
