
public class Num08 {

	public static void main(String[] args) {

		int count = get57(1, 100);
		System.out.println(count);

	}

	public static int get57(int First, int End) {

		int count = 0;

		for (int i = First; i <= End; i++) {
			if ((i % 5 != 0) || (i % 7 != 0)) { // ((i % 5 == 0) || (i % 7 == 0))

				continue; // count ++
			}

			count++;

		}

		return count;
	}

}

//°á°ú°ª: 2