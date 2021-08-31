package etiyaGamesLayered.business.concretes;

import java.util.List;

import etiyaGamesLayered.business.abstracts.BaseCalculateService;
import etiyaGamesLayered.business.abstracts.GamePlayedService;
import etiyaGamesLayered.entities.concretes.Game;
import etiyaGamesLayered.entities.concretes.GamePlayed;
import etiyaGamesLayered.entities.concretes.Gamer;

public class GamePlayedManager implements GamePlayedService{

	
	BaseCalculateService baseCalculateService;
	
	
	public GamePlayedManager(BaseCalculateService baseCalculateService) {
		super();
		this.baseCalculateService = baseCalculateService;
	}


	@Override
	public void play(Gamer gamer, Game game) {
		
		this.baseCalculateService.calculateScore(gamer, game);
		
	}


	@Override
	public void add(GamePlayed entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<GamePlayed> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delete(GamePlayed entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(GamePlayed entity) {
		// TODO Auto-generated method stub
		
	}

}
