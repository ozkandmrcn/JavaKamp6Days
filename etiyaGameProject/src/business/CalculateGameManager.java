package business;

import java.time.LocalDate;
import java.time.Period;

import entities.Game;
import entities.Gamer;

public class CalculateGameManager implements BaseCalculateService {

	@Override
	public void calculateScore(Gamer gamer, Game game) {
		
         Period ageDifference = Period.between(gamer.getYearOfBirth(), LocalDate.now());
		
		if (ageDifference.getYears() >70) {
			System.out.println(gamer.getFirstName() +" oyuncusu yaslidir. "+ game.getName() +" oyununun puaninin "
					+ "%90 ini alir. Oyun puani = "+game.getGamePoint() +" , Puaniniz = "+ game.getGamePoint()*0.9);
			
		}else if (ageDifference.getYears() >=18) {
				System.out.println(gamer.getFirstName() +" oyuncusu yetiskindir. "
						+ game.getName() + " oyununun puaninin %70 ini alir. Oyun puani = " +game.getGamePoint() +" , Puaniniz = "+ game.getGamePoint()*0.7);
				
		}else if( ageDifference.getYears() >0 && ageDifference.getYears() < 18) {
			System.out.println(gamer.getFirstName() +" oyuncusu cocuktur. "+ game.getName() +" oyununun puanlarininin "
					+ "tamamini alir. Oyun puani = "+game.getGamePoint() +" , Puaniniz = "+ game.getGamePoint());
		}
	}
		
	}


