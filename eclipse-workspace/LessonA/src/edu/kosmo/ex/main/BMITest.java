//Oct19
package edu.kosmo.ex.main;

import java.util.Scanner;
import edu.kosmo.ex.bmi.BMICalculator;

import edu.kosmo.ex.bmi.BMICalculator;


public class BMITest{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("키(cm)를 입력하세요.");
		int height = sc.nextInt();
		System.out.println("체중(kg)을 입력하세요.");
		int weight = sc.nextInt();
		
		BMICalculator bmi = new BMICalculator(height, weight);
		
	
		bmi.printResult();
		
		
		
	}
	
	

}
