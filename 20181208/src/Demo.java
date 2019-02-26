
//人说年龄

class Person{
	static String username;
	static String password;
	String name;
	//私有的访问修饰符，只能在本类当中使用
	private int age;
	//对外提供了一个公有的访问方式
	public void setAge(int age){
		if(age<0||age>150){
			throw new RuntimeException("非法年龄");
		}
		this.age=age;
	}
	public Person(){
		
	}
	public Person(int age){
		if(age<0||age>150){
			throw new RuntimeException("非法年龄");
		}
		this.age=age;
	}
	public void speak(){
		System.out.println("我的年龄是"+this.age);
	}
}
public class Demo {

	public static void main(String[] args) {
//		Person p=new Person();
//		//不让外界糟蹋你的年龄，那么就别让外界访问到你的年龄，
//		//言外之意就是让年龄对外隐藏起来
//		//p.age=-18;
//		p.setAge(18);
//		p.speak();
		Person p1=new Person();
		p1.username="张三";
		p1.password="888888";
		System.out.println(p1.username+":"+p1.password);
		
		Person p2=new Person();
		
//		p1.password="888888";
		System.out.println(p2.username+":"+p2.password);
		
		
		
		
	}

}
