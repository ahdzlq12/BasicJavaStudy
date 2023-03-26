package ch08;

import java.util.ArrayList;

//import java.awt.image.DataBuffer;

//import javax.xml.crypto.Data;

public class InstantTest {
	
	public static void main(String[] args)
	{
		PersonData person = new PersonData(172,22, "kevin", 22);
		person.setPerson(177, 76, "성규창", 31);
		person.showPerson();
		//PersonData.instant().showPerson();
	
		
		int[][] as = new int[][] {{1,2},{1,2,3,4}};
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		Boolean b = arrList.add(1); //integer와 int차이
		
		System.out.println(as[0].length+","+as[1].length);
		
		System.out.println(arrList.get(0));
		System.out.println(b);
	}
	
	
}
