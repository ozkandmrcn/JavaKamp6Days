package etiyaGamesLayered.dataAccess.concretes.hibernate;

import java.util.ArrayList;
import java.util.List;

import etiyaGamesLayered.dataAccess.abstracts.GamerDao;
import etiyaGamesLayered.entities.concretes.Gamer;

public class HibernateGamerDao implements GamerDao {

	
	 List<Gamer> gamers=new ArrayList<Gamer>();
	
	

	@Override
	public List<Gamer> getAll() {
		
		return this.gamers;
	}

	@Override
	public void add(Gamer entity) {

    System.out.println(entity.getFirstName() + " Hibernate ile eklendi.");
		
		this.gamers.add(entity);
		
	}

	@Override
	public void update(Gamer entity) {
		  System.out.println(entity.getFirstName() + " Hibernate ile güncellendi.");
		
	}

	@Override
	public void delete(Gamer entity) {
		  System.out.println(entity.getFirstName() + " Hibernate ile silindi.");
		
	}

}