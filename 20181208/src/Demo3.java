

class Student{
	static{
		System.out.println("���Ǿ�̬��");
	}
	//������
	static String name=setName();
	
	public static String setName(){
		System.out.println("��̬����ִ�� ��");
		return "����";
	}
	//��������
	int age=setAge();
	
	{
		System.out.println("���ǹ����");
	}
	//���󷽷�
	public int setAge(){
		System.out.println("��ͨ����ִ����");
		return 18;
	}
	//�෽��
	public static void f1(){
		System.out.println("��̬����");
	}
	public Student(){
		System.out.println("���ǹ�����");
	}
	
	public void study(){
		System.out.println("good good study,day day up!");
	}
}



public class Demo3 {

	public static void main(String[] args) {
		//Student s=new Student();
		//System.out.println(Student.name);
		Student.f1();
		
	}

}
