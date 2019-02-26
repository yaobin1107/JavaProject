package com.bb;

class Person{
	String name;
	int age;
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	//重写了object的equals方法
	public boolean equals(Person p2){
		
		return this.name.equals(p2.name)&&this.age==p2.age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Person p1=new Person("小红",18);
		Person p2=new Person("小红",18);
		String str=new String("abc");
		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println(str);
		System.out.println(str.toString());
	}

}
