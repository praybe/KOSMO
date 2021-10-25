//Oct20
package edu.kosmo.ex.main;

import edu.kosmo.ex.shape.CircleArr;

public class CircleArrTest{
	public static void main(String[] args) {
		
		CircleArr c = new CircleArr(3);
		System.out.println(c.getArea());
		
		
		//배열에대해서는 생성자가 없음. 그래서 그냥 다섯개 스템플러 떄려넣어
		CircleArr[] cirArr = new CircleArr[5]; 
		
		//Circle을 넣을 다섯 개 방이 생김
		cirArr[0] = new CircleArr(1);
		cirArr[1] = new CircleArr(1);
		cirArr[2] = new CircleArr(1);
		cirArr[3] = new CircleArr(1);
		cirArr[4] = new CircleArr(1);
		
		//여기까지가 원 입력
		for(int i = 0; i<cirArr.length; i++) {
			int r = (int)((Math.random()*100)+1);
			cirArr[i] = new CircleArr(r);
			
		}
		
		//총 원넓이 계산
		double sum = 0;
		
		for(int i =0; i < cirArr.length; i++) {
			sum = sum + cirArr[i].getArea();
			//sum += cirArr[i].getArea();
			
			//반지름 확인하고 싶을 시 class ArrCircle에 게터세터 함수 만들면 됨.
			System.out.println("반지름: " + cirArr[i].getR());
			
		}
		System.out.println("총 넓이: " + sum);
		
		//CircleArr[] cirArr = new CircleArr[5]; 이거를 넣는겨
		System.out.println("총 넓이: " + CircleArr.getArrArea(cirArr));
		System.out.println("총 넓이: " + cirArr[1].getArrArea(cirArr));
		
	}

}



