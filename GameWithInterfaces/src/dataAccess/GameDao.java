package dataAccess;

import java.util.ArrayList;

import entities.Game;

public class GameDao implements GameDaoRepository {

	ArrayList<Game> games = new ArrayList<Game>();
	
	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyunu  eklendi");
		games.add(game);

	}

	@Override
	public void list(){
		System.out.println( "Oyunlar Listelendi");

	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " G�ncellendi");

	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " Silindi");

	}

}
