package com.bb;

public class Son extends Father{
	
	
	{
		System.out.println("子类代码块");
	}
	static int age=f1();
	static int f1(){
		System.out.println("子类静态属性加载");
		return 18;
	}
	String f3(){
		System.out.println("子类普通属性加载");
		return "王健林";
	}
	static{
		System.out.println("子类静态块");
	}
	
	public Son(){
		System.out.println("子类构造器");
	}
	String name=f3();
	public static void main(String[] args) {
		Son s=new Son();
		
	}

}
