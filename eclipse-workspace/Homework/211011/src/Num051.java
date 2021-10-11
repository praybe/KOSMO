
public class Num051 {

	public static void main(String[] args) {

		starPrint3(5);

	}

	public static void starPrint3(int num) {

		for (int i = 1; i <= num; i++) {

			for (int j = i; j < num; j++) {

				System.out.print(" ");

			}
			for (int j = 1; j <= (2 * i - 1); j++) {

				System.out.print("*");

			}
			System.out.println(" ");

		}

	}

}


/*
°á°ú°ª 
0000* 
000*** 
00***** 
0******* 
********* 

 */

