package etiyaGamesLayered.business.abstracts;

import etiyaGamesLayered.entities.concretes.Game;
import etiyaGamesLayered.entities.concretes.GamePlayed;
import etiyaGamesLayered.entities.concretes.Gamer;

public interface GamePlayedService extends BaseService<GamePlayed> {
	
	void play (Gamer gamer,Game game);

}
