package business;

import entities.Sales;

public class SalesManager implements SalesService{

	@Override
	public void add(Sales sales) {
		System.out.println( sales.getGame().getName() + " oyununu, " + sales.getGamer().getFirstName() + " oyuncusu "
				+ sales.getCampaign().getName() + " kampanyasi ile "+ sales.getGame().getUnitPrice()+" TL yerine, "
				+ sales.getCampaignPrice() +" TL ye satin alindi. " );
					
				
		
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Sales sales) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Sales sales) {
		// TODO Auto-generated method stub
		
	}

}
