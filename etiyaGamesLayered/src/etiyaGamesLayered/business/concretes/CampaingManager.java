package etiyaGamesLayered.business.concretes;

import java.util.List;

import etiyaGamesLayered.business.abstracts.CampaignService;
import etiyaGamesLayered.dataAccess.abstracts.CampaignDao;
import etiyaGamesLayered.entities.concretes.Campaign;

public class CampaingManager implements CampaignService {
	
	
	CampaignDao campaignDao;
	
	public CampaingManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}


	@Override
	public void add(Campaign campaign) {
        this.campaignDao.add(campaign);		
	}


	@Override
	public List<Campaign> getAll() {
		
		return this.campaignDao.getAll();
	}

	@Override
	public void delete(Campaign campaign) {
        this.campaignDao.delete(campaign);		

		
	}

	@Override
	public void update(Campaign campaign) {
        this.campaignDao.update(campaign);		
		
	}

}
