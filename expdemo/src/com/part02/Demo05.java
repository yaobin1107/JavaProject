package com.part02;

import java.util.Scanner;
/**
 * finally ������û���쳣finally��Ҫִ��
 * һ����ļ����������й���û���쳣��Ҫ�����Ĺر��ļ�
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) 
	{
		
		    try {
		    	   System.out.println(args[2]);
						 Scanner sc=new Scanner(System.in);
						 System.out.print("��1��");
						 String s1=sc.next();
						 System.out.print("��2��");
						 String s2=sc.next();
						 
						 int re=Integer.parseInt(s1)/Integer.parseInt(s2); //�����0�����оͻ����ɶ��� ArithmeticException rr=new ArithmeticException();
						 System.out.println(re);
		    }
		    catch(ArithmeticException e)
		    {
		    	System.out.println("��������Ϊ�㣡"+e.getMessage());
		    }catch(NumberFormatException e)
		    {
		    	System.out.println("���������֣�"+e.getMessage());
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
