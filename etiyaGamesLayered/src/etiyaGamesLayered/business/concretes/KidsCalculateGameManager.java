package etiyaGamesLayered.business.concretes;

import java.time.LocalDate;
import java.time.Period;

import etiyaGamesLayered.business.abstracts.BaseCalculateService;
import etiyaGamesLayered.entities.concretes.Game;
import etiyaGamesLayered.entities.concretes.Gamer;



public class KidsCalculateGameManager implements BaseCalculateService {

	@Override
	public double calculateScore(Gamer gamer, Game game) {
		
		Period ageDifference = Period.between(gamer.getYearOfBirth(), LocalDate.now());
		if( ageDifference.getYears() >0 && ageDifference.getYears() < 18) {
			System.out.println(gamer.getFirstName() +" oyuncusu cocuktur. "+ game.getName() +" oyununun puanlarininin "
					+ "tamamini alir. Oyun puani = "+game.getGamePoint() +" , Puaniniz = "+ game.getGamePoint());
			
			return game.getGamePoint();
			
		}else {
			System.out.println(" Yasiniz 18 den buyuk, Çocuk degilsiniz");
			return 0;
			
		}
	
		
		
	}

}
