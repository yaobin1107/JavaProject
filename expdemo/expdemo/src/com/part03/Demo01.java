package com.part03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo01 {

	public static void main(String[] args) throws Exception {
		System.out.println(div(10,1));
	
			UsbRead();
		

	}
	
	//���ڷ����������������еĴ���ο��ܲ����쳣�����Ǿ�ֱ�Ӵ���
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
	
	//����������봦���쳣���Ͱ�����쳣���������ĵ����ߣ�����ʽ���Ƿ�����throws   �쳣�б�
	public static void readFile() throws FileNotFoundException,IndexOutOfBoundsException
	{
		FileInputStream f=new FileInputStream("c:\\");

	}
	
	public static void UsbRead()throws Exception
	{
	
				readFile();
			
		
	}

}
