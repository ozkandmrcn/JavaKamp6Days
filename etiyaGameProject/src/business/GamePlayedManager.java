package business;
import entities.Game;
import entities.Gamer;

public class GamePlayedManager implements GamePlayedService {
	
	
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
