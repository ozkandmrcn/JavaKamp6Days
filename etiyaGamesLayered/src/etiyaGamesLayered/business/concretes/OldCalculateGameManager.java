package etiyaGamesLayered.business.concretes;

import java.time.LocalDate;
import java.time.Period;

import etiyaGamesLayered.business.abstracts.BaseCalculateService;
import etiyaGamesLayered.entities.concretes.Game;
import etiyaGamesLayered.entities.concretes.Gamer;

public class OldCalculateGameManager implements BaseCalculateService{

	@Override
	public double calculateScore(Gamer gamer, Game game) {
		Period ageDifference = Period.between(gamer.getYearOfBirth(), LocalDate.now());
		if (ageDifference.getYears() >70) {
			System.out.println(gamer.getFirstName() +" oyuncusu yaslidir. "+ game.getName() +" oyununun puaninin "
					+ "%90 ini alir. Oyun puani = "+game.getGamePoint() +" , Puaniniz = "+ game.getGamePoint()*0.9);
			return game.getGamePoint()*0.9;
		}else {
			System.out.println("Yasli degilsiniz.");
			return 0;
		}
	}

}
