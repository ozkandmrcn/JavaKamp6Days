package etiyaGamesLayered.business.concretes;

import etiyaGamesLayered.business.abstracts.BaseCalculateService;
import etiyaGamesLayered.business.abstracts.GamePlayedService;
import etiyaGamesLayered.entities.concretes.Game;
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

}
