import java.util.ArrayList;

import business.CampaignManager;
import business.CustomerManager;
import business.GameManager;
import business.SalesManager;
import core.MernisCheckAdapter;
import dataAccess.CampaignDao;
import dataAccess.CampaignDaoRepository;
import dataAccess.CustomerDao;
import dataAccess.CustomerDaoRepository;
import dataAccess.GameDao;
import dataAccess.SalesDao;
import entities.Campaign;
import entities.Customer;
import entities.Game;
import entities.Sales;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("---------Oyunlar-------------");

		Game game1 = new Game(1, "CS:GO", 50);
		Game game2 = new Game(2, "LOL", 20);

	

		GameManager gameManager = new GameManager(new GameDao());
		gameManager.add(game2);
		gameManager.add(game1);
		
		ArrayList<Game> games = new ArrayList<Game>();
		games.add(game1);
		games.add(game2);
		
		
		
		
		gameManager.list();
		
		System.out.println("---------Oyuncular-------------");

		Customer customer1 = new Customer(1, "Özkan", "Demircan", "1996", "1856621451");
		CustomerManager customerManager = new CustomerManager(new CustomerDao(), new MernisCheckAdapter());
		customerManager.add(customer1);

		System.out.println("---------Kampanyalar-------------");

		Campaign campaign1 = new Campaign(1, "Yaz indirimi", 15);
		Campaign campaign2 = new Campaign(2, "Kış indirimi", 30);
		CampaignManager campaignManager = new CampaignManager(new CampaignDao());
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);

		System.out.println("---------Satış-------------");

		
		Sales sales1 = new Sales(1, games, customer1, campaign2);
		Sales sales2 = new Sales(2, games, customer1, campaign1);
		SalesManager salesManager = new SalesManager(new SalesDao());
		salesManager.add(sales1);
		salesManager.add(sales2);
		
		for (Sales sales : salesManager.salesList()) {
			
			System.out.println(sales);
			
		}

	}

}
