package Nov08;

import java.util.HashSet;
import java.util.Set;

public class HashSetLottery {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();

		while (set.size() != 6) {
			int rNum = (int)(Math.random() * 45 + 1);
			set.add(rNum);
		}
		System.out.print("로또 번호: ");
		for (Integer num : set)
			System.out.print(num + "\t");
		System.out.println();
	}

}
