package com.aa;

class Foo{
	//�ֲ��ڲ���
	public void f1(){
		final int a=18;
		class Bar{
			//int a=8;
			public void f2(){
				System.out.println("�������");
				System.out.println(a);
			}
		}
		Bar b=new Bar();
		b.f2();	
	}
	
	
}


public class Demo1 {

	public static void main(String[] args) {
		Foo f=new Foo();
		f.f1();
	}

}
