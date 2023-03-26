package ch17;

public class WhlieTest {
	
	public static void main(String[] args)
	{
		int count =0;
		int sum = 0;
		
		while (count < 10) {
			
			count++;
			sum += count;
		}
		
		count = 0;
		sum = 0;
		
		do {
			sum+=count;
			count ++;
		}while(count < 10);
		
		
		System.out.println(count);
		System.out.println(sum);
	}
}
