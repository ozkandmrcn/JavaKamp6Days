package dataAccess;

import java.util.ArrayList;

import entities.Sales;

public class SalesDao implements SalesDaoRepository {
	
	ArrayList<Sales> sales = new ArrayList<Sales>();

	@Override
	public void add(Sales sales) {
		System.out.println(
				"Oyun adı : " + sales.getGames().get(0).getGameName() + " - Kampanya adı : " + sales.getCampaign().getCampaignName()
						+ " - Müşteri adı : " + sales.getCustomer().getFirstName() + " Satış işlemi gerçekleşti");
		
		this.sales.add(sales);

	}

//	@Override
//	public void list() {
//		System.out.println("Listelendi");
//
//	}

	@Override
	public void update(Sales sales) {
		System.out.println("Kampanya adı : " + sales.getCampaign().getCampaignName() + " Müşteri adı : "
				+ sales.getCustomer().getFirstName() + " Güncellendi");

	}

	@Override
	public void delete(Sales sales) {
		System.out.println("Kampanya adı : " + sales.getCampaign().getCampaignName() + " Müşteri adı : "
				+ sales.getCustomer().getFirstName() + " Silindi");

	}

	@Override
	public ArrayList<Sales> list() {
		System.out.println("Satış listesi");
		return this.sales;
	}

}
