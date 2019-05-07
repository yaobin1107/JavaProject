package com.xupt.api;

public class Test3 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("abcdefg");
		//s.delete(0, 2);
		//s.deleteCharAt(3);
		//s.setCharAt(3, 'm');

		s.insert(1, 'm');
		System.out.println(s);

	}

}
