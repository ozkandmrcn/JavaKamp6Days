package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entity.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;
	
	
	

	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		
		if(userCheckService.CheckIfRealPerson(user))
		{
			System.out.println(user.getFirstName() + "kullanıcısı eklendi.");
		}
		else
		{
				System.out.println("Hatalı kullanıcı");
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + "kullanıcısı guncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + "kullanıcısı silindi.");
		
	}

}
