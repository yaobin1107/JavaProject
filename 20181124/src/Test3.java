import java.util.Scanner;


public class Test3 {

	public static void main(String[] args) {
		//从键盘输入一个数字，判断这个数字大于0，小于0还是等于0
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个数字");
		int a=s.nextInt();
		if(a>0){
			System.out.println(a+"大于0");
		}else if(a<0){
			System.out.println(a+"小于0");
		}else{
			System.out.println(a+"等于0");
		}
	}

}
