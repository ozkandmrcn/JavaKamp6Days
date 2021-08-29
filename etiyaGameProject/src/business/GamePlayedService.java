package business;

import entities.Game;
import entities.Gamer;

public interface GamePlayedService {
	
	void play(Gamer gamer, Game game);
}