package dataAccess;

import java.util.ArrayList;

import entities.Sales;

public interface SalesDaoRepository {
	void add(Sales sales);
	//void list();
	void update(Sales sales);
	void delete(Sales sales);
	ArrayList <Sales> list();
}
