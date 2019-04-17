<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>家庭健康管理系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="layui/css/layui.css">
	<script type="text/javascript" src="layui/layui.js"></script>
	<script type="text/javascript" src="sys/js/index.js"></script>
	<script type="text/javascript" src="js/jquery.js"></script>
  </head>
  
  <body>
  	<jsp:include page="sysTop.jsp" flush="true"/>
	<jsp:include page="sysLeft.jsp" flush="true"/>
	<jsp:include page="sysIndex.jsp" flush="true"/>
  </body>
</html>
