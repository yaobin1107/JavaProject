package com.aa;

class A{
	static int a=f1();
	static int f1(){
		System.out.println("���ྲ̬���Լ���");
		return 5;
	}
	int b=f2();
	int f2(){
		System.out.println("������ͨ���Լ���");
		return 6;
	}
	
	static{
		System.out.println("���ྲ̬��");
	}
	{
		System.out.println("���๹���");
	}
	public A(){
		System.out.println("���๹����");
	}
}
class B extends A{
	static int a=f3();
	static int f3(){
		System.out.println("���ྲ̬���Լ���");
		return 5;
	}
	int b=f4();
	int f4(){
		System.out.println("������ͨ���Լ���");
		return 6;
	}
	
	static{
		System.out.println("���ྲ̬��");
	}
	{
		System.out.println("���๹���");
	}
	public B(){
		System.out.println("���๹����");
	}
}


public class Demo {

	public static void main(String[] args) {
		new B();
	}

}
