
class Person{
	private String blood;
	
	public void setBlood(String blood){
		if(blood!=null){
			blood=blood.toUpperCase();
		}
		if("A".equals(blood)||"B".equals(blood)||"O".equals(blood)||"AB".equals(blood)){
			this.blood=blood;
		}else{
			throw new RuntimeException("���������");
		}
		
	}
	public String getBlood(){
		return this.blood;
	}
	
	public void speak(){
		System.out.println("�ҵ�Ѫ����"+blood+"��");
	}
}
public class Demo {

	public static void main(String[] args) {
		//��˵Ѫ��
		Person p=new Person();
		p.setBlood(null);
		p.speak();

	}

}
