package com.bb;

class A{
	int age=18;
	
	public A(){
		System.out.println(456);
	}
	public A(int age){
		this.age=age;
	}
	
	public void run(){
		System.out.println("¸¸ÀàÅÜ¡£¡£¡£");
	}
}
class B extends A{
	int age=8;
	public B(){
		this(17);
		System.out.println("123");
	}
	public B(int age){
		super();
		this.age=age;
	}
	public void run(){
		super.run();
		//System.out.println("×ÓÀàÅÜ¡£¡£¡£");
	}
	
	public void speak(){
		System.out.println(this.age);
		System.out.println(super.age);
	}
}
public class Demo3 {

	public static void main(String[] args) {
		B b=new B();
	}

}
