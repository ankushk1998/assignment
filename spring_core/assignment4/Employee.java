package assignment4;



public class Employee {
	
	int empid;
	String empname;
	double salary;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	public void showEmp()
	{
		System.out.println("Employee id : "+empid);
		System.out.println("Employee name : "+empname);
		System.out.println("Employee salary : "+salary);
		
		
	}
	

}
