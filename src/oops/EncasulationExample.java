package oops;

public class EncasulationExample {
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	private int salary;
	private String company;
	private int Empid;
	

}
