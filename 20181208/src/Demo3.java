

class Student{
	static{
		System.out.println("我是静态块");
	}
	//类属性
	static String name=setName();
	
	public static String setName(){
		System.out.println("静态属性执行 啦");
		return "刘能";
	}
	//对象属性
	int age=setAge();
	
	{
		System.out.println("我是构造块");
	}
	//对象方法
	public int setAge(){
		System.out.println("普通属性执行啦");
		return 18;
	}
	//类方法
	public static void f1(){
		System.out.println("静态方法");
	}
	public Student(){
		System.out.println("我是构造器");
	}
	
	public void study(){
		System.out.println("good good study,day day up!");
	}
}



public class Demo3 {

	public static void main(String[] args) {
		//Student s=new Student();
		//System.out.println(Student.name);
		Student.f1();
		
	}

}
