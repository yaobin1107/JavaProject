
public class Cat {
	//nick(�ǳ�), color(��ɫ), age(����)
	private String nick;
	private String color;
	private int age;
	
	
	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getAge() {
		return age;
	}

	/***
	 * @author ����
	 * @param è����
	 * @return ������è�����ǲ���һ��
	 * @time 2018 12 10 20:13
	 * 
	 * 
	 * */
	 
	 
	
	public boolean equals(Cat c1) {
		
		return this.nick.equals(c1.nick)&&this.color.equals(c1.color)&&this.age==c1.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Cat c=new Cat();
		c.setAge(18);
		c.setColor("��ɫ");
		c.setNick("��ޢ");
		System.out.println(c);
		
		Cat c1=new Cat();
		c1.setAge(18);
		c1.setColor("��ɫ");
		c1.setNick("��ޢ");
		System.out.println(c.equals(c1));

	}


	@Override
	public String toString() {
		return "Cat [nick=" + nick + ", color=" + color + ", age=" + age + "]";
	}

}
