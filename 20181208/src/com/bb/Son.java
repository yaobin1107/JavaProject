package com.bb;

public class Son extends Father{
	
	
	{
		System.out.println("��������");
	}
	static int age=f1();
	static int f1(){
		System.out.println("���ྲ̬���Լ���");
		return 18;
	}
	String f3(){
		System.out.println("������ͨ���Լ���");
		return "������";
	}
	static{
		System.out.println("���ྲ̬��");
	}
	
	public Son(){
		System.out.println("���๹����");
	}
	String name=f3();
	public static void main(String[] args) {
		Son s=new Son();
		
	}

}
