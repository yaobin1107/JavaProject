abstract class Template{
	//ģ�巽������ͬ���룩
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
	//��ͬ�Ĵ��룬�仯�Ĵ���
	public abstract void code();
}


//�û�1,�����for
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
//�û�2��while
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
