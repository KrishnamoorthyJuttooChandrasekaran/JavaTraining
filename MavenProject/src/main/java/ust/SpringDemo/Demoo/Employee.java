package ust.SpringDemo.Demoo;

public class Employee {
	private int id;
	private String name;
	private String location;
	


	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("name:"+name+"\nid:"+id+"\nlocation:"+location);
	}


	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getLocation() {
		return location;
	}



	public Employee(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	} 



/*
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	*/
}
