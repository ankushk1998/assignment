package assignment4;

import org.springframework.beans.factory.annotation.Autowired;

public class Department {
	int did;
	String dname;
	@Autowired
	Employee emp;
	
	public int getDid() {
		return did;
	}
	public void setDid(int deptId) {
		this.did = deptId;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String deptname) {
		this.dname = deptname;
	}
	
	
	
	public void showDept()
	{
		System.out.println("Department id : "+did); 
		System.out.println("Department name : "+dname);
		emp.showEmp();;
	}

}
