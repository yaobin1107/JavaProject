
class Person{
	
	
	String name="啦啦";
	public  void eat(){
		System.out.println(1);
	}
	public static void sleep(){
		System.out.println("睡席梦思");
	}
	
}

class Teacher extends Person{
	
	
	
	String name="安老师";
	public  void eat(){
		System.out.println(2);
	}
	public static void sleep(){
		System.out.println("睡茅草窝");
	}
	public void teach(){}
}
class Nurse extends Person{
	String name="小白";
	public  void eat(){
		System.out.println(3);
	}
}


public class Test2 {

	public static void main(String[] args) {
		//向上转型（把老师对象的引用当做父类类型person）
//		Person t=new Teacher();
//		t.sleep();
//		System.out.println(t.name);
//		Person n=new Nurse(); 
//		n.eat();
//		System.out.println(n.name);
		
		
		Person p=new Person();
		
		
		//此时向下转转型成功的原因是已经发生了向上转型
		Teacher t=(Teacher)new Person();
		

	}

}
