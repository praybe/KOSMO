package Oct20;

public class ForEach {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		// fore + ctrl + space
		for (int i : ar) {
			System.out.println(i);

		}

	}

}
