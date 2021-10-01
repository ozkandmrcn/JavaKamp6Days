
public class Customer implements Entity {
	
	private int id;
	private String FirstName;
	private String LastName;
	private String NationalityId;
	private int dateOfBirth;
	private int age;
	
	
	public Customer() {
		super();
	}


	public Customer(int id, String firstName, String lastName, String nationalityId, int dateOfBirth, int age) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		NationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getNationalityId() {
		return NationalityId;
	}


	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	


}
