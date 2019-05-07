import java.util.Date;
//作者定义的
abstract class Template{
	//模板方法
	public final void template(){
		long start=System.nanoTime();
		//具体实现过程
		code();
		long end=System.nanoTime();
		System.out.println(end-start);
	}
	
	public abstract void code();
}

//这个类是用户定义的
class TestFor extends Template{
	
	public void code() {
		for (int i = 1; i <=100000; i++) {
			;
		}
		
	}
	
}
class TestWhile extends  Template{

	
	public void code() {
		int i=1;
		while(i<=100000){
			i++;
		}
		
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
//		//程序循环100000次需要消耗的时间
//		//Date start=new Date();
//		long start=System.nanoTime();
////		for (int i = 1; i <=100000; i++) {
////			;
////		}
//		int i=1;
//		while(i<=100000){
//			i++;
//		}
//		//Date end=new Date();
//		long end=System.nanoTime();
//		System.out.println(end-start);
		
		TestFor t=new TestFor();
		t.template();
		
		TestWhile t1=new TestWhile();
		t1.template();
		
		
		
		
		
	}

}
