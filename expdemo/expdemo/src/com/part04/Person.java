package com.part04;

public class Person {
   
	private int age;
	private int balance;
	private int sa;//1小学  2中学 3大学
	private String name;
	public Person() {}
	public Person(String name,int age,int balance,int sa) 
	{
		this.name=name;
		this.age=age;
		this.balance=balance;
		this.sa=sa;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getSa() {
		return sa;
	}
	public void setSa(int sa) {
		this.sa = sa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
