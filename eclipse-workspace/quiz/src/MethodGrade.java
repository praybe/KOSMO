
public class MethodGrade {

	public static void main(String[] args) {

		char grade;
		double avg = 80;

		grade = getGrade(avg);
		System.out.println(grade + " 입니다.");

	}

	public static char getGrade(double avg) {

		char grade;

		if (avg >= 90) {

			grade = '수';

		} else if (avg >= 80) {

			grade = '우';
			
		} else if (avg >= 70) {

			grade = '미';
			
		} else if (avg >= 80) {

			grade = '양';
			
		} else {
			
			grade = '가';

		}

		return grade;

	}

}
