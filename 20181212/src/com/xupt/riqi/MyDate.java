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
		System.out.println("����ʱ��"+d.toString());
		//��ʱ��api����ʱ������û��
		System.out.println("����ʱ��"+d.toLocaleString());
		System.out.println("��������ʱ��"+d.toGMTString());
		
		

	}

}
