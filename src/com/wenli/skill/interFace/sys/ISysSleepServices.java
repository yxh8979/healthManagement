package com.wenli.skill.interFace.sys;

import com.alibaba.fastjson.JSONObject;
import com.wenli.skill.pojo.TbSysHis;
import com.wenli.skill.pojo.TbSysSleep;
import com.wenli.skill.utils.sys.SysResult;
@SuppressWarnings("rawtypes")
public interface ISysSleepServices extends IBaseService {
	public SysResult saveSleep(TbSysSleep sleep);
	
	public SysResult modifySleep(TbSysSleep sleep);
	
	public SysResult deleteSleep(int sleepid);
	
	public SysResult querySleep(String username);
	
	public SysResult querySleepList(JSONObject jsonObject);
	
}
