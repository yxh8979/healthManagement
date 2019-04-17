package com.wenli.skill.service.sys;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.wenli.skill.interFace.sys.ISysSleepServices;
import com.wenli.skill.mapper.TbSysSleepMapper;
import com.wenli.skill.pojo.TbSysSleep;
import com.wenli.skill.pojo.TbSysSleepExample;
import com.wenli.skill.pojo.TbSysSport;
import com.wenli.skill.pojo.TbSysSportExample;
import com.wenli.skill.pojo.TbSysSleepExample.Criteria;
import com.wenli.skill.utils.sys.StateCode;
import com.wenli.skill.utils.sys.SysResult;
import com.wenli.skill.utils.sys.SysUtils;

@Service
@SuppressWarnings("rawtypes")
public class SysSleepServiceImpl implements ISysSleepServices {
	
	@Resource
	private TbSysSleepMapper sleepMapper;

	@Override
	public SysResult saveSleep(TbSysSleep sleep) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long day = 0;
		if(sleep != null) {
			try {
				day = (sdf.parse(sleep.getEndtime()).getTime() - sdf.parse(sleep.getStarttime()).getTime()) / (60*60*1000);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sleep.setDaycount(day + "");
			int insert = sleepMapper.insert(sleep);
			if(insert > 0) {
				return SysResult.success();
			}
		}
		return SysResult.fail();
	}

	@Override
	public SysResult modifySleep(TbSysSleep sleep) {
		// TODO Auto-generated method stub
		if(sleep != null) {
			int i = sleepMapper.updateByPrimaryKey(sleep);
			if(i > 0) {
				return SysResult.success();
			}
		}
		return SysResult.fail();
	}

	@Override
	public SysResult deleteSleep(int sleepid) {
		// TODO Auto-generated method stub
		if(sleepid > 0) {
			int deleteByPrimaryKey = sleepMapper.deleteByPrimaryKey(sleepid);
			if(deleteByPrimaryKey > 0) {
				return SysResult.success();
			}
		}
		return SysResult.fail();
	}

	@Override
	public SysResult querySleep(String username) {
		// TODO Auto-generated method stub
		TbSysSleepExample example = new TbSysSleepExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<TbSysSleep> list = sleepMapper.selectByExample(example);
		SysResult sysresult = null;
		sysresult = SysResult.success(list);
		sysresult.setCount(String.valueOf(list.size()));
		return sysresult;
	}

	@Override
	public SysResult querySleepList(JSONObject jsonObject) {
		// TODO Auto-generated method stub
		SysResult sysResult = null;
		int pageNum = Integer.parseInt(jsonObject.getString("pageNum"));//页码
		int pageSize = Integer.parseInt(jsonObject.getString("pageSize"));//每页显示条数
		TbSysSleepExample example = new TbSysSleepExample();
		example.setOrderByClause("starttime");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<TbSysSleep> dataList = sleepMapper.selectByExample(example);
		if(SysUtils.checkListNotNull(dataList)) {
			if(dataList.size() > pageNum * pageSize) {
				dataList = dataList.subList((pageNum - 1) * pageSize, pageNum * pageSize);
			} else {
				dataList = dataList.subList((pageNum - 1) * pageSize, dataList.size());
			}
			sysResult = SysResult.success(dataList);
			sysResult.setCount(String.valueOf(dataList.size()));
		} else {
			sysResult = SysResult.success(StateCode.NULLDATA);
		}
		return sysResult;
	}

}
