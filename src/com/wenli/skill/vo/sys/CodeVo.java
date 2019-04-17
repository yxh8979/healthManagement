package com.wenli.skill.vo.sys;

import java.io.Serializable;

public class CodeVo implements Serializable{
	private static final long serialVersionUID = 4358736373082014246L;

	private String codeKey;
	
	private String codeValue;

	public String getCodeKey() {
		return codeKey;
	}

	public void setCodeKey(String codeKey) {
		this.codeKey = codeKey;
	}

	public String getCodeValue() {
		return codeValue;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}
}
