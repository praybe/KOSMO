//반복문 for 구문 
public class Repeat3For {

	public static void main(String[] args) {
		
		 for(int i = 0; i<5; i++) System.out.println("I love Java" + i);
		 
		 System.out.println("============");
		 

	//문제1. 9단을 찍으시오 1*9 = 9 1*2=18 ....
		
		 int dan = 9; 
		 for(int j=1 ; j<10; j++) // ++i도 가능한데 관습적으로 i1++씀
		 System.out.println(j + " * " + dan + " = " + (j*dan));
		 
		 System.out.println("============");
		 
		 
	//문제2. 1부터 100까지의 합을 구하는 프로그래밍을 하시오.
			
			int sum = 0;  //i합을 담아 둘 변수 선언
			 
			for (int k = 1; k <= 100; k++) {
				sum +=k;         //sum = sum + k;도 가능
			}
			System.out.println("sum : " + sum); 
		
		
		

	}
}
