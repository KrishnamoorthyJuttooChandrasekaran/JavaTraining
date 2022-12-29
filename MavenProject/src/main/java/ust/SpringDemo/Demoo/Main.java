package ust.SpringDemo.Demoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee employee = context.getBean("emp",Employee.class);
	employee.display();
	
	}		
}
