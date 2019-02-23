
public class Test1 {

	public static void main(String[] args) {
		int[][] a=new int[5][5];
		for (int j = 0; j <a.length; j++) {
			int x=0;
			for (int i = 0; i <=j; i++) {
				System.out.print((char)((x++)+'A'));
			}
			System.out.println();
		}
	}

}
