package etiyaGamesLayered.business.concretes;

import java.util.List;

import etiyaGamesLayered.business.abstracts.GamerService;
import etiyaGamesLayered.core.UserIdentityValidatorService;
import etiyaGamesLayered.dataAccess.abstracts.GamerDao;
import etiyaGamesLayered.entities.concretes.Gamer;

public class GamerManager implements GamerService {


	UserIdentityValidatorService userIdentityValidatorService;
	GamerDao gamerDao;

	public GamerManager(UserIdentityValidatorService userIdentityValidatorService,GamerDao gamerDao) {
		
		this.userIdentityValidatorService = userIdentityValidatorService;
		this.gamerDao=gamerDao;
	}

	@Override
	public void add(Gamer gamer) {
		
		if(userIdentityValidatorService.isValid(gamer)==true)
		{
			  
			  this.gamerDao.add(gamer);
		}
		
		
	}

	@Override
	public List<Gamer> getAll() {
		
		return this.gamerDao.getAll();
	}

	@Override
	public void update(Gamer gamer) {
		this.gamerDao.update(gamer);
		
	}

	@Override
	public void delete(Gamer gamer) {
		this.gamerDao.delete(gamer);
		
	}
	
	
	
	
	
}
