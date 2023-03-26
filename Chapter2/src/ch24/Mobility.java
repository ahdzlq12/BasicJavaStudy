package ch24;

import java.util.ArrayList;

public class Mobility {

	protected int _userCount = 0;
	protected int _charge;
	protected int _type; //0버스, 1지하철, 2택시
	ArrayList<Mobility> _mobilityList = new ArrayList<Mobility>();
	
	public Mobility(int charge, int type)
	{
		_charge = charge;
		_type = type;
		System.out.println(_userCount);
//		switch (type) {
//		case 0: {
//			_mobilityList.add(new Bus(charge, type));
//			
//		}
//		
//		}
	}
	public void TestMo()
	{
		
	}
	
	protected int getUserCount()
	{
		return _userCount;
	}
	
	protected void takeOnMobility()
	{
		_userCount++;
	}
	
	protected void takeOffMobility()
	{
		_userCount--;
	}
}
