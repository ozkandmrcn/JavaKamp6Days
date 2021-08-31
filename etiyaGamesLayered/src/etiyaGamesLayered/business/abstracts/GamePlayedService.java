package etiyaGamesLayered.business.abstracts;

import etiyaGamesLayered.entities.concretes.Game;
import etiyaGamesLayered.entities.concretes.Gamer;

public interface GamePlayedService {
	
	void play (Gamer gamer,Game game);

}
