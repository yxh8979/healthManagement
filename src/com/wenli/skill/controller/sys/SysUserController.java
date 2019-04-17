package com.wenli.skill.controller.sys;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.wenli.skill.interFace.sys.ISysUserService;
import com.wenli.skill.pojo.TbSysUser;
import com.wenli.skill.utils.sys.SysResult;
import com.wenli.skill.utils.sys.SysUtils;

@Controller
@RequestMapping("sysUserController")
@SuppressWarnings("rawtypes")
public class SysUserController {

	@Resource
	private ISysUserService userService;
	
	@RequestMapping("/saveUser")
	@ResponseBody
	public SysResult saveUser(TbSysUser sysUser) {
		SysResult sysResult = null;
		try {
			sysResult = userService.saveUser(sysUser);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
	
	@RequestMapping("/modifyUser")
	@ResponseBody
	public SysResult modifyUser(TbSysUser sysUser) {
		SysResult sysResult = null;
		try {
			sysResult = userService.modifyUser(sysUser);;
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		
		return sysResult;
	}
	
	@RequestMapping("/removeUser")
	@ResponseBody
	public SysResult removeUser(String username) {
		SysResult sysResult = null;
		try {
			sysResult = userService.removeUser(username);;
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
	
	@RequestMapping("/queryUser")
	@ResponseBody
	public SysResult queryUser(String data) {
		SysResult sysResult = null;
		try {
			JSONObject jsonObject = JSONObject.parseObject(data);
			sysResult = userService.queryUser(jsonObject);;
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
	
	@RequestMapping("/queryUserList")
	@ResponseBody
	public SysResult queryUserList(HttpServletRequest request,String data) {
		SysResult sysResult = null;
		String pageNum = request.getParameter("page");//当前页
		String pageSize = request.getParameter("limit");//每页显示数据量
		try {
			JSONObject jsonObject = JSONObject.parseObject(data);
			if(!SysUtils.checkObjectNotNull(jsonObject)) {
				jsonObject = new JSONObject();
			}
			jsonObject.put("pageNum", pageNum);
			jsonObject.put("pageSize", pageSize);
			sysResult = userService.queryUserList(jsonObject);;
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
}
