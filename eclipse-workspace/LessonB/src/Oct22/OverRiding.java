package Oct22;
//2번째 배운거

class Cake {
	public void sweet() {}
}

class CheeseCake extends Cake{
	public void milky() {}
}

class StrawberryCheeseCake extends CheeseCake{
	public void sour() {}
}

public class OverRiding {
	public static void main(String[] args) {
		
		Cake cake1 = new StrawberryCheeseCake();
		CheeseCake cake2 = new StrawberryCheeseCake();
		
		CheeseCake ca1 = new CheeseCake();
		Cake ca2 = ca1; //가능 ! 부모는 자식이다 (o)
		
		Cake ca3 = new CheeseCake();
		CheeseCake ca4 = ca3; //불가능 ! 자식은 부모다..?(x)
		

	}

}
