package com.aa;


class A{
	static int   a=18;
	public static void xx(){
		
	}
	static class B{
		int a=8;
		public void f1(){
			System.out.println(A.a);
			xx();
		}
	}
	B b=new B();
	
	public void f2(){
		b.f1();
	}
	
}

public class Demo{

	public static void main(String[] args) {
		//��̬�ڲ���ֱ��ͨ���ⲿ����ʣ�����Ҫ�ⲿ��ʵ������
		A.B b=new A.B();
		b.f1();
	}

}
