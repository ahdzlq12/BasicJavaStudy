package ch10;

public class ConstantTest {

	public static void main(String[] args) {
		
		/*�׳� ������ ���� ����
		 * int MAX_NUM = 100; 
		 * MAX_NUM = 20;
		 */
		
		/*����϶��� ������ �Ұ���
		 * final int MAX_NUM = 100;
		 * MAX_NUM = 20;
		 */
		
		final int MAX_NUM = 100; 
		final int MIN_NUM;
		
		MIN_NUM = 20; //����� ����ϱ� ���� �� �ʱ�ȭ �ؾ� ��
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
	}

}
