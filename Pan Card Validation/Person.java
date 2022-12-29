package Assignments;

import java.util.List;

public class Person {
	private int id;
	private String name;
	private String email;
	private String location;
	private List<String> phoneNumber;
	private String panCard;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public Person(int id, String name, String email, String location, List<String> phoneNumber, String panCard) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.panCard = panCard;
	}
	@Override
	public String toString() {
		return "id=" + id + "\tname=" + name + "\temail=" + email + "\tlocation=" + location + "\tphoneNumber="
				+ phoneNumber + "\tpanCard=" + panCard + "\n";
	}
		
	
}
