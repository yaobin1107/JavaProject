import java.util.Scanner;


public class Test7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0;
		int b=0;
		while(true){
		System.out.println("1:剪刀 2:石头 3:布");
		int user=s.nextInt();
		
		int computer=(int)(Math.random()*3+1);
		
		switch(user){
			case 1:
				if(computer==1){
					System.out.println("你输入的是剪刀，电脑输的是剪刀，平局");
				}
				if(computer==2){
					System.out.println("你输");
					b++;
				}
				if(computer==3){
					System.out.println("你赢");
					a++;
				}
				break;
			case 2:
				if(computer==1){
					System.out.println("你赢");
					a++;
				}
				if(computer==2){
					System.out.println("平局");
				}
				if(computer==3){
					System.out.println("你输");
					b++;
				}
				break;
			case 3:
				if(computer==1){
					System.out.println("你输");
					b++;
				}
				if(computer==2){
					System.out.println("你赢");
					a++;
				}
				if(computer==3){
					System.out.println("平局");
				}
				break;
			default:
				System.out.println("你个二货，请好好玩游戏");
		}
			System.out.println("你赢了"+a+"局,电脑赢了"+b+"局");
			if(a==2){
				System.out.println("winner is you");
				break;
			}
			if(b==2){
				System.out.println("winner is computer");
				break;
			}
		
		//这是while的结束
		}
		

	}

}
