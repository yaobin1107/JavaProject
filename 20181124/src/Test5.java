import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		//输入一个年份，输入一个月份，判断这个月有多少天？
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个年份");
		int year=s.nextInt();
		System.out.println("请输入一个月份");
		int month=s.nextInt();
		
		switch(month){
			case 1:
				System.out.println("31天");
				break;
			case 2:
				if((year%4==0&&year%100!=0)||year%400==0){
					
					System.out.println("29天");
				}else{
					System.out.println("28天");
				}
				break;
			case 3:
				System.out.println("31天");
				break;
			case 4:
				System.out.println("30天");
				break;
			case 5:
				System.out.println("31天");
				break;
			case 6:
				System.out.println("30天");
				break;
			case 7:
				System.out.println("31天");
				break;
			case 8:
				System.out.println("31天");
				break;
			case 9:
				System.out.println("30天");
				break;
			case 10:
				System.out.println("31天");
				break;
			case 11:
				System.out.println("30天");
				break;
			case 12:
				System.out.println("31天");
			default:
				System.out.println("你个二货,连个月份都输不对！！");
				break;
		}
	}

}
