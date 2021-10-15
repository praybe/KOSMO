package edu.kosmo.ex.main;

import java.util.Scanner;

public class ScanningString {

	public static void main(String[] args) {
		String source = "1 3 5";
		
		//System.out.println("입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt(); //문자열 입력은 next
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//int sum = num1 + num2 + num3;
		//System.out.printf("%d + %d + %d = %d \n",num1, num2, num3, sum);
		
		
		String s1 = sc.next();
		System.out.println(s1);
		
		s1 = sc.next();
		System.out.println(s1);
		
		int sum = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d \n",num1, num2, num3, sum);
		
		

	}

}




/*
출력값
10 20 30
바둑이
바둑이

영희야
영희야
10 + 20 + 30 = 60 */
