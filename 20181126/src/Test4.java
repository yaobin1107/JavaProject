
public class Test4 {
	public static int taoshu(int t){
			if(t==7) return 1;
		return (taoshu(t+1)+1)*2;
	}

	public static void main(String[] args) {
		
		System.out.println(taoshu(1));
	}
	
}
