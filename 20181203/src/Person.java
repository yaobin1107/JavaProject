
public class Person extends Object {
	String name;
	int age;
	//�������Ķ���,���캯�������췽��
	public Person(){
		
		System.out.println("�����޲ι�����");
	}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
		//���һ��this�����������ǰ���������ǰ����
		//���������ǰ�����ToString����
		System.out.println(this);
	}

	
	
	public void eat(){
		System.out.println(this.name+"�ÿ��ӳ�");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public void eat(String name){
		this.name=name;
		System.out.println(this.name+"��ץ�ų�");
	}
	public static void main(String[] args) {
		Person p1=new Person("����",38);
		p1.eat();
		Person p2=new Person("С��",36);
		Person p3=new Person("������",8);
		
	}
	
}
