import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		//����һ����ݣ�����һ���·ݣ��ж�������ж����죿
		Scanner s=new Scanner(System.in);
		System.out.println("������һ�����");
		int year=s.nextInt();
		System.out.println("������һ���·�");
		int month=s.nextInt();
		
		switch(month){
			case 1:
				System.out.println("31��");
				break;
			case 2:
				if((year%4==0&&year%100!=0)||year%400==0){
					
					System.out.println("29��");
				}else{
					System.out.println("28��");
				}
				break;
			case 3:
				System.out.println("31��");
				break;
			case 4:
				System.out.println("30��");
				break;
			case 5:
				System.out.println("31��");
				break;
			case 6:
				System.out.println("30��");
				break;
			case 7:
				System.out.println("31��");
				break;
			case 8:
				System.out.println("31��");
				break;
			case 9:
				System.out.println("30��");
				break;
			case 10:
				System.out.println("31��");
				break;
			case 11:
				System.out.println("30��");
				break;
			case 12:
				System.out.println("31��");
			default:
				System.out.println("�������,�����·ݶ��䲻�ԣ���");
				break;
		}
	}

}
