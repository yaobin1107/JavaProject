import java.util.Scanner;


public class Test7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0;
		int b=0;
		while(true){
		System.out.println("1:���� 2:ʯͷ 3:��");
		int user=s.nextInt();
		
		int computer=(int)(Math.random()*3+1);
		
		switch(user){
			case 1:
				if(computer==1){
					System.out.println("��������Ǽ�������������Ǽ�����ƽ��");
				}
				if(computer==2){
					System.out.println("����");
					b++;
				}
				if(computer==3){
					System.out.println("��Ӯ");
					a++;
				}
				break;
			case 2:
				if(computer==1){
					System.out.println("��Ӯ");
					a++;
				}
				if(computer==2){
					System.out.println("ƽ��");
				}
				if(computer==3){
					System.out.println("����");
					b++;
				}
				break;
			case 3:
				if(computer==1){
					System.out.println("����");
					b++;
				}
				if(computer==2){
					System.out.println("��Ӯ");
					a++;
				}
				if(computer==3){
					System.out.println("ƽ��");
				}
				break;
			default:
				System.out.println("�����������ú�����Ϸ");
		}
			System.out.println("��Ӯ��"+a+"��,����Ӯ��"+b+"��");
			if(a==2){
				System.out.println("winner is you");
				break;
			}
			if(b==2){
				System.out.println("winner is computer");
				break;
			}
		
		//����while�Ľ���
		}
		

	}

}
