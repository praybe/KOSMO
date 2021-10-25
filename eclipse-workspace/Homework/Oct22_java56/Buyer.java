package Oct22_java56;
//5번

public class Buyer {

	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0; // 핵심. i 를 어땋게 컨트롤하냐


	public Buyer(int money) {
		this.money = money;
	}

	public void buy(Product p) {
	
		if (money < p.price) {
			System.out.println("잔액이 부족하여 "+ p +"를 살 수 없습니다.");
			return;
		} 
		money = money - p.price;
		add(p); 

	}

	public void add(Product p) {
		// [i] = p; cart의 첫번째 i칸에 p를 넣는게 목적
		// i++; 이게 핵심

		if (i >= cart.length) {
			//temp라 안하고 cart했었음..
			Product[] tmp = new Product[cart.length*2];
			//int i = 0;
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			
			cart = tmp;
		}

			//for (i = 0; i >= tmp.length; i++) {
				//tmp[i] = p;
				//i++;
			//}
		cart[i++]=p;
			
	}

	public void summary() {
		
		//for(int i =0; i < cart.length ; i ++) {
			//System.out.print("구입한 목록: " + cart[i] + " ");
		//}
		//System.out.println();
		System.out.print("구입한 목록: " );
		for(Product e: cart) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		
		int sum= 0;
		for(Product p :  cart) {
			sum = sum + p.price;
		}
		
		
		System.out.println("사용금액: " + sum);
		System.out.println("남은금액: " + money );
	}

}










