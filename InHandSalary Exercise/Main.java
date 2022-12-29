package Excercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List <Employee> emplist = EmployeeDao.getAll();
		List <Employee> finalList = new ArrayList<>();
		
		
		for (Employee employee : emplist) {
			if ( employee.getSalary() > 0 && employee.getSalary() < 25000) 
				employee.setInHandSalary(employee.getSalary()-employee.getSalary()*0.05);
			else if( employee.getSalary() >= 25000 && employee.getSalary() < 50000)
				employee.setInHandSalary(employee.getSalary()-employee.getSalary()*0.07);
			else if( employee.getSalary() >= 50000 && employee.getSalary() < 80000)
				employee.setInHandSalary(employee.getSalary()-employee.getSalary()*0.12);
			else
				employee.setInHandSalary(employee.getSalary()-employee.getSalary()*0.18);
			finalList.add(employee);
		}
		System.out.println(finalList);
	}
	
	

}
