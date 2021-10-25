package edu.kosmo.ex.market;

public class TV extends Product {

	public TV() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "TV";
		//println에 객체 넣으면 toString이 실행되더라.
		//고수들은 이런걸 예상하고 들어감
	}

}
