package ch02;

public class Customer {
	
	protected int _customerID;
	protected String _customerName;
	protected String _customerGrade; 
	
	protected int _bonusPoint;
	protected double _bonusRatio;
	
	public Customer() {
		_customerGrade = "SILVER";
		_bonusRatio = 0.01;
		
	}
	
	public int calcPrice(int price)
	{
		System.out.println("parent");
		
		_bonusPoint += price * _bonusRatio;
		
		return price;
	}
	
	
	public int getCustomerID()
	{
		return _customerID;
	}
	
	public void setCustomerID(int customerID) {
		_customerID = customerID;
	}
	
	public String getCustomerName()
	{
		return _customerName;
	}
	
	public void setCustomerName(String customerName) {
		_customerName = customerName;
	}
	
	public String getCustomerGrade()
	{
		return _customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		_customerGrade = customerGrade;
	}
	
	public String showCustomerInfo()
	{
		return _customerName + "님의 등급은" + _customerGrade +
				"이며, 보너스 포인트는" + _bonusPoint + "입니다";
	}

	
	
}
