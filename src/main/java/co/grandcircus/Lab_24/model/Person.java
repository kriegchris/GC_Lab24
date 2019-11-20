package co.grandcircus.Lab_24.model;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private String birthday;
	private String email;
	private String phoneNumber;
	private String password;
	private String branch;
	private boolean newsletter;
	
	//Constructors
	public Person() {
	}

	public Person(String firstName, String lastName, String birthday, String email, String phoneNumber, String password, String branch, boolean newsletter) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.branch = branch;
		this.newsletter = newsletter;
		
	}
	
	public Person(int id, String firstName, String lastName, String birthday, String email, String phoneNumber, String password, String branch, boolean newsletter) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.branch = branch;
		this.newsletter = newsletter;
		
	}
	

	//Getter and setter methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getBranch() {
		return branch;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public boolean isNewsletter() {
		return newsletter;
	}
	
	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	//Overloaded toString()
	@Override
	public String toString() {
		return id + "," + firstName + "," + lastName + "," + birthday + "," + email + "," + phoneNumber + "," + password + "," + newsletter;
	}



	
	
	
	
}
