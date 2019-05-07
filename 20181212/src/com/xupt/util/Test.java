package com.xupt.util;

/**
 * 程序：就是磁盘上的一个文件
 * 进程：程序运行后形成的进程，运行中的程序
 * 线程：相当于进程的子进程，是一段独立的代码空间，看成一个独立的小程序
 * 
 * 什么时候用线程：多件事情同时做的时候，一起做
 * 
 */
public class Test {

	public static void main(String[] args) 
	{
		 for(int i=0;i<100;i++)
		 {
			 System.out.println(i);
		 }
		 for(int i=1000;i<2000;i++)
		 {
			 System.out.println(i);
		 }
	}

}

