
public class Test4 {

	public static void main(String[] args) {
		int x=3;
		boolean b=true;
		short s=2;
		byte bb=1;
		char c='a';
		String ss="abc";
		MyEnum me=MyEnum.l1;
		//ֻ��byte short int char��������������
		//jdk1.7�󻹿���дString��enum���͵�����
		switch(x){
			case 1:
				System.out.println(1);
			case 2:
				System.out.println(2);
			case 3:
				System.out.println(3);
				//����switch���
				break;
			case 4:
				System.out.println(4);
		}
	}

}
