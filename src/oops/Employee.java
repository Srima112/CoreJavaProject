package oops;

public class Employee {
	
	public String name;
	public int EmpID;
	private static int salary=60000;
	
	

	public Employee()
	{
		System.out.println("Default constructer");
	}
	public Employee(String var1,int var2)
	{
		System.out.println("inside parameterized constructer");
		name= var1;
		EmpID= var2;
	}
	
	public void Displayname()
	{
		System.out.println("Name of employee is "+salary);
	}
	public static void Displaysalary()
	{
		System.out.println("salary of employee is "+salary);
	}

}
