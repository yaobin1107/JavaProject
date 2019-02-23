
package 类;
import java.util.Date;
import java.util.Scanner;


class Animal{
	public static void f1(int a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Date d=new Date();
	}
}
public class Person {
	
	public static String name;
	Animal animal;
	byte b;
	short s;
	public int age;
	long l;
	float f;
	double d;
	char c;
	boolean bb;
	public String address;
	
	
	public void eat(){
		System.out.println(name+"爱吃粑粑");
	}
	public void drink(){
		
	}
	public static void main(String[] args) {
		//实例化一个对象,具体化
		Person p=new Person();
		//调用p对象里面的eat方法
		//给p对象传递eat消息
		p.eat();
		//System.out.println(p.name);
		System.out.println(p.s);
		System.out.println(p.b);
		System.out.println(p.age);
		System.out.println(p.l);
		System.out.println(p.f);
		System.out.println(p.d);
		System.out.println(p.c);
		System.out.println(p.bb);
		System.out.println(p.address);
		System.out.println(p.animal);
		

		
		
		
		
		
		
	}
}
