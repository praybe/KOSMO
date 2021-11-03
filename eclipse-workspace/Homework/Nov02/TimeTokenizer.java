package Nov02;

import java.util.StringTokenizer;

public class TimeTokenizer {
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("PM : 08 : 45", ":");
		while(st.hasMoreTokens())
			System.out.print(st.nextToken() + ' ');
		System.out.println();


	}

}
