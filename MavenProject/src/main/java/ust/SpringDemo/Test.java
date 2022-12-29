package ust.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		BusinessPerson businessPerson = (BusinessPerson) applicationContext.getBean("businessPerson");
		Employee employee = (Employee) applicationContext.getBean("employee");

		businessPerson.name();
		businessPerson.experience();
		
		employee.name();
		employee.experience();
		
	}
}
