package com.aa;

abstract class Person{
	public void sleep(){
		System.out.println("睡席梦思");
	}
	public abstract void eat();
}

abstract class AA{
	public void work(){
		System.out.println("工作");
	}
}

class Chinese extends Person{
	public void eat() {
		System.out.println("中国人用筷子吃");
	}
}


public class Demo2 {

	public static void main(String[] args) {
		Person p=new Person(){
			public void eat() {
				System.out.println("中国人用筷子吃");
			}
			
			class B{
				public void ff(){
					System.out.println("晕死啦！！");
				}
			}
			
			
			
		};
		
		
		AA a=new AA(){
			
		};
		p.sleep();
		p.eat();
		
		a.work();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
