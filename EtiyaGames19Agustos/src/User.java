
public class User {
	
	private String firsName;
	private String lastName;
	
	private int age;
	
	

	public User() {
		super();
	}


	public User(String lastName, String firsName, int age) {
		super();
		this.lastName = lastName;
		this.firsName = firsName;
		this.age = age;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirsName() {
		return firsName;
	}



	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}


	@Override
	public String toString() {
		return "User [firsName=" + firsName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	
	

}
