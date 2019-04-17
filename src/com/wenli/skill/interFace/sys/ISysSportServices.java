package com.wenli.skill.interFace.sys;

import com.alibaba.fastjson.JSONObject;
import com.wenli.skill.pojo.TbSysHis;
import com.wenli.skill.pojo.TbSysSport;
import com.wenli.skill.utils.sys.SysResult;
@SuppressWarnings("rawtypes")
public interface ISysSportServices extends IBaseService {
	public SysResult saveSport(TbSysSport sport);
	
	public SysResult modifySport(TbSysSport sport);
	
	public SysResult deleteSport(int sportid);
	
	public SysResult querySport(String username);
	
	public SysResult querySportList(JSONObject jsonObject);
	
}
