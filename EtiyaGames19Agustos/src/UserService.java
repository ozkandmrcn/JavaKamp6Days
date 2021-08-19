import java.util.ArrayList;

public class UserService {
	
   ArrayList<User> users=new ArrayList<User>();
	
	public void add(User user)
	{
		if (user.getAge() >= 15 ) {
			users.add(user);	
		}else {
			System.out.println("15 Yasindan kucuksun");
		}	
	}
	
	public ArrayList<User> getAllUsers()
	{
		
		User user1=new User("Özkan","Demircan",18);
		User user2=new User("Murat","Demircan",17);
		
		users.add(user1);
		users.add(user2);
		
		return users;
	}

}
