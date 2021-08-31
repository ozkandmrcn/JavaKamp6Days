package etiyaGamesLayered.business.abstracts;

import etiyaGamesLayered.entities.concretes.Game;
import etiyaGamesLayered.entities.concretes.Gamer;

public interface BaseCalculateService {
	
	double calculateScore(Gamer gamer , Game game);
	

}
