package com.xupt.api;

public class Test2 {

	public static void main(String[] args) {
		// StringBuffer �ַ���������
		//������ÿ���޸Ķ�����ԭ�е�������ֱ���޸ģ����Ὺ���¿ռ�
		StringBuffer sb=new StringBuffer("hellow");
		//׷������
		//sb=sb.append("!!");
		System.out.println(sb);
		
		
		String x="";
		x=x+"a"+"b"+"c";
		StringBuffer y=new StringBuffer();
		//System.out.println(x);
		System.out.println(x);
		System.out.println(y.append("a").append("b").append("c"));
		
		System.out.println(sb.append("a").append("b").append("c").append("d"));
	}

}
