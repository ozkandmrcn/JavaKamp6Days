package etiyaGamesLayered.business.abstracts;

import java.util.List;

import etiyaGamesLayered.entities.concretes.Game;

public interface GameService {
	
	void add(Game game);
	List<Game> getAll();

	void delete (Game game);
	void update (Game game);

}
