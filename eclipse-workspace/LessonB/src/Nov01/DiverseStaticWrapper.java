package Nov01;

public class DiverseStaticWrapper {
	public static void main(String[] args) {

		// Ŭ���� �޼ҵ带 ���� �ν��Ͻ� ���� ��� �� ����
		Integer n1 = Integer.valueOf(5);
		Integer n2 = Integer.valueOf("1024"); //String���� �� ���ڿ��� ���ڷ� �ٲٴ� ��.
		//db������ valueOf�ſ� ���� ��. 

		// ��� �񱳿� ���� ����ϴ� Ŭ���� �޼ҵ�
		System.out.println("ū ��: " + Integer.max(n1, n2));
		System.out.println("���� ��: " + Integer.min(n1, n2));
		System.out.println("��: " + Integer.sum(n1, n2));
		System.out.println();
		
		//�ִ밪 �ּҰ�
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		// ������ ���� 2��, 8��, 16���� ǥ�� ����� ��ȯ�ϴ� Ŭ���� �޼ҵ�
		System.out.println("12�� 2�� ǥ��: " + Integer.toBinaryString(12));
		System.out.println("12�� 8�� ǥ��: " + Integer.toOctalString(12));
		System.out.println("12�� 16�� ǥ��: " + Integer.toHexString(12));

	}

}