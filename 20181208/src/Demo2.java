
class Animal{
	static String name;
	int age;
	
	
	{
		System.out.println("我是构造代码块");
	}
	public static void sleep(){
		System.out.println("睡草窝！");
//		System.out.println(this.age);
		System.out.println(name);
	}
	
	public void drink(){
		String food="矿泉水";
		System.out.println("动物喝"+food+name);
		System.out.println(this.age);
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Animal a=new Animal();
//		Animal a1=new Animal();
//		a.name="波斯猫";
//		System.out.println(a.name);
//		System.out.println(a1.name);
//		Animal.name="拉布拉多";
		System.out.println(Animal.name);
		
		Animal.sleep();
		a.drink();
		Animal.sleep();
	}

}
