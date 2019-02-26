
public class Person extends Object {
	String name;
	int age;
	//构造器的定义,构造函数，构造方法
	public Person(){
		
		System.out.println("我是无参构造器");
	}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
		//输出一个this。就是输出当前对象，输出当前对象，
		//就是输出当前对象的ToString方法
		System.out.println(this);
	}

	
	
	public void eat(){
		System.out.println(this.name+"用筷子吃");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public void eat(String name){
		this.name=name;
		System.out.println(this.name+"手抓着吃");
	}
	public static void main(String[] args) {
		Person p1=new Person("大罗",38);
		p1.eat();
		Person p2=new Person("小罗",36);
		Person p3=new Person("迷你罗",8);
		
	}
	
}
