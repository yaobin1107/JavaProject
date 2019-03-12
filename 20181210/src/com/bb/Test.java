package com.bb;
class A {
	A(String s) {
		System.out.println("X");
	}
}
class B extends A {
	B(String s) {
		super("abc");
		System.out.println("Y");
	}
}
class C extends B {
	C(String s) {
		super("xx");
		System.out.println("3");
	}
}
public class Test {
	public static void main(String[] args) {
		int[] a=new int[10];
		System.out.println(a.length);
		String s=new String("abc");
		System.out.println(s.length());
	}
}