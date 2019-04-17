package com.wenli.skill.utils.sys;

import java.io.Serializable;
@SuppressWarnings({ "rawtypes", "unchecked" })
public class SysResult<T> implements Serializable {
	private static final long serialVersionUID = -6654120378928059474L;

	private String code;
	
	private String mgs;
	
	private T data;
	
	private String count;

	public static SysResult success() {
		SysResult sysResult = new SysResult();
		sysResult.setCode(StateCode.SUCCESS.getCode());
		sysResult.setMgs(StateCode.SUCCESS.getValue());
		return sysResult;
	}
	
	public static SysResult success(StateCode stateCode) {
		SysResult sysResult = new SysResult();
		sysResult.setCode(stateCode.getCode());
		sysResult.setMgs(stateCode.getValue());
		return sysResult;
	}
	
	
	public static <T> SysResult success(T data) {
		SysResult sysResult = new SysResult();
		sysResult.setCode(StateCode.SUCCESS.getCode());
		sysResult.setMgs(StateCode.SUCCESS.getValue());
		sysResult.setData(data);
		return sysResult;
	}
	
	public static <T> SysResult success(T data,String count) {
		SysResult sysResult = new SysResult();
		sysResult.setCode(StateCode.SUCCESS.getCode());
		sysResult.setMgs(StateCode.SUCCESS.getValue());
		sysResult.setData(data);
		sysResult.setCount(count);
		return sysResult;
	}
	
	public static <T> SysResult success(StateCode code,T data) {
		SysResult sysResult = new SysResult();
		sysResult.setCode(code.getCode());
		sysResult.setMgs(code.getValue());
		sysResult.setData(data);
		return sysResult;
	}
	
	public static <T> SysResult success(StateCode code,T data,String count) {
		SysResult sysResult = new SysResult();
		sysResult.setCode(code.getCode());
		sysResult.setMgs(code.getValue());
		sysResult.setData(data);
		sysResult.setCount(count);
		return sysResult;
	}
	
	public static SysResult fail() {
		SysResult sysResult = new SysResult();
		sysResult.setCode(StateCode.FAIL.getCode());
		sysResult.setMgs(StateCode.FAIL.getValue());
		return sysResult;
	}
	
	public static SysResult fail(StateCode code) {
		SysResult sysResult = new SysResult();
		sysResult.setCode(code.getCode());
		sysResult.setMgs(code.getValue());
		return sysResult;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMgs() {
		return mgs;
	}

	public void setMgs(String mgs) {
		this.mgs = mgs;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}
}
