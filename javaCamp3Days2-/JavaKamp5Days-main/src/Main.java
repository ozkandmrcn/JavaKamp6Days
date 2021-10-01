import business.concretes.MailVerificationManager;
import business.concretes.UserCheckManager;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) 
	{
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("özkan");
		user1.setLastName("Demircan");
		user1.seteMail("ozkandemrcan@hotmail.com");
		user1.setPassword("123456");
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("özkan");
		user2.setLastName("Demircan");
		user2.seteMail("ozkandemırcan@hotmail.com");
		user2.setPassword("123456");
		
		User user3 = new User();
		user3.setId(3);
		user3.setFirstName("Murat");
		user3.setLastName("Demircan");
		user3.seteMail("muratdemırcanhotmail.com");
		user3.setPassword("123456");
		
		
		
		 UserManager userManager=new UserManager(new UserCheckManager(), new MailVerificationManager(), new HibernateUserDao());
		 
		 userManager.signUp(user1);
		 userManager.signIn(user1);
		// userManager.signUp(user1);
		 
		 
		
		
		

	}

}
