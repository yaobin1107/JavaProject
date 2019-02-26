
public class Demo {
	public static String name;
	static int age,weight=18;
	public static void f1(){
		//局部变量
		int age;
		age=18;
		System.out.println(age);
		System.out.println(name);
	}
	
	public int f3(){
		if(1<2)
			return 5;
		
		return 6;
	}
	
	
	public static void main(String[] args) {
		System.out.println(age);
		System.out.println(weight);
	}
}
