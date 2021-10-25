package Oct19;



public class ArrIsInstance {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		 //5를 실질적으로 return해주는 애가 arr.length라서 5집어 넣어도 될 자리에 arr.length 넣어줌
		for(int i =0; i< arr.length; i++) {   
			arr[i] = i;			
		}
		
		for(int i =0; i<5; i++) {
			System.out.println(arr[i]);			
		}

		
		
	}
}
