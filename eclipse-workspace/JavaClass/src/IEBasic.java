//if 그리고 else

public class IEBasic {

	public static void main(String[] args) {

		int n1 = 5;
		int n2 =7;
		
	//if문
		if(n1 < n2) {
			System.out.println("n1 < n2 is true");
		}
		
	//if ~ else문
		if(n1 == n2) {
			System.out.println("n1 == n2 is true");
		}
		else { 
			System.out.println("n1 == n2 is false");
		}
		
	//if~else if~else문
		int num =120;
		if(num < 0) {
			System.out.println("0미만");
		}
		else if(num <100) {
			System.out.println("0 이상 100 미만");
			
		}
		else {
			System.out.println("100이상");
		}
	
	
		
	}

}
