package com.cc;

class Chuan{
	public  void piaofu(){
		System.out.println("ƮѽƮ��Ʈ�����԰�");
	}
}
public class Person {
	Chuan c=new Chuan();
	public void guojiang(){
		c.piaofu();
	}	
	public static void main(String[] args) {
		Person p=new Person();
		Chuan c=new Chuan();
		p.guojiang();
	}
}
