
class Vimpare{
	String name;
	int age;
	String boss;
	
	
	{
		this.boss="德古拉伯爵";
	}
	public Vimpare(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void drinkBlood(){
		System.out.println(this+"说我吸。我吸。我嘻嘻嘻");
	}
	public String toString() {
		return "Vimpare [name=" + name + ", age=" + age + ", boss=" + boss
				+ "]";
	}
	
	
}


public class Demo2 {

	public static void main(String[] args) {
			Vimpare v1=new Vimpare("柯南", 1000);
			Vimpare v2=new Vimpare("弗拉基米", 8000);
			Vimpare v3=new Vimpare("米歇尔亏内功萨雷斯", 10000);
			v1.drinkBlood();
			v2.drinkBlood();
			v3.drinkBlood();
			
			
			
			
			
			
			
			
	}

}
