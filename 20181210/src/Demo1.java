
class Person1{
	//�˼������������
	public double calculate(Triangle t){
		return t.area();
	}
	//�˼���Բ���
	public double calculate(Circle c){
		return c.area();
	}
}
class Triangle{
	private double bottom;
	private double height;
	public double getBottom() {
		return bottom;
	}
	public void setBottom(double bottom) {
		this.bottom = bottom;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Triangle [bottom=" + bottom + ", height=" + height + "]";
	}
	
	public double area(){
		return bottom*height/2;
	}
}
class Circle{
	private double r;

	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double area(){
		return Math.PI*r*r;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		//�˼���ͼ������������֮��Ĺ�ϵ
		Person1 p=new Person1();
		Triangle t=new Triangle();
		t.setBottom(10.0);
		t.setHeight(5.0);
		System.out.println("�����ε������"+p.calculate(t));
		Circle c=new Circle();
		c.setR(5);
		System.out.println("Բ�������"+p.calculate(c));
	}

}
