package Oct20;
//9번

/*
 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 
배열에 저장하라. 
그리고 배열에 든 숫자들과 평균을 출력하라.

랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9
평균은 5.4
 */

class ArrAvg{
	private int[] arr = new int [10];
	
	//생성자 만들기
	public ArrAvg() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1); 
		}
	}
	
	public void resultPrint() {
		double avg = 0;
		double sum = 0;
		
		for(int i : arr) {
			//랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9
			sum = sum + i;
			System.out.print(i + " ");
			
		}
		System.out.println();
		avg = sum / arr.length;
		System.out.println("평균: " + avg);
	}
	
	
}


public class NumArr {
	public static void main(String[] args) {
		ArrAvg arrAvg = new ArrAvg();
		arrAvg.resultPrint();
		
		
	}
}




/* 나랑 제원님이 한 방법... 선생님은 클래스 생성을 선호함. 고로 오답이겠느니라.
public class NumArr {
	public static void main(String[] args) {

		int[] num = new int[10];
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);

			sum = sum + num[i];

		}

		double avg = (double)sum / num.length; //sum의 형변환 요

		System.out.print("랜덤 숫자 : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("평균: " + avg);

	}
}*/
