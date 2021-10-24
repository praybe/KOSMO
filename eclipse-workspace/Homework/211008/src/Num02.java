//211008 homework ¹Ð¸°°Å 
public class Num02 {

	public static void main(String[] args) {
		public class Money {

	public static void main(String[] args) {

		int n_500, n_100, n_50, n_10, n_5, n_1, money, tmp;
		money = 126500;

		n_500 = 126500 / 50000;
		tmp = money - (n_500 * 50000);

		n_100 = tmp / 10000;
		tmp = tmp - (n_100 * 10000);

		n_50 = tmp / 5000;
		tmp = tmp - (n_50 * 5000);

		n_10 = tmp / 1000;
		tmp = tmp - (n_10 * 1000);

		n_5 = tmp / 500;
		tmp = tmp - (n_5 * 500);

		n_1 = tmp / 100;
		tmp = tmp - (n_1 * 100);

		System.out.println("오만원: " + n_500 + "장");
		System.out.println("만원: " + n_100 + "장");
		System.out.println("오천원: " + n_50 + "장");
		System.out.println("천원: " + n_10 + "장");
		System.out.println("오백원: " + n_5 + "개");
		System.out.println("백원: " + n_1 + "개");

	}

}
/*
오만원: 2장
만원: 2장
오천원: 1장
천원: 1장
오백원: 1개
백원: 0개
*/
