import java.util.Scanner;

/*              ÐÐ         ¿Õ¸ñ         ÐÇÐÇ
 *          1    5      1
 ***         2    4      3
 *****        3    3      5
 *******       4    2      7
 *********      5    1      9
 *///   i    6-i    2*i-1
public class Test6 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {

				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j == 1 || j == 2 * i - 1||i==5||j==i) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {

				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j == 1 || j == 2 * i - 1||j==i) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
