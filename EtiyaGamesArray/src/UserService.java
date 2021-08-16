import java.util.ArrayList;

public class UserService {
	
	
	ArrayList<User>users=new ArrayList<User>();
	
	public void add(User user)
	{
		if(user.getAge()<15)
		{
			System.out.println("Yaşınız uygun değil.");
			
		}
		else
		{
			System.out.println("Kullanıcı kaydedildi. " + user.getFirstName());
		}

			
		}
	
	public ArrayList<User> getAllUsers()
	{
		
		return users;
		
	}
	
	
	
	

}
