package etiyaGamesLayered.dataAccess.concretes.hibernate;


import java.util.ArrayList;
import java.util.List;

import etiyaGamesLayered.dataAccess.abstracts.CampaignDao;
import etiyaGamesLayered.entities.concretes.Campaign;

public class HibernateCampaignDao  implements CampaignDao
{
	
	List<Campaign> campaigns=new ArrayList<Campaign>();

	

	@Override
	public List<Campaign> getAll() {
		
		return this.campaigns;
	}

	@Override
	public void add(Campaign entity) {
		
		System.out.println(entity.getName() +  " Hibernate ile eklendin");
		
		this.campaigns.add(entity);
		
	}

	@Override
	public void update(Campaign entity) {
		
		System.out.println("Hibernate ile güncellendi.");
		
	}

	@Override
	public void delete(Campaign entity) {
		
		System.out.println("Hibernate ile silindi.");
		
		 
		
	}

}
