package com.part01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

/**
 * �����쳣�඼������java.lang.Throwable�����쳣���Ϊ����
 * java.lang.Exception��������΢�Ĵ��� 
 * java.lang.Error ����
 * 
 * 
 * java.lang.RuntimeException������ϵͳ���԰��㴦��
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {

				try {
					FileInputStream fi=new FileInputStream("c:\\aa.jpg");
				} catch (FileNotFoundException e) {
					 System.out.println("�Ҳ���...");
					//e.printStackTrace();
				}
		
		
	}

}
