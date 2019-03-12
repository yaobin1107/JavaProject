
public class Cat {
	//nick(昵称), color(颜色), age(年龄)
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
	 * @author 张三
	 * @param 猫对象
	 * @return 看两个猫内容是不是一样
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
		c.setColor("粉色");
		c.setNick("妮蔻");
		System.out.println(c);
		
		Cat c1=new Cat();
		c1.setAge(18);
		c1.setColor("粉色");
		c1.setNick("妮蔻");
		System.out.println(c.equals(c1));

	}


	@Override
	public String toString() {
		return "Cat [nick=" + nick + ", color=" + color + ", age=" + age + "]";
	}

}
