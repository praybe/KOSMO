//메소드 연습
//등차수열의 합

public class Sum {

/*	public static void main(String[] args) {

		int sum = getHap(1, 100);

		System.out.println(sum);

	}

	public static int getHap(int i, int j) { // getHap을 geHap으로 오타내서 오류떴음 ㅠㅠ

		int sum = 0;
		for (i = 1; i <= j; i++) {
			sum = sum + i;    // <-이것이 핵심. 암기하시오 ^ㅇ^
		}

		return sum; // return을 result라고 써서 자꾸 오류떴음 ㅠ

	}

} */


 
	public static void main(String[] args) {

		int sum = getHap(1, 100);

		System.out.println(sum);

	}

	public static int getHap(int start, int end) {

		int sum = 0;
		
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}

		return sum;

	}
}
