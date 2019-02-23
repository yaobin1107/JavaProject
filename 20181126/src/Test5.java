
public class Test5 {
	public static void main(String[] args) {
		int[][] a=new int[10][10];
		for (int i = 0; i <a.length; i++) {
			a[i][0]=1;
			a[i][i]=1;
		}
		for (int i = 2; i < a.length; i++) {
			for (int j = 1; j <=i-1; j++) {
				a[i][j]=a[i-1][j]+a[i-1][j-1];
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
