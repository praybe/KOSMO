
public class IEPractice {

	public static void main(String[] args) {


	/*1번. 국어 50 영어 60 수학 90
	 * 총점 평균
	 * 평균 90이상이면 수
	 * 평균이 80 ~90 80이상 90미만이면 우
	 * 평균이 70~80 70이상 80미만이면 미
	 * 70점 미만 가*/
		
		int kor=50, eng=60, math=90;
		int total = kor + eng + math;
		double avg = ((double)total/3);
		System.out.println(avg);
		
		if(avg>=90) {
			System.out.println("수");
		}
		else if(avg >= 80) {   //else if 쓰면서 (70<avg<80)이런식으로 부호 두 개 쓰니까 오류뜸
			System.out.println("우");
		}
		else if(avg >= 70) {
			System.out.println("미");
		}
		else{
			System.out.println("가");  //else는 괄호 없음
		}
		System.out.println("==========");
	/*if else는 문법적으로 if문 안에 else와 if를 계속 품을 수 있다.*/
		int num=10;
		if(num<0) {
			System.out.println("0보다 작다");
		}else {
			if(num<100) {
				System.out.println("100보다 작다");
			}else {
				System.out.println("100보다 크다");
			}
		}
		System.out.println("==========");
		/*위에 것을 간단(?)하게 만든 것 */
		int num2=10;
		if(num2<0) {
			System.out.println("0보다 작다");
		}else if(num2<100) {
				System.out.println("100보다 작다");
			}else {
				System.out.println("100보다 크다");
			}
		}
		
		
	}

