

public class StudentManager extends UserManager {
	
	@Override
	public void logIn(User user) {
		System.out.println(user.getUserFirstName()+ " Öðrenci Griþi");
	}
	public void discount(Student student) {
		System.out.println("Kupon kodu uygulandý : " +student.getCouponCode());
		
	}
	}
	
	
	



