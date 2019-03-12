
class Person{
	private String blood;
	
	public void setBlood(String blood){
		if(blood!=null){
			blood=blood.toUpperCase();
		}
		if("A".equals(blood)||"B".equals(blood)||"O".equals(blood)||"AB".equals(blood)){
			this.blood=blood;
		}else{
			throw new RuntimeException("你个非人类");
		}
		
	}
	public String getBlood(){
		return this.blood;
	}
	
	public void speak(){
		System.out.println("我的血型是"+blood+"型");
	}
}
public class Demo {

	public static void main(String[] args) {
		//人说血型
		Person p=new Person();
		p.setBlood(null);
		p.speak();

	}

}
