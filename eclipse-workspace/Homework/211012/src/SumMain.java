
class GetSum {

	int num;

	public void setNum(int num) {
		this.num = num;
	}

	public int sum() {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;		
		}
		System.out.println(sum);
		return sum;
	}

}

public class SumMain {

	public static void main(String[] args) {

		GetSum getsum = new GetSum();
		int num;
		num = 50;

		getsum.setNum(num);
		getsum.sum();

	}

}
