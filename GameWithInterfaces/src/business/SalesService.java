package business;

import java.util.ArrayList;

import entities.Sales;

public interface SalesService {
	void add(Sales sales);
	//void list();
	void update(Sales sales);
	void delete(Sales sales);
	
	ArrayList<Sales>salesList();
}
