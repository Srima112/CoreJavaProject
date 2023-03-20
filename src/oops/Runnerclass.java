package oops;

public class Runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Employee emp1=new Employee();
		emp1.name= "srima";
		emp1.EmpID= 104356;
		
		emp1.Displayname();
		
		Employee emp2=new Employee();
		emp2.name= "Rajiv";
		emp2.EmpID= 104376;
		
		emp2.Displayname();
		
		Employee emp3=new Employee("Saswati",109865);
		emp3.Displayname();
		
		
		Employee.Displaysalary();*/
		
		System.out.println("creating ct1");
	    citizen ct1=new citizen();
		ct1.age=25;
		ct1.name="sree";
		ct1.SSN=15678;
		ct1.countryname="INDIA";
		ct1.print();
		
		System.out.println("creating ct2");
	    citizen ct2=new citizen("Saswati","INDIA",26,45678);
	    ct2.print();
	    
	    
	    System.out.println("creating object");
	    Insurance obj1=new Insurance();
	    obj1.insuranceID=5000;
	    obj1.print();
	    
	    ICICIBank bank=new ICICIBank();
	    bank.print();
	    
	    EncasulationExample emp=new EncasulationExample();
	    emp.setSalary(5000);
	    System.out.println("the salary is"+emp.getSalary());
	    		
	    
	    
	    
        person p1=new person();
		
		p1.age=31;
		p1.name="Rajiv";
		

	}

}
