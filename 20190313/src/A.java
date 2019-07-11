
public interface A {
	

	int age=10;
	public void f1();
	public void f2();
	//public A(){}
}

class CC implements A,D{
	
	public CC(){
		super();
	}
	
	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}
	
}

interface C{
	
}
interface D{
	
}

interface F extends A,C,D{}
 class B implements A,C{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}
	
}
