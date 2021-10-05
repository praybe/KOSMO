
public class Oct5th {

	public static void main(String[] args) {
//문제2번
		System.out.println(3147483647L + 3147483648L);
//문제4번
		int a = 3;
		int b = 4;
		double result1 = (double)a/b;
		double result2=a/(double)b;
		System.out.println(result1);
		System.out.println(result2);
//문제6번		
		System.out.println('A'); 
		System.out.println('A' + 'A');
//문제 8번
		/* "1 초과 100미만인가?"를 코딩으로 표현하면? */
		int num8 = 43;
		boolean result8=((num8>1)&&(num8<100));
		System.out.println("1 초과 100미만인가? "+result8);
				
//9번
		/* "2의 배수 또는 3의 배수?" 를 코딩으로 표현 하면? */
		int num9 = 21;
		boolean result9 = ((num9%2)==0)||((num9%3==0));
		System.out.println("2의 배수 또는 3의 배수?" +result9);
//문제10번
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		
//문제11번		
		/*국어 : 50
		  영어 : 70
		  수학 : 95
		  
		총점과 평균을 구하시오.
		-단 평균은 소숫점 까지 나오도록 하시오 */
		
		int kor=50;
		int eng=70; 
		int math=95;
		
		int total=kor+eng+math;
		System.out.println("총점: "+total);
		
		double avg=(double)total/3;
		System.out.println("평균: "+avg);
				
		
		

	}

}
