package Oct25_PMpractice;
//3번
/*
3차원의 점을 나타내는 Point3D 클래스를 작성하라. 
다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라
=======================
(1,2,3) 의 점입니다.
(1,2,4) 의 점입니다.
(10,10,3) 의 점입니다.
(100,200,300) 의 점입니다.
*/
public class Point3DMain {
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
		System.out.println(p.toString()+"입니다.");
		
		p.moveUp(); // z 축으로 위쪽 이동
		System.out.println(p.toString()+"입니다.");
		
		p.moveDown(); // z 축으로 아래쪽 이동
		p.move(10, 10); // x, y 축으로 이동
		System.out.println(p.toString()+"입니다.");
		
		p.move(100,  200, 300); // x, y, z축으로 이동
		System.out.println(p.toString()+"입니다.");

	}

}
