
class Animal{
	static String name;
	int age;
	
	
	{
		System.out.println("���ǹ�������");
	}
	public static void sleep(){
		System.out.println("˯���ѣ�");
//		System.out.println(this.age);
		System.out.println(name);
	}
	
	public void drink(){
		String food="��Ȫˮ";
		System.out.println("�����"+food+name);
		System.out.println(this.age);
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Animal a=new Animal();
//		Animal a1=new Animal();
//		a.name="��˹è";
//		System.out.println(a.name);
//		System.out.println(a1.name);
//		Animal.name="��������";
		System.out.println(Animal.name);
		
		Animal.sleep();
		a.drink();
		Animal.sleep();
	}

}
