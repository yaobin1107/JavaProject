import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		String[][] str={
						{"平","赢","输"},
						{"输","平","赢"},
						{"赢","输","平"}
		};
		Scanner s=new Scanner(System.in);
		System.out.println("0 剪刀 1 石头 2 布");
		int user=s.nextInt();
		int computer=(int)(Math.random()*1000%3);
		String[] ss={"剪刀","石头","布"};
		System.out.println("电脑出的是"+ss[computer]);
		System.out.println(str[computer][user]);
	}
}	
