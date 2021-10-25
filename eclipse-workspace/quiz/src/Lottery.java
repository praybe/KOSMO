
public class Lottery {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		for (int i =0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random()*45+1);
			
			for(int j = 0 ; j < i ; j++) {
				if(lotto[i] == lotto [j]) {  //µü ÀÌ ºÎºÐ »©¸ÔÀ½.. ¹Ø¿¡ µÎ °³´Â ³Ö¾ú´Âµ¥... ±×·¨´õ´Ï Ãâ·Â ¾È³ª¿È 
				i--;
				break;
				}
			}		
			
		}
		
		for (int i =0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
			
		}
		
		
	}

}
