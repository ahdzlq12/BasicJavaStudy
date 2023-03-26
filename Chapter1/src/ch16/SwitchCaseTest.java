package ch16;

import java.util.Scanner;

public class SwitchCaseTest {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int month = -1;
		int day = -1;
		
		month = scanner.nextInt();
		
		
//		switch(month) {
//		
//		case 1: case 3: case 5: //조건을 하나로 모아서 사용 가능
//			day = 31;
//			break;
//		case 2:
//			day = 28;
//			break;
//		
//		//..
//			
//		default:
//			day = 30;
//			break;
//		}
		
		int result = switch(month) {
			
			case 1, 3, 5 -> {
				day = 31;
				yield 100;
			}
			
			case 2 ->
			{
				day = 28;
				yield 10;
			}
			
			default ->
			{
				day =1;
				yield 1;
			}
		};
			

		System.out.println(result+ "," + day);
		System.out.println(month + "월 " + day + "일 ");
		
		
		
		
		
	}
	
}
