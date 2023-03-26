package ch13;

import java.util.Scanner;

public class ConitionTest {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in); //System.in 표준 입력(콘솔에서 입/출력)
		//스캐너는 자바에서 지원
		
		int num = scanner.nextInt(); //입력 받는 것
		System.out.println(num);
		
		System.out.println("입력1: ");
		int num1 = scanner.nextInt();
		System.out.println("입력2: ");
		int num2 = scanner.nextInt();
		
		int maxNum = (num1 > num2) ? num1: num2;
		
		System.out.println(maxNum);
		
		
		
	}
}
