package com.part02;

import java.util.Scanner;
/**
 * try块中是可能发生异常的代码段
 * 如果某一行发生异常（系统生成一个异常类对象）,后面代码不执行，跳到catch语句块
 * @author Administrator
 *
 */
public class Demo03 {

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
		    }

	}

}
