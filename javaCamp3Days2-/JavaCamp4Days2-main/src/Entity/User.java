package Entity;



import Abstract.Entity;

public class User implements Entity {
	private int Id;
	private String firstName;
	private String lastName;
	private String nationalId;
	private int birthDate;
	
	
	public User() {
		super();
	}


	public User(int id, String firstName, String lastName, String nationalId, int birthDate) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.birthDate = birthDate;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
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


	public String getNationalId() {
		return nationalId;
	}


	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}


	public int getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}


	

}
