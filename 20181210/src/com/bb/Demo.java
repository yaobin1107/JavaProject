package com.bb;


 final class AA{
	public  void f1(int a){
		
	}
}


public class Demo {
	//�ڶ���ʱ
	final int a;
	//�ڿ��г�ʼ��
	{
	//��������ʼ��	
	}
	public Demo(int a){
		this.a=a;
	}
	public Demo(){
		a=77;
	}
	public void f1(){
		
	}
	
	
	
	public static void main(String[] args) {
		//Demo d=new Demo(3);
		Demo d=new Demo();
		final int b;
		
		System.out.println(d.a);
		//System.out.println(b);
		
		
	}

}
