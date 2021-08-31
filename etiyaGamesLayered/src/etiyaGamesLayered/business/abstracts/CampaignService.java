package etiyaGamesLayered.business.abstracts;

import java.util.List;

import etiyaGamesLayered.entities.concretes.Campaign;

public interface CampaignService {
	
	void add(Campaign campaign);
	List<Campaign> getAll();
	void delete(Campaign campaign);
	void update(Campaign campaign);

}
