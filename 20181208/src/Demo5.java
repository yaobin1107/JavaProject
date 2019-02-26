
class A{
	static String name="小黑";
	
	 
		{
			System.out.println("父类代码块");
		}
		public A(){
			System.out.println("父类构造器");
		}
		@Override
		public String toString() {
			return "A [name=" + name + "]";
		}
}


public class Demo5 extends A{
	String name="小白";
	
	{
		System.out.println("代码块");
	}
	public Demo5(){
		System.out.println("构造器");
	}
	public static  void f1(){
		
//		System.out.println(super.name);
	} 
	
	
	@Override
	public String toString() {
		return "Demo5 [name=" + name + "]";
	}
	public static void main(String[] args) {
		
		Demo5 d=new Demo5();
		d.f1();
	}

}
