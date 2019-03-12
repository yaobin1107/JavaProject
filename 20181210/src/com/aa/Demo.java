package com.aa;

class A{
	static int a=f1();
	static int f1(){
		System.out.println("父类静态属性加载");
		return 5;
	}
	int b=f2();
	int f2(){
		System.out.println("父类普通属性加载");
		return 6;
	}
	
	static{
		System.out.println("父类静态块");
	}
	{
		System.out.println("父类构造快");
	}
	public A(){
		System.out.println("父类构造器");
	}
}
class B extends A{
	static int a=f3();
	static int f3(){
		System.out.println("子类静态属性加载");
		return 5;
	}
	int b=f4();
	int f4(){
		System.out.println("子类普通属性加载");
		return 6;
	}
	
	static{
		System.out.println("子类静态块");
	}
	{
		System.out.println("子类构造快");
	}
	public B(){
		System.out.println("子类构造器");
	}
}


public class Demo {

	public static void main(String[] args) {
		new B();
	}

}
