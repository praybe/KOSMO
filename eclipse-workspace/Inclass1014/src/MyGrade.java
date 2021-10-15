//퀴즈2 자꾸 오류 발생 ... 망함 >> 오류발생 이유: 세미콜론 안 붙임 ㅁㅊ 
class Grade {

	int math, science, english;
	double average;

	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;

	}

	public double average() { //이거 안함

		return average = (math + science + english) / 3.0;
	}

	public String getGrade() { 
		double avg = average;//이거 안함
		String Str ;//이거 안함
		
		if(avg>=90) {		
			Str = "수 입니다";
		
		} else if(avg>=80) {		
			
			Str="우 입니다";
		
		} else if(avg>=70) {		
			
			Str="미 입니다";
		
		}else if(avg>=60) {		
			
			Str="양 입니다";
		
		}else {		
			
			Str="가 입니다";	
		}
		
		return Str; 
		
	}

}

public class MyGrade {

	public static void main(String[] args) {

		int math, science, english;
		math = 90;
		science = 80;
		english = 80;

		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
		System.out.println(me.getGrade());

	}

}
