

public class User {
	
	int userId;
	String userFirstName;
	String userLastName;
	String userEmail;
	String Password;
	
	
	
	



	public User()
	{
		
	}
	
	
	
	public User(int userId, String userFirstName, String userLastName, String userEmail,String Password) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.Password=Password;
		
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	public String getPassword() {
		return Password;
	}



	public void setPassword(String password) {
		Password = password;
	}
	
	

}
