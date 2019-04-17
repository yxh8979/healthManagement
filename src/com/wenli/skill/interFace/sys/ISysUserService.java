package com.wenli.skill.interFace.sys;

import com.alibaba.fastjson.JSONObject;
import com.wenli.skill.pojo.TbSysUser;
import com.wenli.skill.utils.sys.SysResult;
@SuppressWarnings("rawtypes")
public interface ISysUserService extends IBaseService{
	
	public SysResult saveUser(TbSysUser sysUser) throws Exception;
	
	public SysResult modifyUser(TbSysUser sysUser) throws Exception;
	
	public SysResult removeUser(String username) throws Exception;
	
	public SysResult queryUser(JSONObject jsonObject) throws Exception;
	
	public SysResult queryUserList(JSONObject jsonObject) throws Exception;
}
