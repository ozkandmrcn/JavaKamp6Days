package etiyaGamesLayered.dataAccess.concretes.hibernate;


import java.util.ArrayList;
import java.util.List;

import etiyaGamesLayered.dataAccess.abstracts.SalesDao;
import etiyaGamesLayered.entities.concretes.Sales;

public class HibernateSalesDao implements SalesDao {


	List<Sales> sales=new ArrayList<Sales>();
	
	
	@Override
	public List<Sales> getAll() {
	
		return this.sales;
	}

	@Override
	public void add(Sales entity) {
    System.out.println(entity.getGame() + " Hibernate ile eklendi.");
		
		this.sales.add(entity);		
	}

	@Override
	public void update(Sales entity) {
		 System.out.println(entity.getGame() + " Hibernate ile güncellendi.");
		
	}

	@Override
	public void delete(Sales entity) {
		 System.out.println(entity.getGame() + " Hibernate ile silindi.");
		
	}

}
