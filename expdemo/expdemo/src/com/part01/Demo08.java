package com.part01;

public class Demo08 {

	public static void main(String[] args)throws Exception {
	
		Animal a=new Dog();
		Cat c1=new Cat();
		Dog d1=new Dog();
		
		
		Animal a1=d1;
		
		Dog d2=(Dog)a;
		Cat c2=(Cat)a;
		
		
		

	}
	
	static class Animal{}
	static class Dog extends Animal{}
	static class Cat extends Animal{}

}
