//산 찍기, 피라미드 찍기
public class Num11 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = i; j < 5; j++) {

				System.out.print(" ");

			}

			for (int j = 1; j <= 2 * i - 1; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

}

/*

answer

0000*
000***
00*****
0*******
*********

 */




