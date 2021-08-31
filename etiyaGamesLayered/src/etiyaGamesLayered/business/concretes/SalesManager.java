package etiyaGamesLayered.business.concretes;

import java.util.List;

import etiyaGamesLayered.business.abstracts.SalesService;
import etiyaGamesLayered.dataAccess.abstracts.SalesDao;
import etiyaGamesLayered.entities.concretes.Sales;

public class SalesManager implements SalesService {

	

	SalesDao salesDao;
	
	public SalesManager(SalesDao salesDao) {
		super();
		this.salesDao = salesDao;
	}
	
	
	@Override
	public void add(Sales sales) {
		
		System.out.println( sales.getGame().getName() + " oyununu, " + sales.getGamer().getFirstName() + " oyuncusu "
				+ sales.getCampaign().getName() + " kampanyasi ile "+ sales.getGame().getUnitPrice()+" TL yerine, "
				+ sales.getCampaignPrice() +" TL ye satin alindi. " );
		
		this.salesDao.add(sales);
		
	}

	@Override
	public List<Sales> getAll() {
		// TODO Auto-generated method stub
		return this.salesDao.getAll();
	}

	@Override
	public void update(Sales sales) {
		this.salesDao.update(sales);
		
	}

	@Override
	public void delete(Sales sales) {
		this.salesDao.delete(sales);
		
	}

	
}
