package ch10;

public class ConstantTest {

	public static void main(String[] args) {
		
		/*그냥 변수일 때는 가능
		 * int MAX_NUM = 100; 
		 * MAX_NUM = 20;
		 */
		
		/*상수일때는 재정의 불가능
		 * final int MAX_NUM = 100;
		 * MAX_NUM = 20;
		 */
		
		final int MAX_NUM = 100; 
		final int MIN_NUM;
		
		MIN_NUM = 20; //상수는 사용하기 전에 꼭 초기화 해야 됨
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
	}

}
