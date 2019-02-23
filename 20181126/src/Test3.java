
public class Test3 {

	public static void main(String[] args) {
		for (int i = 0; i <=50; i++) {
			for (int j = 0; j <=20; j++) {
				for (int j2 = 0; j2 <=5; j2++) {
					if(i*2+j*5+j2*20==100){
						System.out.println(i+":"+j+":"+j2);
					}
				}
			}
		}
	}

}
