package com.wenli.skill.interFace.sys;

import com.alibaba.fastjson.JSONObject;
import com.wenli.skill.pojo.TbSysHis;
import com.wenli.skill.utils.sys.SysResult;
@SuppressWarnings("rawtypes")
public interface ISysHisServices extends IBaseService {
	public SysResult saveHis(TbSysHis his);
	
	public SysResult modifyHis(TbSysHis his);
	
	public SysResult deleteHis(int hisid);
	
	public SysResult queryHis(String username);
	
	public SysResult queryHisList(JSONObject jsonObject);
	
}
