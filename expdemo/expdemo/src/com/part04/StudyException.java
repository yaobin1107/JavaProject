package com.part04;
/**
 * ��׼���ε��쳣
 * @param types   1û��Ǯ   2�����  3������
 * @param msg  ��Ϣ
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
