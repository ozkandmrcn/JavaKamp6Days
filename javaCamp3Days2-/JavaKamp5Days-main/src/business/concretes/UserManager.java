package business.concretes;

import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import business.abstracts.VerificationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	
	
	UserCheckService userCheckService;
	VerificationService mailVerificationService;
	UserDao userDao;
	
	
	
	

	public UserManager(UserCheckService userCheckService, VerificationService mailVerificationService,
			UserDao userDao) {
		super();
		this.userCheckService = userCheckService;
		this.mailVerificationService = mailVerificationService;
		this.userDao = userDao;
	}

	@Override
	public void signUp(User user) {
		
				if (userCheckService.isValid(user) == true) {
					System.out.print(user.getFirstName() + " kullanıcısı başarıyla sisteme eklendi.\n");
					mailVerificationService.sendToVerifyMail(user.geteMail());
					userDao.add(user);
				}
	}

	@Override
	public void signIn(User user) {
		
		
				mailVerificationService.verifyMail(user.geteMail());

				if (userDao.getEmail(user.geteMail()) && userDao.getPassword(user.getPassword())
						&& mailVerificationService.checkVerifyAccount(user.geteMail()) == true) {
					System.out.println("Kullanıcı girişi başarıyla yapıldı.");
				} else if (mailVerificationService.checkVerifyAccount(user.geteMail()) == false) {
					System.out.println("Kullanıcı bilgileri doğru. Fakat mail adresi doğrulanmadığı için giriş yapılamıyor.");
				} else {
					System.out.println("Kullanıcı bilgileri yanlış, lütfen kontrol ediniz.");
				}
	}

}
