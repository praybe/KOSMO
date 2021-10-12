
class GetSum{
	
	int num;
	
	void setNum(int n) {
		num=n;
	}
	void sum() {
		int sum =0;
		for (int i =1; i <= 50; i++) {
			
			sum = sum + i;
			
		}
		
		System.out.println(sum);
	}
	
	
}

public class Num10 {

	public static void main(String[] args) {
		
		
		GetSum getsum = new GetSum();
		int num;
		num=50;
		
		getsum.setNum(num);
		getsum.sum();
		

	}

}
