//抽象类
abstract class  Foo{
	public Foo(){
		
	}
	
	public void f1(){
		
	}
	//抽象方法
	public abstract void f2();
	
	
}

abstract  class Person{
	private String name;
	private int age;
	
	public  abstract void eat();
	public abstract void  sayhi();
	public  void sleep(){
		
		System.out.println("躺着睡");
	}
}

 class Chinese extends Person{
	
	 public Chinese(){
		 super();
		 
	 }
	 
	public void eat(){
		System.out.println("中国人用筷子吃");
	}

	@Override
	public void sayhi() {
		System.out.println("哥们你好");
		
	}
}




public  class Demo {

	public static void main(String[] args) {
		//Foo f=new Foo();
//		Person p=new Person();
//		p.sleep();
//		p.eat();
//		Chinese c=new Chinese();
//		c.eat();
//		xian x=new xian();
//		x.sayhi();
//		x.sleep();
		Chinese c=new Chinese();
		c.sleep();
	}

}
