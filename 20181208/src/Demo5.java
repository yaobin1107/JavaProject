
class A{
	static String name="С��";
	
	 
		{
			System.out.println("��������");
		}
		public A(){
			System.out.println("���๹����");
		}
		@Override
		public String toString() {
			return "A [name=" + name + "]";
		}
}


public class Demo5 extends A{
	String name="С��";
	
	{
		System.out.println("�����");
	}
	public Demo5(){
		System.out.println("������");
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
