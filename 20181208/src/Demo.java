
//��˵����

class Person{
	static String username;
	static String password;
	String name;
	//˽�еķ������η���ֻ���ڱ��൱��ʹ��
	private int age;
	//�����ṩ��һ�����еķ��ʷ�ʽ
	public void setAge(int age){
		if(age<0||age>150){
			throw new RuntimeException("�Ƿ�����");
		}
		this.age=age;
	}
	public Person(){
		
	}
	public Person(int age){
		if(age<0||age>150){
			throw new RuntimeException("�Ƿ�����");
		}
		this.age=age;
	}
	public void speak(){
		System.out.println("�ҵ�������"+this.age);
	}
}
public class Demo {

	public static void main(String[] args) {
//		Person p=new Person();
//		//���������̣������䣬��ô�ͱ��������ʵ�������䣬
//		//����֮����������������������
//		//p.age=-18;
//		p.setAge(18);
//		p.speak();
		Person p1=new Person();
		p1.username="����";
		p1.password="888888";
		System.out.println(p1.username+":"+p1.password);
		
		Person p2=new Person();
		
//		p1.password="888888";
		System.out.println(p2.username+":"+p2.password);
		
		
		
		
	}

}
