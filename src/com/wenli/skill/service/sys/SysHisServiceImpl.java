package com.wenli.skill.service.sys;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.mysql.fabric.xmlrpc.base.Data;
import com.wenli.skill.interFace.sys.ISysHisServices;
import com.wenli.skill.mapper.TbSysHisMapper;
import com.wenli.skill.pojo.TbSysHis;
import com.wenli.skill.pojo.TbSysHisExample;
import com.wenli.skill.pojo.TbSysHisExample.Criteria;
import com.wenli.skill.utils.sys.StateCode;
import com.wenli.skill.utils.sys.SysResult;
import com.wenli.skill.utils.sys.SysUtils;

@Service
@SuppressWarnings("rawtypes")
public class SysHisServiceImpl implements ISysHisServices {

	@Resource
	private TbSysHisMapper hisMapper;
	
	@Override
	public SysResult saveHis(TbSysHis his) {
		// TODO Auto-generated method stub
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if(his != null) {
			long day = 0;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				day = (sdf.parse(his.getEndtime()).getTime() - sdf.parse(his.getStarttime()).getTime()) / (24*60*60*1000);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			his.setDaycount(day + "");
			int insert = hisMapper.insert(his);
			if(insert > 0) {
				return SysResult.success();
			}
		}
		return SysResult.fail();
	}

	@Override
	public SysResult modifyHis(TbSysHis his) {
		// TODO Auto-generated method stub
		if(his != null) {
			int i = hisMapper.updateByPrimaryKey(his);
			if(i > 0) {
				return SysResult.success();
			}
		}
		return SysResult.fail();
	}

	@Override
	public SysResult deleteHis(int hisid) {
		// TODO Auto-generated method stub
		if(hisid > 0) {
			int i = hisMapper.deleteByPrimaryKey(hisid);
			if(i > 0) {
				return SysResult.success();
			}
		}
		return SysResult.fail();
	}

	@Override
	public SysResult queryHis(String username) {
		// TODO Auto-generated method stub
//		ArrayList<TbSysHis> reslist = new ArrayList<>();
		TbSysHisExample example = new TbSysHisExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<TbSysHis> reslist = hisMapper.selectByExample(example);
		SysResult sysResult = null;
		sysResult = SysResult.success(reslist);
		sysResult.setCount(String.valueOf(reslist.size()));
		return sysResult;
	}

	@Override
	public SysResult queryHisList(JSONObject jsonObject) {
		// TODO Auto-generated method stub
		SysResult sysResult = null;
		int pageNum = Integer.parseInt(jsonObject.getString("pageNum"));//页码
		int pageSize = Integer.parseInt(jsonObject.getString("pageSize"));//每页显示条数
		TbSysHisExample hisExampleExample = new TbSysHisExample();
		hisExampleExample.setOrderByClause("starttime");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//查询条件
		List<TbSysHis> dataList = hisMapper.selectByExample(hisExampleExample);
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
