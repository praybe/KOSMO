package classwork; // 직각삼각형, 역우향직각삼각형, 좌향직각삼각형, 역좌향직각삼각형, 산찍기

public class Oct11thAnswer3 {

	public static void main(String[] args) {
		
		//1번. 산찍기도 blank 생각안하고 별을 먼저 생각한다. 그러면 좌측부터 13579가 형성됨
		//2번. 그 다음 blank를 생각한다. 좌향직각삼각형의 blank와 완전 똑같음.

		for (int i = 1; i <= 5; i++) {
			
			for (int j = i; j <5 ; j++) {   

				System.out.print("0");
			}


			for (int j = 1; j <= i; j++) {   

				System.out.print("*");      //여기까지는 좌향직각삼각형
			}
			


			for (int j = 1; j <i ; j++) {  //그 다음 옆에 1234를 붙여서 산찍기 완성

				System.out.print("*");
			}

			System.out.println("");

		}

	}

}

/*결과물:
0000*
000***
00*****
0*******
*********

*/