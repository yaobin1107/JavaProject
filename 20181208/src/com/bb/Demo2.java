package com.bb;

class Foo {
	public void finalize(){
		System.out.println("我曾经来过。。。");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Foo f=new Foo();
		Foo ff=f;
		f=null;
		//喊环卫工过来拾掇垃圾
		System.gc();
		System.out.println("over");

	}

}
