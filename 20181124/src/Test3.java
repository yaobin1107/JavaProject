import java.util.Scanner;


public class Test3 {

	public static void main(String[] args) {
		//�Ӽ�������һ�����֣��ж�������ִ���0��С��0���ǵ���0
		Scanner s=new Scanner(System.in);
		System.out.println("������һ������");
		int a=s.nextInt();
		if(a>0){
			System.out.println(a+"����0");
		}else if(a<0){
			System.out.println(a+"С��0");
		}else{
			System.out.println(a+"����0");
		}
	}

}
