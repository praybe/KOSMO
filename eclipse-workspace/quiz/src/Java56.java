
public class Java56 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv2());
		b.buy(new Computer());
		b.buy(new Tv2());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();

	}

}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여" +p+"살 수 없습니다." ); 
			return; //추가
		}else {
			money = money - p.price;
		}
		add(p);		
	}

	void add(Product p) {
		if(i >= cart.length ) {
			Product[] tmp = new Product[cart.length*2]; //cart 말고 tmp
			
			System.arraycopy(cart, 0, tmp, 0, cart.length); //생각을 몬함
			
			 cart = tmp; // tmp를 안 썼어서 엉뚱하게 도출함
			
	
		}
		cart[i++]=p; //생각을 더더욱 몬함
				
			
			
	}

	void summary() {

		System.out.print("구입한 물건: " );
		for(Product e: cart) {  //생각몬함
			System.out.print(e +" "); 
		}
		System.out.println(); 
		
		
		int sum = 0;
		for( Product p : cart) { //Product p가 아니라 int i인 줄 ... 
			sum = sum + p.price;  //p.price가 아니라 p인 줄 ..
			 
		}
		
		System.out.println("사용한 금액: " + sum);
		System.out.println("남은 금액: " + money );
	}
}

class Product {
	int price; 

	Product(int price) {
		this.price = price;
	}
}

class Tv2 extends Product {
	Tv2() {
		super(100);
	}

	public String toString() {
		return "Tv2";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}
