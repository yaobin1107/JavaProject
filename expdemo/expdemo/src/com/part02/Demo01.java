package com.part02;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("��1��");
	 String s1=sc.next();
	 System.out.print("��2��");
	 String s2=sc.next();
	 
	 int re=Integer.parseInt(s1)/Integer.parseInt(s2);
	 System.out.println(re);
		

	}

}
