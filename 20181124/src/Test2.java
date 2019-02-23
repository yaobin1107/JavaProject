import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		//引用数据类型Scanner对象
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		//获取一个键盘输入的数字
		//s.next识别空格和回车
		//s.nextLine 只识别回车
		String result=s.nextLine();
		System.out.println(result);
	}
}
