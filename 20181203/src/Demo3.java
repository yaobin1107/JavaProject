
public class Demo3 {

	public static void main(String[] args) {
		//实例化一个对象就会在内存中开辟空间,开辟2个空间
//		Person p=new Person("张三",18);
//		Person p1=new Person("张三",18);
//		System.out.println(p==p1);
//		System.out.println(p.equals(p1));
//		String str=new String("刘德华");
//		String str1=new String("刘德华");
//		System.out.println(str==str1);
//		System.out.println(str.equals(str1));
		
//		String str="abc";
//		String str1="abc";
//		System.out.println(str==str1);
//		System.out.println(str.equals(str1));
		
		String str="a";
		//编译器在编译时不会在常量存储区开辟好“abc”这个常量
		//而是在程序运行时动态的创建一个新对象相
		str="abc";
		str=str+"bc";
		String str1="abc";
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		
		byte[] b=new byte[1024*1024*171];
		
		
		
		
		

	}

}
