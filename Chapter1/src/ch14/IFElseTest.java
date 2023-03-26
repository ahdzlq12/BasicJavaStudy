package ch14;

import java.util.Scanner;

public class IFElseTest {

	public static void main(String[] args)
	{
		int account = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("예금 입력: "); //println은 출력 후 자동 개행. print는 개행 없음
		account = scanner.nextInt(); 
		
		
		if(account > 1000000)
		{
			System.out.println("나의 예금: " + account);
			System.out.println("나의 세금: " + account * 0.1);
		}
		
		else
		{
			System.out.println("나의 예금: " + account);
			System.out.println("0");
		}
		
		
	}
	
}
