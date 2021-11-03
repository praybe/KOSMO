package Nov02;
//ArrayClass 7
//검색
import java.util.Arrays;

public class ArrayBinarySearch {
	public static void main(String[] args) {
		int[] ar = { 33, 55, 11, 44, 22 };
		Arrays.sort(ar); //탐색 이전에 정렬이 선행되어야 한다.

		for (int n : ar)
			System.out.print(n + "\t");
		System.out.println();

		int idx = Arrays.binarySearch(ar, 33); //배열 ar에서 33을 찾아라.
		System.out.println("Indext of 33: " + idx);

	}

}
//sort와 binary 둘 중 하나라도 뺴먹으면 엉뚱한 출력값이 나옴.