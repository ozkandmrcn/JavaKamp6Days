package etiyaGamesLayered.business.concretes;

import java.util.List;

import etiyaGamesLayered.business.abstracts.GameService;
import etiyaGamesLayered.dataAccess.abstracts.GameDao;
import etiyaGamesLayered.entities.concretes.Game;

public class GameManager implements GameService {
	
	

	GameDao gameDao;
	
	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		this.gameDao.add(game);
		
	}

	@Override
	public List<Game> getAll() {
		
		return this.gameDao.getAll();
	}

	@Override
	public void delete(Game game) {
		this.gameDao.delete(game);
		
	}

	@Override
	public void update(Game game) {
		this.gameDao.update(game);
		
	}

	

}
