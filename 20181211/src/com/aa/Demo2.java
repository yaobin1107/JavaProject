package com.aa;

abstract class Person{
	public void sleep(){
		System.out.println("˯ϯ��˼");
	}
	public abstract void eat();
}

abstract class AA{
	public void work(){
		System.out.println("����");
	}
}

class Chinese extends Person{
	public void eat() {
		System.out.println("�й����ÿ��ӳ�");
	}
}


public class Demo2 {

	public static void main(String[] args) {
		Person p=new Person(){
			public void eat() {
				System.out.println("�й����ÿ��ӳ�");
			}
			
			class B{
				public void ff(){
					System.out.println("����������");
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
