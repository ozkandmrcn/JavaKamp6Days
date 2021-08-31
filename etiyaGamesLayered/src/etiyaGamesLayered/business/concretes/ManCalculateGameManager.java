package etiyaGamesLayered.business.concretes;

import java.time.LocalDate;
import java.time.Period;

import etiyaGamesLayered.business.abstracts.BaseCalculateService;
import etiyaGamesLayered.entities.concretes.Game;
import etiyaGamesLayered.entities.concretes.Gamer;

public class ManCalculateGameManager implements BaseCalculateService {

	@Override
	public double calculateScore(Gamer gamer, Game game) {
		Period ageDifference = Period.between(gamer.getYearOfBirth(), LocalDate.now());
		if(ageDifference.getYears() >=18 && ageDifference.getYears() <=70 ) {
			System.out.println(gamer.getFirstName() +" oyuncusu yetiskin bir erkektir. "
					+ game.getName() + " oyununun puaninin %70 ini alir. Oyun puani = " +game.getGamePoint() +" , Puaniniz = "+ game.getGamePoint()*0.7);
			return game.getGamePoint()*0.7;
		}else {
			System.out.println("Yetiskin degilsiniz.");
			return 0;
		}
	}
	}


