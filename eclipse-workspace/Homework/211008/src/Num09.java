//9.좌향 직각삼각형 별을 찍으시오.
public class Num09 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = i; j < 5; j++) {

				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

}


/*
 
answer
0000*
000**
00***
0****
*****


 */
