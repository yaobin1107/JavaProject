import java.util.Date;


public class Demo1 {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.setName("张三");
		s1.setAge(18);
		Student1 s2=new Student1();
		s2.setName("张三");
		s2.setAge(18);
		
		Date d=new Date();
		
		System.out.println(s1.equals(s2));
		
		
	}
}
class Student1{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean equals(Object obj){
		if(obj instanceof Student1){
			
			Student1 s=(Student1)obj;
			return this.name.equals(s.name)&&this.age==s.age;
		}
		return false;
		
	}
	
}




