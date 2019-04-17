package com.wenli.skill.service.sys;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.wenli.skill.interFace.sys.ISysSportServices;
import com.wenli.skill.mapper.TbSysSportMapper;
import com.wenli.skill.pojo.TbSysSport;
import com.wenli.skill.pojo.TbSysSportExample;
import com.wenli.skill.pojo.TbSysSportExample.Criteria;
import com.wenli.skill.utils.sys.StateCode;
import com.wenli.skill.utils.sys.SysResult;
import com.wenli.skill.utils.sys.SysUtils;

@Service
@SuppressWarnings("rawtypes")
public class SysSportServiceImpl implements ISysSportServices {
	
	@Resource
	private TbSysSportMapper sportMapper;

	@Override
	public SysResult saveSport(TbSysSport sport) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long day = 0;
		if(sport != null) {
			try {
				day = (sdf.parse(sport.getEndtime()).getTime() - sdf.parse(sport.getStarttime()).getTime()) / (60*60*1000);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sport.setDaycount(day+"");
			int insert = sportMapper.insert(sport);
			if(insert > 0) {
				return SysResult.success();
			}
		}
		return SysResult.fail();
	}

	@Override
	public SysResult modifySport(TbSysSport sport) {
		// TODO Auto-generated method stub
		if(sport != null) {
			int i = sportMapper.updateByPrimaryKey(sport);
			if(i > 0) {
				return SysResult.success();
			}
		}
		return SysResult.fail();
	}

	@Override
	public SysResult deleteSport(int sportid) {
		// TODO Auto-generated method stub
		if(sportid > 0) {
			int deleteByPrimaryKey = sportMapper.deleteByPrimaryKey(sportid);
			if(deleteByPrimaryKey > 0) {
				return SysResult.success();
			}
		}
		return SysResult.fail();
	}

	@Override
	public SysResult querySport(String username) {
		// TODO Auto-generated method stub
		TbSysSportExample example = new TbSysSportExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<TbSysSport> list = sportMapper.selectByExample(example);
		SysResult sysresult = null;
		sysresult = SysResult.success(list);
		sysresult.setCount(String.valueOf(list.size()));
		return sysresult;
	}

	@Override
	public SysResult querySportList(JSONObject jsonObject) {
		// TODO Auto-generated method stub
		SysResult sysResult = null;
		int pageNum = Integer.parseInt(jsonObject.getString("pageNum"));//页码
		int pageSize = Integer.parseInt(jsonObject.getString("pageSize"));//每页显示条数
		TbSysSportExample example = new TbSysSportExample();
		example.setOrderByClause("starttime");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<TbSysSport> dataList = sportMapper.selectByExample(example);
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
