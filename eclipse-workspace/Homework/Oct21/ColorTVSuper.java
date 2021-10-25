package Oct21;

//문제 6번
public class ColorTVSuper extends TVSuper {

	private int color;

	public ColorTVSuper(int size, int color) {
		super(size);
		this.color = color;

	}

	public void printProperty() {

		System.out.println(getSize() + "인치 " + color + "컬러");

	}

}
