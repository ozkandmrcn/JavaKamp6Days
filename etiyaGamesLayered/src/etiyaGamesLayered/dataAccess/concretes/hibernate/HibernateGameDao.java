package etiyaGamesLayered.dataAccess.concretes.hibernate;

import java.util.ArrayList;
import java.util.List;

import etiyaGamesLayered.dataAccess.abstracts.GameDao;
import etiyaGamesLayered.entities.concretes.Game;



public class HibernateGameDao implements GameDao {
	
	  List<Game> games=new ArrayList<Game>();

	

	@Override
	public List<Game> getAll() {
		
		
	
		return this.games;
	}

	@Override
	public void add(Game entity) {
		System.out.println(entity.getName() + " Hibernate ile eklendi.");
		
		this.games.add(entity);
		
	}

	@Override
	public void update(Game entity) {
		System.out.println(entity.getName() + " Hibernate ile güncellendi.");
		
		
	}

	@Override
	public void delete(Game entity) {
		System.out.println(entity.getName() + " Hibernate ile silindi.");
		
		
		
	}

}
