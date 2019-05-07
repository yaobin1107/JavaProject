
class FF{
	int a=28;
	String name="胖墩";
}

class C{
	int x=8;
}
class D{
	int y=10;
}

class A extends C{
	int a=8;
	private  String name="王二小";
	class B extends D{
		String name="嘎子";
		public void f1(){
			System.out.println(a);
			System.out.println(A.this.name);
			System.out.println(x);
			System.out.println(y);
			
		}
		class F extends FF{
			public void f1(){
				System.out.println(name);
				System.out.println(x);
				System.out.println(y);
			}
		}
	}
	B b=new B();
	
	public void f2(){
		b.f1();
	}
}
public class Demo2 {

	public static void main(String[] args) {
		//在外部类之外实例化内部类，内部类会依赖外部类的引用对象
//		A a=new A();
//		A.B b=a.new B();
//		b.f1();
		
		A a=new A();
		A.B b=a.new B();
		A.B.F f=b.new F();
		f.f1();
	}

}
