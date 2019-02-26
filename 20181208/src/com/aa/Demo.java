package com.aa;

import java.io.FileNotFoundException;

class Person {
	String name;
	int age = 18;
	String sex;

	public Person() {

	}

	public void setName(String name) {

		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int eat() throws ClassNotFoundException {
		System.out.println("吃饭");
		return 5;
	}
}

class 王思聪 extends 李嘉诚 {

}

class 李嘉诚 {

}

class me extends 王思聪 {

}

class Student extends Person {

	int age = 8;

	// 方法重写，覆盖
	public int eat() throws ClassNotFoundException {
		// super.eat();
		System.out.println("我就是爱吃土");
		return 6;
	}

	public void study() {
		System.out.println("学生爱学习");
	}
}

class SuperMan extends Person {

	public void fly() {
		System.out.println("拜拜了您那！！");
	}
}

class tiaozi extends Person {
	public void zhuaren() {
		System.out.println("你被逮捕了");
	}
}

public class Demo {
	public static void main(String[] args) {
		Student s = new Student();

		s.setName("王思聪");
		System.out.println(s.getName());
		// s.eat();

//		Person p=new Student();

		Student ss = new Student();
		System.out.println(ss.age);
//		System.out.println(ss.eat());
	}
}
