package com.bb;

public class Father {
	String name=f2();
	static int age=f1();
	static int f1(){
		System.out.println("父类静态属性加载");
		return 18;
	}
	String f2(){
		System.out.println("父类普通属性加载");
		return "王健林";
	}
	static{
		System.out.println("父类静态块");
	}
	{
		System.out.println("父类代码块");
	}
	public Father(){
		System.out.println("父类构造器");
	}
}
