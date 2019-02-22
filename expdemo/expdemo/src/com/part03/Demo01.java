package com.part03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo01 {

	public static void main(String[] args) throws Exception {
		System.out.println(div(10,1));
	
			UsbRead();
		

	}
	
	//对于方法来讲，方法体中的代码段可能产生异常，我们就直接处理
	public static int div(int i,int j)
	{
		
		int re=0;
		try {
			re = i/j;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return re;
	}
	
	//方法如果不想处理异常，就把这个异常交给方法的调用者，，格式就是方法后throws   异常列表
	public static void readFile() throws FileNotFoundException,IndexOutOfBoundsException
	{
		FileInputStream f=new FileInputStream("c:\\");

	}
	
	public static void UsbRead()throws Exception
	{
	
				readFile();
			
		
	}

}
