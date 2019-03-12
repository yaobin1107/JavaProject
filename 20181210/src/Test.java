class Super {
	int i = 0;
	Super() {
		this(1,2);
		System.out.println("A");   
		i += 2;   //0
	}
	Super(String str) {
		this();
		System.out.println(str); //tomcat
		i += 4; // 4
	}
	Super(int a, int b) {
		i -= a;  // -1
		i *= b;  // -2 
	}
	
}
class Demo8 extends Super {
	public Demo8() {
		
	}
	public Demo8(String a) {
		super("tomcat");
		System.out.println("B");  
		i = 5;  // 5
	}
	
}
public class Test {
	public static void main(String[] args) {
		System.out.println(1e2+10);
	}
}