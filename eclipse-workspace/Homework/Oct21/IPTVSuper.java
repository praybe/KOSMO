package Oct21;

//문제 7번
public class IPTVSuper extends ColorTVSuper {

	private String ip;

	public IPTVSuper(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;

	}

	public void show() {

		System.out.print(ip + " 주소에 ");
		super.printProperty();

	}

}
