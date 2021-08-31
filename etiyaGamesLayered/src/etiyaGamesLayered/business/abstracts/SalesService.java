package etiyaGamesLayered.business.abstracts;

import java.util.List;

import etiyaGamesLayered.entities.concretes.Sales;

public interface SalesService {
	
	void add(Sales sales);
	List<Sales> getAll();

	void update(Sales sales);
	void delete(Sales sales);


}
