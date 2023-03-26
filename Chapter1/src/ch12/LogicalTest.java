package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i =2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i+2) < 10 );
		//shortcut evaluation: 첫번째 조건에서 false -> 두번째 조건 실행x
		
		System.out.println(value);
		System.out.println("안녕");
		
		
	}

}
