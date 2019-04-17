package com.wenli.skill.utils.sys;


import com.alibaba.fastjson.JSONObject;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class SysUtils {
	public static final String TIMEFORMAT = "yyyy-MM-dd hh:mm:ss";
	public static final String DATEFORMAT = "yyyy-MM-dd";
	public static final String DATEMONTHFORMAT = "yyyy-MM";
	
	private SysUtils() {

	}

	public static Date getDate(Date date,String format) {
		if (!SysUtils.checkStringNotNull(format)) {
			format = DATEFORMAT;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		Date backDate = null;
		try {
			if(date != null) {
				backDate = simpleDateFormat.parse(simpleDateFormat.format(date));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return backDate;
	}

	
	public static String getDateString(Date date,String format) {
		if (!SysUtils.checkStringNotNull(format)) {
			format = DATEFORMAT;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		String backDate = null;
		if(date != null) {
			backDate = simpleDateFormat.format(date);
		}
		return backDate;
	}

	public static int getDate(int format) {
		Calendar calendar = Calendar.getInstance();
		int backData = calendar.get(format);
		return backData;
	}

	public static String getUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	public static String getTimeStamp() {
		return Long.toString(System.currentTimeMillis());
	}

	public static boolean checkStringNotNull(String data) {
		boolean flag = false;
		if(data != null && !"".equals(data) && !"null".equals(data)) {
			flag = true;
		}
		return flag;
	}

	public static boolean checkJsonObjectHasKey(JSONObject jsonObject, String key) {
		boolean flag = false;
		if(jsonObject != null && !"".equals(jsonObject)) {
			if(jsonObject.containsKey(key) && !"".equals(jsonObject.get(key)) && !"null".equals(jsonObject.get(key))) {
				flag = true;
			}
		}
		return flag;
	}

	public static boolean checkObjectNotNull(Object object) {
		boolean flag = false;
		if(object != null && !"".equals(object) && !"null".equals(object)) {
			flag = true;
		}
		return  flag;
	}

	@SuppressWarnings("rawtypes")
	public static boolean checkListNotNull(List list) {
		boolean flag = false;
		if(list != null && list.size() > 0) {
			flag = true;
		}
		return  flag;
	}

	public static boolean checkArrayNotNull(Object[] objects) {
		boolean flag = false;
		if(objects != null && objects.length > 0) {
			flag = true;
		}
		return  flag;
	}
}
