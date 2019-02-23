
public class Test2 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			int x=0;
				for (int j2 = 0; j2 <6-i; j2++) {
					System.out.print(" ");
				}
				for (int j = 0; j <i; j++) {
					System.out.print((char)((x++)+'A'));
				}
				x--;
				for (int j = i-1; j >0; j--) {
					System.out.print((char)((--x)+'A'));
					
				}
				System.out.println();
			}
		}
	

}
