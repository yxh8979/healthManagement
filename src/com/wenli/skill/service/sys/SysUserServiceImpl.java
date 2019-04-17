package com.wenli.skill.service.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.DoubleUnaryOperator;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.wenli.skill.interFace.sys.ISysUserService;
import com.wenli.skill.mapper.TbSysUserMapper;
import com.wenli.skill.pojo.TbSysUser;
import com.wenli.skill.pojo.TbSysUserExample;
import com.wenli.skill.utils.sys.StateCode;
import com.wenli.skill.utils.sys.SysResult;
import com.wenli.skill.utils.sys.SysUtils;
@Service
@SuppressWarnings({"rawtypes"})
public class SysUserServiceImpl implements ISysUserService {
	@Resource
	private TbSysUserMapper userMapper;
	
	public SysResult saveUser(TbSysUser sysUser) throws Exception{
		SysResult sysResult = null;
		sysUser.setCreatetime(new Date());
		int height = Integer.parseInt(sysUser.getHeight());
		int weight = Integer.parseInt(sysUser.getWeight());
		String sex = sysUser.getSex();
		int age = Integer.parseInt(sysUser.getAge());
		String bmr = "";
		String bmi = weight / ((height * height) / 10000) + "";
		String tzl = "";
		if("男".equals(sex)) {
			tzl = Math.round(((1.2 * Double.parseDouble(bmi) + 0.23 * age - 5.4 - 10.8 * 1) * 100 ) / 100.0) + "";
			bmr = Math.round(((66 + (13.7 * weight) + (5 * height) - (6.8 * age)) * 100 ) / 100.0) + "";
		} else {
			tzl = Math.round(((1.2 * Double.parseDouble(bmi) + 0.23 * age - 5.4 - 10.8 * 0) * 100 ) / 100.0) + "";
			bmr = Math.round(((655 + (9.6 * weight) + (1.8 * height) - (4.7 * age)) * 100 ) / 100.0) + "";
		}
		sysUser.setBMI(bmi);
		sysUser.setBMR(bmr);
		sysUser.setTzl(tzl);
		int i = userMapper.insert(sysUser);
		if(i > 0) {
			sysResult = SysResult.success();
		} else {
			sysResult = SysResult.fail();
		}
		return sysResult;
	}

	public SysResult modifyUser(TbSysUser sysUser) throws Exception {
		SysResult sysResult = null;
		TbSysUser tempUser = userMapper.selectByPrimaryKey(sysUser.getUsername());
		String sysbmi = sysUser.getBMI();
		String tempbmi = tempUser.getBMI();
		String sysbmr = sysUser.getBMR();
		String tempbmr = tempUser.getBMR();
		String systzl = sysUser.getTzl();
		String temptzl = tempUser.getTzl();
		int sysage = Integer.parseInt(sysUser.getAge());
		int sysheight = Integer.parseInt(sysUser.getHeight());
		int sysweight = Integer.parseInt(sysUser.getWeight());
		int tempage = Integer.parseInt(tempUser.getAge());
		int tempheight = Integer.parseInt(tempUser.getHeight());
		int tempweight = Integer.parseInt(tempUser.getWeight());
		if(sysheight != tempheight || sysweight != tempweight) {
			tempbmi = sysweight / ((sysheight * sysheight) / 10000) + "";
			if("男".equals(sysUser.getSex())) {
				temptzl = Math.round(((1.2 * Double.parseDouble(tempbmi) + 0.23 * sysage - 5.4 - 10.8 * 1) * 100 ) / 100.0) + "";
				tempbmr = Math.round(((66 + (13.7 * sysweight) + (5 * sysheight) - (6.8 * sysage)) * 100 ) / 100.0) + "";
			} else {
				temptzl = Math.round(((1.2 * Double.parseDouble(tempbmi) + 0.23 * sysage - 5.4 - 10.8 * 0) * 100 ) / 100.0) + "";
				tempbmr = Math.round(((655 + (9.6 * sysweight) + (1.8 * sysheight) - (4.7 * sysage)) * 100 ) / 100.0) + "";
			}
		}
		if(sysage != tempage) {
			if("男".equals(sysUser.getSex())) {
				temptzl = Math.round(((1.2 * Double.parseDouble(sysbmi) + 0.23 * sysage - 5.4 - 10.8 * 1) * 100 ) / 100.0) + "";
				tempbmr = Math.round(((66 + (13.7 * sysweight) + (5 * sysheight) - (6.8 * sysage)) * 100 ) / 100.0) + "";
			} else {
				temptzl = Math.round(((1.2 * Double.parseDouble(sysbmi) + 0.23 * sysage - 5.4 - 10.8 * 0) * 100 ) / 100.0) + "";
				tempbmr = Math.round(((655 + (9.6 * sysweight) + (1.8 * sysheight) - (4.7 * sysage)) * 100 ) / 100.0) + "";
			}
		}
		tempUser.setTzl(temptzl);
		tempUser.setBMI(tempbmi);
		tempUser.setBMR(tempbmr);
		tempUser.setAge(sysUser.getAge());
		tempUser.setWeight(sysUser.getWeight());
		tempUser.setFrequency(sysUser.getFrequency());
		int i = userMapper.updateByPrimaryKey(tempUser);
		if(i > 0) {
			sysResult = SysResult.success();
		} else {
			sysResult = SysResult.fail();
		}
		return sysResult;
	}

	public SysResult removeUser(String username) throws Exception {
		userMapper.deleteByPrimaryKey(username);
		return SysResult.success();
	}

	public SysResult queryUser(JSONObject jsonObject) throws Exception {
		SysResult sysResult = null;
		String username = jsonObject.getString("username");
		TbSysUser sysUser = userMapper.selectByPrimaryKey(username);
		if(SysUtils.checkObjectNotNull(sysUser)) {
			ArrayList<TbSysUser> list = new ArrayList<TbSysUser>();
			list.add(sysUser);
			sysResult = SysResult.success(list);
		} else {
			sysResult = SysResult.success(StateCode.NULLDATA);
		}
		return sysResult;
	}

	
	public SysResult queryUserList(JSONObject jsonObject) throws Exception {
		SysResult sysResult = null;
		int pageNum = Integer.parseInt(jsonObject.getString("pageNum"));//页码
		int pageSize = Integer.parseInt(jsonObject.getString("pageSize"));//每页显示条数
		TbSysUserExample sysUserExample = new TbSysUserExample();
		sysUserExample.setOrderByClause("username");
		//查询条件
		List<TbSysUser> dataList = userMapper.selectByExample(sysUserExample);
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
