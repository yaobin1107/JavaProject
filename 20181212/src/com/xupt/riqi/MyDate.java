package com.xupt.riqi;

import java.util.Date;

class A{
	public static void main(String[] args) {
		System.out.println(111);
	}
}


public class MyDate {

	public static void main(String[] args) {
		Date d=new Date(1999,3,12,11,19,18);

		System.out.println(d);
		System.out.println("世界时间"+d.toString());
		//过时的api，过时不等于没用
		System.out.println("本地时间"+d.toLocaleString());
		System.out.println("格林尼治时间"+d.toGMTString());
		
		

	}

}
