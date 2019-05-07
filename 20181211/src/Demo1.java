import java.util.Date;
//���߶����
abstract class Template{
	//ģ�巽��
	public final void template(){
		long start=System.nanoTime();
		//����ʵ�ֹ���
		code();
		long end=System.nanoTime();
		System.out.println(end-start);
	}
	
	public abstract void code();
}

//��������û������
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
//		//����ѭ��100000����Ҫ���ĵ�ʱ��
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
