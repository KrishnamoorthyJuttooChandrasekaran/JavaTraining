package Excercise;

/**
 * @author ustjavafsdb415
 *
 */
public class Employee {
	private int id;
	private String name;
	private String location;
	private double salary;
	private double inHandSalary;
	
	public Employee(int id, String name, String location, double salary) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary + ", inHandSalary=" +inHandSalary+"\n";
	}

	public double getInHandSalary() {
		return inHandSalary;
	}

	public void setInHandSalary(double inHandSalary) {
		this.inHandSalary = inHandSalary;
	}
	
	
}
