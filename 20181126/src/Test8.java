import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		String[][] str={
						{"ƽ","Ӯ","��"},
						{"��","ƽ","Ӯ"},
						{"Ӯ","��","ƽ"}
		};
		Scanner s=new Scanner(System.in);
		System.out.println("0 ���� 1 ʯͷ 2 ��");
		int user=s.nextInt();
		int computer=(int)(Math.random()*1000%3);
		String[] ss={"����","ʯͷ","��"};
		System.out.println("���Գ�����"+ss[computer]);
		System.out.println(str[computer][user]);
	}
}	
