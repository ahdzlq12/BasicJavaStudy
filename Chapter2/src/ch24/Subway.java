package ch24;

public class Subway extends Mobility{

	public Subway(int charge, int type) {
		super(charge, type);
		// TODO Auto-generated constructor stub
		
		_userCount = 3;
		System.out.println(_userCount);
	}

}
