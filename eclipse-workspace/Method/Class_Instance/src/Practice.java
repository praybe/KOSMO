//BankAccount 생성자 응용
class TV {
	
	String brand;
	int year;
	int inch;
	
	//생성자
	TV(String brand, int year, int inch){		
		this.brand = brand;
		this.year = year;
		this.inch = inch;
				
	}	
	
	//show함수 
	public void show(){
		System.out.println(brand + "에서 만든 " + year + "년 " +inch+"인치" );
				
	}

}

public class Practice{
	public static void main(String[] args) {
				    //생성자(TV)는 멤버 변수 초기화;					
		TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
		
		myTV.show();
		
		
		
		TV yourTV = new TV("삼성", 2021, 70);
		yourTV.show();
		
						
	}
}

/*
 * 출력값
 * LG에서 만든 2017년 32인치
 */