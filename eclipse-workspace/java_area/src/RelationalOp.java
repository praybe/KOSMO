//관계 연산자
public class RelationalOp {

	public static void main(String[] args) {
		
		System.out.println("3>=2: "+(3>=2));
		System.out.println("3<=2: "+(3<=2));
		System.out.println("7.0==7: "+(7.0==7)); // 둘이 같은 거냐
		System.out.println("7.0!=2: "+(7.0!=7)); // 둘이 다른거냐
		
		
		boolean bool=(3>=2);
		System.out.println("3>=2: "+bool);
		
		bool=true && false; 
		System.out.println(bool);
		
		bool=true && true;
		System.out.println(bool);

		
	}

}
