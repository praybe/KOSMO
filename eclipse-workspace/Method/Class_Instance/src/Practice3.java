//BankAccount 생성자 응용
class Song {

	String title;
	String artist;
	int year;
	String country;

	Song(int year, String country, String artist, String title) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	void show() {
		System.out.println(year + "년, " + country + " 국적의 " + artist + "가 부른 " + "\"" + title + "\"");

	}

}

public class Practice3 {

	public static void main(String[] args) {

		Song song = new Song(1978, "스웨덴", "ABBA", "Dancing Queen");

		song.show();

	}

}

//출력값
//1978년, 스웨덴 국적의 ABBA가 부른 "Dancing Queen"
