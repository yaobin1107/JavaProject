import java.util.Arrays;
import java.util.Scanner;


public class Test7 {

	public static void main(String[] args) {
		//找数组里面的最大数
		int[] a={3,6,-99,166,0,888,8,69,-1,47};
		int tt;
			for (int k = 1; k < a.length; k++) {
				for (int j = 0; j < a.length-k; j++) {
					if(a[j]>a[a.length-k]){
						tt=a[j];
						a[j]=a[a.length-k];
						a[a.length-k]=tt;
					}
				}
			
//			for (int j = 0; j < a.length-2; j++) {
//				if(a[j]>a[a.length-2]){
//					tt=a[j];
//					a[j]=a[a.length-2];
//					a[a.length-2]=tt;
//				}
//			}
//			for (int j = 0; j < a.length-3; j++) {
//				if(a[j]>a[a.length-3]){
//					tt=a[j];
//					a[j]=a[a.length-3];
//					a[a.length-3]=tt;
//				}
//			}
//			if(a[1]>a[a.length-1]){
//				a[a.length-1]=a[1];
//			}
//			if(a[2]>a[a.length-1]){
//				a[a.length-1]=a[2];
//			}
//			if(a[3]>a[a.length-1]){
//				a[a.length-1]=a[3];
//			}
//			if(a[4]>a[a.length-1]){
//				a[a.length-1]=a[4];
//			}
		}
		System.out.println(Arrays.toString(a));
	}

}
