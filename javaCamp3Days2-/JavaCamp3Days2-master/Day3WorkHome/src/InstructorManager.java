

public class InstructorManager extends UserManager {
	
	@Override
	public void logIn(User user) {
		System.out.println(user.getUserFirstName()+ " : E�itmen giri�i");
	}
	
	public void add(Instructor instructor) {
		System.out.println( "Yeni kurs a��ld� : "+ instructor.getCourse() );
	}
	
	
}
