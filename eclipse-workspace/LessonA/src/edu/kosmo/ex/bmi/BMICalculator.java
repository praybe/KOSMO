//Oct19
package edu.kosmo.ex.bmi;

/*사용자로부터 키를 입력 받아서 표준 체중을 계산한 후에 사용자의 체중과 비교하여 
저체중인지, 표준 인지, 과체중인지를 판단하는 프로그램을 작성하라. 
표준 체중 계산식은 다음을 사용하라.
표준체중(kg) = ( 키(cm) - 100 ) * 0.9

입력:
키(cm)를 입력하세요. : 193
체중(kg)을 입력하세요. : 25
출력:
표준 체중은 83.7입니다.
당신은 저체중 입니다.  */

public class BMICalculator{
	
	private double height;
	private double weight;
	
	public BMICalculator (double height, double weight){
		this.height = height;
		this.weight = weight;
	} 
	
	public void printResult() {
		double mWeight = ( height - 100 ) * 0.9; //이게 표준 체중. 0.9곱해야해서 double
		
		System.out.println("표준 체중은 " + mWeight +"입니다.");
		
		if ( weight > mWeight ) {
			System.out.println("당신은 저팔계입니다.");
		}else if( weight < mWeight ) {
			System.out.println("당신은 멸치입니다.");	
		}else {
			System.out.println("당신은 표준 체중입니다.");
		}
		
	}
	
			
			

		
	

}
