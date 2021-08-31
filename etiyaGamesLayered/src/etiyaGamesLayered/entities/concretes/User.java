package etiyaGamesLayered.entities.concretes;

import java.time.LocalDate;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String identyNumber;
	private LocalDate yearOfBirth;
	private String gender;
	
	
	public User() {
		super();
	}


	public User(int id, String firstName, String lastName, String identyNumber, LocalDate yearOfBirth, String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identyNumber = identyNumber;
		this.yearOfBirth = yearOfBirth;
		this.gender = gender;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


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


	public String getIdentyNumber() {
		return identyNumber;
	}


	public void setIdentyNumber(String identyNumber) {
		this.identyNumber = identyNumber;
	}


	public LocalDate getYearOfBirth() {
		return yearOfBirth;
	}


	public void setYearOfBirth(LocalDate yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

}
