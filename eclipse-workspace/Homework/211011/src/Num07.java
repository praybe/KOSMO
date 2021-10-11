
public class Num07 {

	public static void main(String[] args) {

		int sum = getHap(1, 100);

		System.out.println(sum);

	}

	public static int getHap(int First, int End) {

		int sum = 0;
		for (int i = First; i <= End; i++) {

			sum = sum + i;

		}

		return sum;

	}

}

//°á°ú°ª: 5050