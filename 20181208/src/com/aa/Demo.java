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
		System.out.println("�Է�");
		return 5;
	}
}

class ��˼�� extends ��γ� {

}

class ��γ� {

}

class me extends ��˼�� {

}

class Student extends Person {

	int age = 8;

	// ������д������
	public int eat() throws ClassNotFoundException {
		// super.eat();
		System.out.println("�Ҿ��ǰ�����");
		return 6;
	}

	public void study() {
		System.out.println("ѧ����ѧϰ");
	}
}

class SuperMan extends Person {

	public void fly() {
		System.out.println("�ݰ������ǣ���");
	}
}

class tiaozi extends Person {
	public void zhuaren() {
		System.out.println("�㱻������");
	}
}

public class Demo {
	public static void main(String[] args) {
		Student s = new Student();

		s.setName("��˼��");
		System.out.println(s.getName());
		// s.eat();

//		Person p=new Student();

		Student ss = new Student();
		System.out.println(ss.age);
//		System.out.println(ss.eat());
	}
}
