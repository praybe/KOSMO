package edu.kosmo.ex.main;

import java.util.Scanner;

class Grade9 {
	private int math, science, english;
	private double average;

	Grade9(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;

	}

	public double average() {
		return average = (math + science + english) / 3.0;
	}

	public String getGrade() {

		String str;

		if (average >= 90) {
			str = "수 입니다.";
		} else if (average >= 80) {
			str = "우 입니다.";
		} else if (average >= 70) {
			str = "미 입니다.";
		} else if (average >= 60) {
			str = "양 입니다.";
		} else {
			str = "가 입니다.";
		}
		return str;

	}

}

public class ScanningGrade {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("수학성적: ");
		int math = sc.nextInt();
		System.out.println("과학성적: ");
		int science = sc.nextInt();
		System.out.println("영어성적: ");
		int english = sc.nextInt();

		Grade9 me = new Grade9(math, science, english);
		System.out.println("평균은 " + me.average());
		System.out.println(me.getGrade()); // 우 입니다.

	}

}
