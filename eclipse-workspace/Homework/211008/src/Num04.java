//4.구구단 짝수단 출력 하시오.
public class Num04 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {

			if (i % 2 != 0) {
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
 * 2x1=2 2x2=4 2x3=6 2x4=8 2x5=10 2x6=12 2x7=14 2x8=16 2x9=18
 * 
 * 4x1=4 4x2=8 4x3=12 4x4=16 4x5=20 4x6=24 4x7=28 4x8=32 4x9=36
 * 
 * 6x1=6 6x2=12 6x3=18 6x4=24 6x5=30 6x6=36 6x7=42 6x8=48 6x9=54
 * 
 * 8x1=8 8x2=16 8x3=24 8x4=32 8x5=40 8x6=48 8x7=56 8x8=64 8x9=72
 * 
 */