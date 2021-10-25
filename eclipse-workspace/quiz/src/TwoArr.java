//10¿ù 22ÀÏ
public class TwoArr {
	public static void main(String[] args) {
		
		int[][] arr = new int[4][3];
		
		for(int i=0; i<4; i++) {
			for(int j = 0; j<3; j++) {
				arr[i][j] = (int)(Math.random()*100+1);
				
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(arr[i][j] + "\t");				
			}
			System.out.println();
		}
		
		
		
	}

}

/*
19	91	6	
48	96	98	
23	54	31	
45	85	36	
*/