abstract class Template{
	//模板方法（相同代码）
	public void template(){
		long start=System.nanoTime();
		
//		for(int i=1;i<=100000;i++){
//			;
//		}
		code();
		int i=1;
		while(i<=100000){
			;
			i++;
		}
		long end=System.nanoTime();
		long cha=end-start;
		System.out.println(cha);
	}
	//不同的代码，变化的代码
	public abstract void code();
}


//用户1,想测试for
class User1 extends Template{
	public void template(){
		long start=System.nanoTime();
		
//		for(int i=1;i<=100000;i++){
//			;
//		}
		this.code();
		int i=1;
		while(i<=100000){
			;
			i++;
		}
		long end=System.nanoTime();
		long cha=end-start;
		System.out.println(cha);
	}
	
	public void code() {
		for(int i=1;i<=100000;i++){
			;
		}
		
	}
	
}
//用户2，while
class User2 extends Template{

	@Override
	public void code() {
		int i=1;
		while(i<=100000){
			
			i++;
		}
		
	}
	
}


public class Test {

	public static void main(String[] args) {
		Demo1 u1=new Demo1();
		//u1.template();
		User2 u2=new User2();
		u2.template();

	}

}
