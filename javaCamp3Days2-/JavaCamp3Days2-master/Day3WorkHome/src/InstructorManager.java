

public class InstructorManager extends UserManager {
	
	@Override
	public void logIn(User user) {
		System.out.println(user.getUserFirstName()+ " : Eðitmen giriþi");
	}
	
	public void add(Instructor instructor) {
		System.out.println( "Yeni kurs açýldý : "+ instructor.getCourse() );
	}
	
	
}
