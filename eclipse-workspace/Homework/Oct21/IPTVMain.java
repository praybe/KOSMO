package Oct21;

//문제 7번
public class IPTVMain {
	public static void main(String[] args) {

		IPTVSuper iptv = new IPTVSuper("192.1.1.2", 32, 2048);

		iptv.show();

	}
}

//192.1.1.2 주소에 32인치, 2048컬러