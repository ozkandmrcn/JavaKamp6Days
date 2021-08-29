package business;

import entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		
		System.out.println(game.getName() +   " : Oyunu  eklendi");
		
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() +  "Güncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() +  "Silindi");
		
	}

}
