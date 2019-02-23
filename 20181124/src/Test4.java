
public class Test4 {

	public static void main(String[] args) {
		int x=3;
		boolean b=true;
		short s=2;
		byte bb=1;
		char c='a';
		String ss="abc";
		MyEnum me=MyEnum.l1;
		//只能byte short int char这四种数据类型
		//jdk1.7后还可以写String和enum类型的数据
		switch(x){
			case 1:
				System.out.println(1);
			case 2:
				System.out.println(2);
			case 3:
				System.out.println(3);
				//跳出switch语句
				break;
			case 4:
				System.out.println(4);
		}
	}

}
