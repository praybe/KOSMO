package edu.kosmo.ex.market;


public class Buyer {

	int money = 1000;
	
	//shape[] shape = {new Rectangle(10,10), new Circle(10)}이랑 같음
	Product[] cart = new Product[3];
	
	//배열, index라고 함. []안에 들어갈, 컨트롤 할 인덱스를 뒀음
	int i = 0; // 핵심. i 를 어땋게 컨트롤하냐


	public Buyer(int money) {
		this.money = money;
	}

	public void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 "+ p +"을/를 살 수 없습니다.");
			return; //끝내고 
		} //만약 money가 price보다 크면 뒤를 진행시켜.
		money = money - p.price; //자기가 가진 가격에서 뺴줘.
		add(p); //add하고 p 호출

	}
	
	//public void add(Product p = new Tv()) 부모는 자식해서 Product[] 요 안에 넣어 줘 
	public void add(Product p) {
		// 힌트 [i] = p; cart의 첫번째 i칸에 p를 넣는게 목적
		// 힌트 i++; 이게 핵심
		
		//작거나 크다? 무조건 if
		//i와 장바구니 크기 비교.
		//장바구니 크기 어떻게 구한다? cart.length
		if (i >= cart.length) { //i값이 3이상일때 실행
			//tmp라 안하고 cart했었음..
			Product[] tmp = new Product[cart.length*2]; //기존 장바구니보다 2배
			
			//카트 0번지를 tmp0번지로 복사해 몇 개? 3개. 
			//cart[0]이 원본(source) tmp[0]을 복사지? 뭐라카더라...(desc)
			System.arraycopy(cart, 0, tmp, 0, cart.length); 
			
			//★ 엄청 중요!!! 새거랑 기존거 바꿔치기 !!! ★
			cart = tmp;
		}
		
		//★핵심★
		//cart[i++]=p; 내가 쓴건 이건데 이렇게도 가능. 밑에 거를 합친거
		cart[i] = p;
		i++;
			
	}

	public void summary() {
		
	
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

/*저자의 답안

 public void summary() {
 String itemList = "";
 int sum=0;
 for (Product product : cart) {
	 itemList = itemList + product.toString();
	 sum = sum + product.price;
 }
 
 System.out.println("구입 물건" + itemLIST);
 System.out.println("사용 금액" + sum);
 System.out.println("남은 금액" + money);
 
}
 
*/







