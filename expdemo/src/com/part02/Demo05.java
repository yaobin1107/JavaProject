package com.part02;

import java.util.Scanner;
/**
 * finally 不论有没有异常finally都要执行
 * 一般打开文件，操作，有管有没有异常都要正常的关闭文件
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) 
	{
		
		    try {
		    	   System.out.println(args[2]);
						 Scanner sc=new Scanner(System.in);
						 System.out.print("数1：");
						 String s1=sc.next();
						 System.out.print("数2：");
						 String s2=sc.next();
						 
						 int re=Integer.parseInt(s1)/Integer.parseInt(s2); //如果除0，此行就会生成对像 ArithmeticException rr=new ArithmeticException();
						 System.out.println(re);
		    }
		    catch(ArithmeticException e)
		    {
		    	System.out.println("除数不能为零！"+e.getMessage());
		    }catch(NumberFormatException e)
		    {
		    	System.out.println("请输入数字！"+e.getMessage());
		    }catch(Exception e)
		    {
		    	
		    	
		    	System.out.println("^_^");
		    	
		    	return ;
		    }finally {
		    	System.out.println("finally.........");
		    }

		    System.out.println("end finally....");
	}

}
