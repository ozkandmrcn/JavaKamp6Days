package Concrete;

import Abstract.GameService;
import Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + "oyun markete eklendi.");		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + "oyun marketten silindi..");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + "oyun güncellendi..");
	}

	@Override
	public void addMultiple(Game[] game) {
		
		for(Game game2:game)
		{
			System.out.println(game2.getGameName() + "oyunu markete eklendi.");
		}
		
	}

}
