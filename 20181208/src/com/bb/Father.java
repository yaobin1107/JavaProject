package com.bb;

public class Father {
	String name=f2();
	static int age=f1();
	static int f1(){
		System.out.println("���ྲ̬���Լ���");
		return 18;
	}
	String f2(){
		System.out.println("������ͨ���Լ���");
		return "������";
	}
	static{
		System.out.println("���ྲ̬��");
	}
	{
		System.out.println("��������");
	}
	public Father(){
		System.out.println("���๹����");
	}
}
