package ch04;

public class BinaryTest {

	public static void main(String[] args)
	{
		int num = 10;
		int bNum = 0B1010; //2����
		int oNum = 012; //8����
		int xNum = 0xA; //16����
		
		oNum = 0777777;
		xNum = 0XAAAAAAAA; //2,863,311,530 -> -1,431,655,766 (FFFF FFFF AAAA AAAA)
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}
}
