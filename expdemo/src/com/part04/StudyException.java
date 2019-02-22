package com.part04;
/**
 * 不准听课的异常
 * @param types   1没教钱   2年龄大  3听不懂
 * @param msg  信息
 * @author Administrator
 *
 */
public class StudyException extends Exception {
   
	private int types;
	private String msg;
	
	public StudyException(int types,String msg)
	{
		super(msg);
		this.types=types;
		this.msg=msg;
	}

	public int getTypes() {
		return types;
	}

	public void setTypes(int types) {
		this.types = types;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
