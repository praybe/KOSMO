//5. 3의 배수인 단(3,6,9)만 출력 하시오.
public class Num05 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {

			if ((i % 3 != 0) && (i % 6 != 0) && (i % 9 != 0)) { // &&이 아니라 ||했을떄는 답이 안나옴

				continue;
			}

			for (int j = 1; j < 10; j++) {

				System.out.println(i + "x" + j + "=" + i * j);

			}

			System.out.println();
		}

	}

}

/*
 * answer
 * 
 * 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27
 * 
 * 6x1=6 6x2=12 6x3=18 6x4=24 6x5=30 6x6=36 6x7=42 6x8=48 6x9=54
 * 
 * 9x1=9 9x2=18 9x3=27 9x4=36 9x5=45 9x6=54 9x7=63 9x8=72 9x9=81
 * 
 * 
 */