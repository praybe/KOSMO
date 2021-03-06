package Nov02;

public class MathClass {
	public static void main(String[] args) {
		System.out.println("원주율: " + Math.PI);
		System.out.println("2의 제곱근: " + Math.sqrt(2));
		System.out.println();
		System.out.println("파이에 대한 Degree: " + Math.toDegrees(Math.PI));
		System.out.println("2 파이에 대한 Dgree: " + Math.toDegrees(2.0 * Math.PI));
		System.out.println();

		double radian45 = Math.toRadians(45); // 라디안으로의 변환!
		System.out.println("싸인45: " + Math.sin(radian45));
		System.out.println("탄젠트45: " + Math.cos(radian45));
		System.out.println();
		System.out.println("로그25: " + Math.log(25));
		System.out.println("2의 16승: " + Math.pow(2, 16));

	}

}
