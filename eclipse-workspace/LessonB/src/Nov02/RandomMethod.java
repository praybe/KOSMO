package Nov02;

import java.util.Random;

public class RandomMethod {
	public static void main(String[] args) {

		Random rand = new Random();
		for (int i = 0; i < 7; i++)
			System.out.println(rand.nextInt(1000));

		System.out.println();

		Random rand2 = new Random(12);
		for (int i = 0; i < 7; i++)
			System.out.println(rand.nextInt(1000));

	}

}
