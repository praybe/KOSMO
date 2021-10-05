//quiz

public class GradeMain{

	public static void main(String[] args) {
		/* 
		 국어:50, 영어:70, 수학:95
		 총점과 평균을 구하시오. 단, 평균은 소숫점까지 나오도록 하시오.
		 */
		
		int kor, eng, math; //변수명 주의 ! 
		kor = 50; 
		eng = 70;
		math = 95;
		
		int total = kor + eng + math;
		System.out.println("총점: " + total);
		
		 double avg = (double) total / 3; //괄호 더블은 강제 형변형
		 // double avg = total / 3.0; 이렇게 해도 값 나옴
		 System.out.println("평균: " + avg);
		
		
		
		
		

	}

}
