package com.wenli.skill.controller.sys;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.wenli.skill.interFace.sys.ISysSleepServices;
import com.wenli.skill.pojo.TbSysSleep;
import com.wenli.skill.utils.sys.SysResult;
import com.wenli.skill.utils.sys.SysUtils;

@Controller
@RequestMapping("sysSleepController")
@SuppressWarnings("rawtypes")
public class SysSleepController {

	@Resource
	private ISysSleepServices sleepServices;
	
	@RequestMapping("/saveSleep")
	@ResponseBody
	public SysResult saveSleep(TbSysSleep sysSleep) {
		SysResult sysResult = null;
		try {
			sysResult = sleepServices.saveSleep(sysSleep);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
	
	@RequestMapping("/modifySleep")
	@ResponseBody
	public SysResult modifySleep(TbSysSleep sysSleep) {
		SysResult sysResult = null;
		try {
			sysResult = sleepServices.modifySleep(sysSleep);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		
		return sysResult;
	}
	
	@RequestMapping("/removeSleep")
	@ResponseBody
	public SysResult removeSleep(int sleepid) {
		SysResult sysResult = null;
		try {
			sysResult = sleepServices.deleteSleep(sleepid);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
	
	@RequestMapping("/querySleep")
	@ResponseBody
	public SysResult querySleep(String username) {
		SysResult sysResult = null;
		try {
			sysResult = sleepServices.querySleep(username);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
	
	@RequestMapping("/querySleepList")
	@ResponseBody
	public SysResult querySleepList(HttpServletRequest request) {
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
			sysResult = sleepServices.querySleepList(jsonObject);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
}
