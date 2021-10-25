package Oct20;

//어렵지만 당황하지 말고 밑에처럼 만들줄 알아야함
public class ArrRefValue {
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5, 6, 7};
		int sum = sumOfAry(ar); //배열의 참조 값 전달
		
		
		//밑에 함수 만들었으니 써먹어야지. 근데 어떻게 써먹을까용? >> 이렇게 써먹
		int[] arr2 = makeNewIntAry(5); //new int[5];
		int[] arr3 = makeNewIntAry(6);
		
		System.out.println(arr2[0]);
				

	}
	
	//함수 이름부터가 sumOfAry. 뭔가 배열하는 것을 합쳐주는 것인가? 하고 예상 가능
	static int sumOfAry(int[] ar) { 
		int sum = 0;
		for(int i = 0; i < ar.length; i++)
			sum += ar[i]; //ar값들에 대해 리턴해주고 잇어
		return sum;
		
	}
	
	
	//밑에 함수 만들었으니 써먹어야지. 근데 어떻게 써먹을까용?
	static int[] makeNewIntAry(int len) {
		int [] ar = new int[len];
		return ar;
		
	}
	


}
