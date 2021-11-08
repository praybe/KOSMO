package Nov08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class CollectionList {
	public static void main(String[] args) {
		
		//이 두 줄이 배열을 arraylist로 바꾸는 작업이다.
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
		
		ListIterator<String> litr = list.listIterator();
		String str;
		
		//왼쪽에서 오른쪽으로 
		while(litr.hasNext()) {
			str = litr.next();
			System.out.println(str + '\t');
			
			if(str.equals("Toys"))
				litr.add("Toys2");
		}
		System.out.println();
		
		//오른쪽에서 왼쪽으로 
		while(litr.hasPrevious()) {
			str = litr.previous();
			System.out.println(str + '\t');
			
			if(str.equals("Toys"))
				litr.add("Toys2");
		}
		
		

	}

}
