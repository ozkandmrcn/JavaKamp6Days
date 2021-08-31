package etiyaGamesLayered.business.abstracts;

import java.util.List;

import etiyaGamesLayered.entities.concretes.Gamer;

public interface GamerService {
	
	void add (Gamer gamer);
	List<Gamer> getAll();

	void update (Gamer gamer);
	void delete (Gamer gamer);
	
	

}
