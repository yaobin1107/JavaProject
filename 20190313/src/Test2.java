
class Person{
	
	
	String name="����";
	public  void eat(){
		System.out.println(1);
	}
	public static void sleep(){
		System.out.println("˯ϯ��˼");
	}
	
}

class Teacher extends Person{
	
	
	
	String name="����ʦ";
	public  void eat(){
		System.out.println(2);
	}
	public static void sleep(){
		System.out.println("˯é����");
	}
	public void teach(){}
}
class Nurse extends Person{
	String name="С��";
	public  void eat(){
		System.out.println(3);
	}
}


public class Test2 {

	public static void main(String[] args) {
		//����ת�ͣ�����ʦ��������õ�����������person��
//		Person t=new Teacher();
//		t.sleep();
//		System.out.println(t.name);
//		Person n=new Nurse(); 
//		n.eat();
//		System.out.println(n.name);
		
		
		Person p=new Person();
		
		
		//��ʱ����תת�ͳɹ���ԭ�����Ѿ�����������ת��
		Teacher t=(Teacher)new Person();
		

	}

}
