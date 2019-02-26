package com.bb;

public class Demo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Demo d=new Demo();
		Class cls=d.getClass();
		System.out.println(cls.getName());

	}

}
