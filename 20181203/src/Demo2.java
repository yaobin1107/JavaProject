
class Vimpare{
	String name;
	int age;
	String boss;
	
	
	{
		this.boss="�¹�������";
	}
	public Vimpare(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void drinkBlood(){
		System.out.println(this+"˵��������������������");
	}
	public String toString() {
		return "Vimpare [name=" + name + ", age=" + age + ", boss=" + boss
				+ "]";
	}
	
	
}


public class Demo2 {

	public static void main(String[] args) {
			Vimpare v1=new Vimpare("����", 1000);
			Vimpare v2=new Vimpare("��������", 8000);
			Vimpare v3=new Vimpare("��Ъ�����ڹ�����˹", 10000);
			v1.drinkBlood();
			v2.drinkBlood();
			v3.drinkBlood();
			
			
			
			
			
			
			
			
	}

}
