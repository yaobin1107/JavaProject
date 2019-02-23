
public class Test6 {
	
	public static int yanghui(int x,int y){
		if(y==1|| y==x) return 1;
		return yanghui(x-1,y)+yanghui(x-1,y-1);
				
	}
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(yanghui(i,j)+"\t");
			}
			System.out.println();
		}
		
	}

}
