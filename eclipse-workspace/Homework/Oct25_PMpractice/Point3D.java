package Oct25_PMpractice;

//3¹ø
public class Point3D extends Point {

	public Point3D(int x, int y, int z) {
		super(x, y, z);

	}

	public void setXYZ(int x, int y, int z) {
		super.moveUp();
		super.moveDown();
		super.move(x, y);
		super.move(x, y, z);
	}

	public String toString() {
		String str;

		str = "(" + super.getX() + "," + super.getY() + "," + super.getZ() + ") ÀÇ Á¡";

		return str;

	}

}
