package com.bb;

class Foo {
	public void finalize(){
		System.out.println("����������������");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Foo f=new Foo();
		Foo ff=f;
		f=null;
		//������������ʰ������
		System.gc();
		System.out.println("over");

	}

}
