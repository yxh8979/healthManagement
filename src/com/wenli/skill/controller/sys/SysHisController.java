package com.wenli.skill.controller.sys;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.wenli.skill.interFace.sys.ISysHisServices;
import com.wenli.skill.pojo.TbSysHis;
import com.wenli.skill.pojo.TbSysUser;
import com.wenli.skill.utils.sys.SysResult;
import com.wenli.skill.utils.sys.SysUtils;

@Controller
@RequestMapping("sysHisController")
@SuppressWarnings("rawtypes")
public class SysHisController {

	@Resource
	private ISysHisServices hisServices;
	
	@RequestMapping("/saveHis")
	@ResponseBody
	public SysResult saveUser(TbSysHis sysUser) {
		SysResult sysResult = null;
		try {
			sysResult = hisServices.saveHis(sysUser);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
	
	@RequestMapping("/modifyHis")
	@ResponseBody
	public SysResult modifyUser(TbSysHis sysUser) {
		SysResult sysResult = null;
		try {
			sysResult = hisServices.modifyHis(sysUser);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		
		return sysResult;
	}
	
	@RequestMapping("/removeHis")
	@ResponseBody
	public SysResult removeUser(int hisid) {
		SysResult sysResult = null;
		try {
			sysResult = hisServices.deleteHis(hisid);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
	
	@RequestMapping("/queryHis")
	@ResponseBody
	public SysResult queryUser(String username) {
		SysResult sysResult = null;
		try {
			sysResult = hisServices.queryHis(username);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
	
	@RequestMapping("/queryHisList")
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
			sysResult = hisServices.queryHisList(jsonObject);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return sysResult;
	}
}
