package com.an;

public class Test {
	public static void main(String[] args) {
		Person p=new Person();
		Piano pp=new Piano();
		p.play(pp);
		Guitar g=new Guitar();
		p.play(g);
		harp h=new harp();
		p.play(h);
		
	}
}
//������
interface instruments{
	public abstract void song();
}

//��
class Person{
	public void play(instruments p){
		p.song();
	}
	
}
class A{
	
}

//����
class Piano extends A implements instruments{
	public void song(){
		System.out.println("һ��һ��������");
	}
}
//����
class  Guitar implements instruments{
	public void song(){
		System.out.println("ҡ��������");
	}
}
//��ָħ��
class harp implements instruments{
	public void song(){
		System.out.println("ʮ�������..");
	}
}
