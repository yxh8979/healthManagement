<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body class="layui-layout-body">
		<div class="layui-layout layui-layout-admin">
			<!-- 菜单栏部分 -->
			<div class="layui-side layui-bg-black">
				<div class="layui-side-scroll">
					<!-- 菜单栏内容 -->
					<ul class="layui-nav layui-nav-tree" lay-filter="test">
						<li class="layui-nav-item">
							<a onclick="sysUserFunction('sys/jsp/sysUser.jsp')">家庭成员管理</a>
						</li>
						<li class="layui-nav-item">
							<a href="javascript:;">家庭成员健康数据管理</a>
							<dl class="layui-nav-child">
								<dd><a onclick="sysUserFunction('sys/jsp/sysHis.jsp')">家庭成员病史数据管理</a></dd>
								<dd><a onclick="sysUserFunction('sys/jsp/sysSport.jsp')">家庭成员运动数据管理</a></dd>
								<dd><a onclick="sysUserFunction('sys/jsp/sysSleep.jsp')">家庭成员睡眠数据管理</a></dd>
							</dl>
						</li>
						<li class="layui-nav-item">
							<a href="javascript:;">健康小工具</a>
							<dl class="layui-nav-child">
								<dd><a onclick="sysUserFunction('sys/jsp/BMI.jsp')">BMI计算器</a></dd>
								<dd><a onclick="sysUserFunction('sys/jsp/tzl.jsp')">体脂计算器</a></dd>
								<dd><a onclick="sysUserFunction('sys/jsp/BMR.jsp')">BMR计算器</a></dd>
							</dl>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</body>
</html>
