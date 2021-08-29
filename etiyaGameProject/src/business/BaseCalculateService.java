package business;

import entities.Game;
import entities.Gamer;

public interface BaseCalculateService {
	void calculateScore(Gamer gamer,Game game);
}
