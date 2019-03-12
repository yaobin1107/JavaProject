
class Foo {
	public Foo() {
		System.out.println("Foo()"); //3 6
	}
	
	{
		System.out.println("Foo: { }"); //2 5
	}
}
class Bar extends Foo {
	public Bar() {
		System.out.println("Bar()"); //4 7
	}
	static {
		System.out.println("Bar static: { }"); //1
	}
	
}



public class Demo2 {

	public static void main(String[] args) {
			new Bar();
			new Bar();
	}

}
