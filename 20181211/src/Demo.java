//������
abstract class  Foo{
	public Foo(){
		
	}
	
	public void f1(){
		
	}
	//���󷽷�
	public abstract void f2();
	
	
}

abstract  class Person{
	private String name;
	private int age;
	
	public  abstract void eat();
	public abstract void  sayhi();
	public  void sleep(){
		
		System.out.println("����˯");
	}
}

 class Chinese extends Person{
	
	 public Chinese(){
		 super();
		 
	 }
	 
	public void eat(){
		System.out.println("�й����ÿ��ӳ�");
	}

	@Override
	public void sayhi() {
		System.out.println("�������");
		
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
