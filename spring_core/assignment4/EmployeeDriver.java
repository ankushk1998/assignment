package assignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Q15.Customer;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("my.xml");
		//Employee emp=(Employee) context.getBean("objemp");
		Department dept=(Department) context.getBean("objdep");
		dept.showDept();
		
		
		
		
		
		
		
	}

}
