package com.xupt.api;

public class Test2 {

	public static void main(String[] args) {
		// StringBuffer 字符串变量，
		//对它的每次修改都会在原有的内容上直接修改，不会开辟新空间
		StringBuffer sb=new StringBuffer("hellow");
		//追加内容
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
