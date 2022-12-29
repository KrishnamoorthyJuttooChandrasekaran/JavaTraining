package Excercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Assignments.Person;

public class EmployeeDao {
	public static List<Employee> getAll() {
		return Stream.of(
				new Employee(101,"Kriz","chn",22000), //5
				new Employee(102,"Krishna","hyd",26000), //7
				new Employee(103,"Moorthy","chn",54000), //12
				new Employee(104,"JC","mdu",80000) //18
				).collect(Collectors.toList());
	}
}
