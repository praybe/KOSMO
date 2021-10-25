//Oct20
package edu.kosmo.ex.shape;

public class CircleArr {

	private double r;

	public CircleArr(double r) {
		this.r = r;

	}

	// 반지름 확인하고 싶을 시 추가해서 r을 뽑아낸다.
	public double getR() {
		return r;
	}

	// 반지름 확인하고 싶을 시 추가해서 r을 뽑아낸다.
	public void setR(double r) {
		this.r = r;
	}

	public double getArea() {
		return r * r * Math.PI;
	}
	
/*금방 만든 Circle 클래스에 아래의 함수를 만드시오.
-파라미터를 Circle 배열로 받아서 해당 배열에 들어 있는 Circle들에 
총 넓이를 리턴 하는 함수를 만드시오. */
	
	//static 붙이면 메모리에 먼저 올라감.
	//그래도 한 번 써먹을 수 있으니
	public static double getArrArea(CircleArr[] cirArr) {
		double sum = 0;
		
		for(int i =0; i < cirArr.length; i++) {
			sum += cirArr[i].getArea();
			System.out.println("반지름: " + cirArr[i].getR());
		}
		return sum;
		
		
	}

}
