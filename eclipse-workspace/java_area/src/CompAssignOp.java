// ���� ���� ������
public class CompAssignOp {

	public static void main(String[] args) {
		
		short num=10;
		num=(short)(num+77L); //�� ��ȯ ���ϸ� ������ ���� �߻� 
		//L ���� 64��Ʈ�ϱ�
		int rate=3;
		rate=(int)(rate*3.5); //�� ��ȯ ���ϸ� ������ ���� �߻� 
		//(int)����� ������
		System.out.println(num);
		System.out.println(rate);
		
		num=10;
		num+=77L; //�� ��ȯ ���ʿ�
		rate=3;
		rate*=3.5; //�� ��ȯ ���ʿ�
		System.out.println(num);
		System.out.println(rate);
		
		

	}

}