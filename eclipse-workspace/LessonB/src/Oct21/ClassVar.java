package Oct21;

//어제거 복습

class ArrAvg {
	private int[] arr = new int[10];
	private int num;

	public int[] getArr() {
		return arr;
	}

	public int getNum() {
		return num;
	}

	// 생성자 만들기
	public ArrAvg() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
	}

	public void resultPrint() {
		double avg = 0;
		double sum = 0;

		for (int i : arr) {
			// 랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9
			sum = sum + i;
			System.out.print(i + " ");

		}
		System.out.println();
		avg = sum / arr.length;
		System.out.println("평균: " + avg);
	}

	public static int getArrSum(int[] arr) {
		int sum = 0;
		for (int i : arr) {

			sum = sum + i;
			System.out.print(i);
		}
		return sum;

	}

}

class Rectangle5 {

	private int width;
	private int height;

	public Rectangle5(int width, int height) {
		this.width = width;
		this.height = height;

	}

	public int getArea() {
		return width * height;
	}
	public static int getArrRec(Rectangle5[] rec) {
		int sum = 0;
		for (Rectangle5 rectangle : rec) {
			sum += rectangle.getArea(); 
		}
		return sum;
	}

}

// =====================

public class ClassVar {
	public static int getArrSum(int[] arr) {
		int sum = 0;
		for (int i : arr) {

			sum = sum + i;
			System.out.print(i);
		}
		return sum;

	}
	
	public static int getArrRec(Rectangle5[] rec) {
		int sum = 0;
		for (Rectangle5 rectangle : rec) {
			sum += rectangle.getArea(); 
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Rectangle5[] rec = new Rectangle5[2];
		
		rec[0] = new Rectangle5(100, 200);
		rec[1] = new Rectangle5(10, 20);
		
		int area = getArrRec(rec);
		System.out.println("합계 넓이는 " +area); // static함수가 메인클래스에 있을떄
		System.out.println("합계 넓이는 " + Rectangle5.getArrRec(rec)); //static함수가 메인 말고 클래스 부분에 있을떄
		
		
		
		ArrAvg arrAvg = new ArrAvg();
		arrAvg.resultPrint();

		// private int[] arr = new int[10] ;
		System.out.println("합계는" + getArrSum(arrAvg.getArr()));
		System.out.println("합계는" + ArrAvg.getArrSum(arrAvg.getArr()));

	}
}
