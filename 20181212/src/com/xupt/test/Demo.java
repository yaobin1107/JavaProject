package com.xupt.test;
class A{
	void f1() {
		System.out.println("AAA");
	}
	void f2() {
		System.out.println("qqq");
	}
}
public class Demo {
	public static void main(String[] args) {
		A a = new A(){
			void f1() {
				System.out.println("BBB");
			}
			void f2() {
				System.out.println("CCC");
			}
		};
		a.f1();
		//��������ת�ͺ�������еķ�������ʹ��
		a.f2();
	}
}