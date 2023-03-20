package oops;

public class citizen extends person{

	public int SSN;
	
	public citizen()
	{
		System.out.println("default constructer of citizen");
	}
	
	public citizen(String name,String countryname, int age, int SSN)
	{
		System.out.println("parameterized constructer");
		this.name=name;
		this.countryname=countryname;
		this.age=age;
		this.SSN=SSN;
		
	}

	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("SSN is"+SSN);
	
	}
	
	
}
