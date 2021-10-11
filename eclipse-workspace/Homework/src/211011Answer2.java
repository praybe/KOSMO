package classwork; // 직각삼각형, 역우향직각삼각형, 좌향직각삼각형, 역좌향직각삼각형, 산찍기

public class Oct11thAnswer2 {

	public static void main(String[] args) {

		//1. 바깥쪽 for문은 단순 행 찍는거다(그냥 5번 돌리면 다섯 번 행만 표현할 뿐)
		//2. 안쪽 for문은 열을 찍음 (여기까지는 매우 당연...
		//3. blank(스페이스"" 혹은 "0")는 생각하지 않고, 먼저 별 개수 많큼 찍는다. 
		//4. 그 다음 스페이스가 있으면 스페이스를 고려하여 for문을 첨가한다.

		for (int i = 1; i <= 5; i++) {
			
			for (int j = i; j < 5; j++) {

				System.out.print("0");
			}

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println("");

		}

	}

}


/*결과물:
	0000*
	000**
	00***
	0****
	*****
	
	*/
