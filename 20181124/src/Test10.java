
public class Test10 {

	public static void main(String[] args) {
		for (int i = 0; i <=1; i++) {
			for (int j = 0; j <=2; j++) {
				for (int j2 = 0; j2 <=5; j2++) {
					for (int k = 0; k <=10; k++) {
						for (int k2 = 0; k2 <=20; k2++) {
							for (int l = 0; l <=100; l++) {
								if(100*i+50*j+20*j2+10*k+5*k2+l==100){
									
									System.out.println(i+":"+j+":"+j2+":"+k+":"+k2+":"+l);
								}
							}
						}
					}
				}
			}
		}
	}

}
