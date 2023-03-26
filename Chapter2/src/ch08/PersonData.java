package ch08;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class PersonData {
	
	private float _height;
	private float _weight;
	private String _name;
	private int _age;
	int testValue;
	static private int testValue2;
	
	
	
	public int getTestValue()
	{
		return testValue;
	}
	
	PersonData(){
		_height = 0f;
		_weight = 0f;
		_name = null;
		_age = 0;
	} 
	
	PersonData(float height, float weight, String name, int age){
		_height = height;
		_weight = weight;
		_name = name;
		_age = age;
		
		setPerson(height, weight, name, age);
		 
	}
	
	public void setPerson(float height, float weight, String name, int age)
	{
		_height = height;
		_weight = weight;
		_name = name;
		_age = age;
		
	}
	
	public PersonData instant()
	{
		PersonData person = new PersonData();
		Scanner sc = new Scanner(System.in);
		
		return person;
	}
	
	public void showPerson()
	{
		System.out.print(_name + ", " + _height);
	}
	
}
