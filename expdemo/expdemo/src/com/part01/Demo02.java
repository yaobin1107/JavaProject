package com.part01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

/**
 * 所有异常类都来自于java.lang.Throwable所有异常类分为两种
 * java.lang.Exception定义了轻微的错误 
 * java.lang.Error 错误
 * 
 * 
 * java.lang.RuntimeException及子类系统可以帮你处理
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {

				try {
					FileInputStream fi=new FileInputStream("c:\\aa.jpg");
				} catch (FileNotFoundException e) {
					 System.out.println("找不到...");
					//e.printStackTrace();
				}
		
		
	}

}
