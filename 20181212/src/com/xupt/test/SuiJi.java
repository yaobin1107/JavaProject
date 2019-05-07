package com.xupt.test;

public class SuiJi {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		//65-91;
		
		for (int i = 0; i < 10; i++) {
			int sj=(int)(Math.random()*26+65);
			sb.append((char)sj);
		}
		System.out.println(sb);
		//´òÂÒ
		for (int i = 0; i < 10; i++) {
			
			int n=(int)(Math.random()*sb.length());
			int m=(int)(Math.random()*sb.length());
			char temp=sb.charAt(n);
			sb.setCharAt(n, sb.charAt(m));
			sb.setCharAt(m, temp);
		}
		
		System.out.println(sb);
	}

}
