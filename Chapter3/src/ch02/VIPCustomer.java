package ch02;

public class VIPCustomer extends Customer {
	
	private int _agentID;
	private double _salesRatio;
	
	public int getAgentID()
	{
		return _agentID;
	}


	public int calcPrice(int price)
	{
		System.out.println("child");
		
		_bonusPoint += price * _bonusRatio * _salesRatio;
		
		return price;
	}
	
	
}
