package etiyaGamesLayered.entities.concretes;

import java.time.LocalDate;

public class Gamer extends User {
	
	public Gamer()
	{
		
	}
	
	public Gamer(int id, String firstName, String lastName, String identityNumber, LocalDate yearOfBirth,String gender) {
		super(id, firstName, lastName, identityNumber, yearOfBirth,gender);
		
	}
	
	

}
