package Nov05;

//1부터 100까지 arrayList에 집어넣고 출력하기
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 100; i++)
			list.add(i);

		// 인스턴스 참조 (출력)
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();

	}

}
