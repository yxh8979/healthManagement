package com.wenli.skill.utils.sys;

public enum StateCode {
	SUCCESS("0","操作成功"),//layui默认返回成功状态码为0
	FAIL("0002","操作失败"),
	NULLDATA("0003","暂无数据"),
	SYSERROR("0004","系统异常");
	private String code;

	private String value;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private StateCode(String code,String value) {
		this.code = code;
		this.value = value;
	}
	
	 public static String getValueByCode(String code) {
		String value = null;
        for (StateCode tempCode : StateCode.values()) {
            if (tempCode.code == code) {
                value = tempCode.value;
            }
        }
        return value;
    }
}
