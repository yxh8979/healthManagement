package com.wenli.skill.controller.sys;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.wenli.skill.interFace.sys.ISysSportServices;
import com.wenli.skill.pojo.TbSysSport;
import com.wenli.skill.utils.sys.SysResult;
import com.wenli.skill.utils.sys.SysUtils;

@Controller
@RequestMapping("/sysSportController")
@SuppressWarnings("rawtypes")
public class SysSportController {
	
	@Resource
	private ISysSportServices sportServices;
	
	@RequestMapping("/saveSport")
	@ResponseBody
	public SysResult saveUser(TbSysSport sysSport) {
		SysResult sysResult = null;
		try {
			sysResult = sportServices.saveSport(sysSport);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
	
	@RequestMapping("/modifySport")
	@ResponseBody
	public SysResult modifySport(TbSysSport sysSport) {
		SysResult sysResult = null;
		try {
			sysResult = sportServices.modifySport(sysSport);
		} catch(Exception exception) {
			
			exception.printStackTrace();
		}
		
		return sysResult;
	}
	
	@RequestMapping("/removeSport")
	@ResponseBody
	public SysResult removeUser(int sportid) {
		SysResult sysResult = null;
		try {
			sysResult = sportServices.deleteSport(sportid);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
	
	@RequestMapping("/querySport")
	@ResponseBody
	public SysResult queryUser(String username) {
		SysResult sysResult = null;
		try {
			sysResult = sportServices.querySport(username);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
	
	@RequestMapping("/querySportList")
	@ResponseBody
	public SysResult queryUserList(HttpServletRequest request) {
		SysResult sysResult = null;
		String pageNum = request.getParameter("page");//当前页
		String pageSize = request.getParameter("limit");//每页显示数据量
		try {
			JSONObject jsonObject = new JSONObject();
			if(!SysUtils.checkObjectNotNull(jsonObject)) {
				jsonObject = new JSONObject();
			}
			jsonObject.put("pageNum", pageNum);
			jsonObject.put("pageSize", pageSize);
			sysResult = sportServices.querySportList(jsonObject);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
}
