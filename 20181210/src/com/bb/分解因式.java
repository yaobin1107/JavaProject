package com.bb;

import java.util.Scanner;

public class 分解因式 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个数字");
		int num=s.nextInt(); //12
		int x=2;
		while(num!=1){
			if(num%x==0){
				System.out.println(x);
				num=num/x;
			}else{
				x++;
			}	
		}
	}

}
