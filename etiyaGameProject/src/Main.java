
import java.time.LocalDate;

import business.CalculateGameManager;
import business.CampaignManager;
import business.CampaignService;
import business.GameManager;
import business.GamePlayedManager;
import business.GamePlayedService;
import business.GameService;
import business.GamerManager;
import business.GamerService;
import business.SalesManager;
import business.SalesService;
import core.mernisServiceAdapter;
import entities.Campaign;
import entities.Game;
import entities.Gamer;
import entities.Sales;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1=new Gamer(1, "Özkan", "Demircan", "7856215625",LocalDate.of(1995, 9, 18),"Erkek");
		Gamer gamer2=new Gamer(2, "Murat", "Demircan", "7856215625",LocalDate.of(1881, 9, 18),"Erkek");
		Gamer gamer3=new Gamer(3, "Ensar", "Demircan", "7856215625",LocalDate.of(2010, 9, 18),"Erkek");
		
		
		
		
		System.out.println("----------Kullanıcı kontrol ve ekleme-------------");
		
		GamerService gamerService=new GamerManager(new mernisServiceAdapter());
		gamerService.add(gamer1);
		gamerService.add(gamer2);
		gamerService.add(gamer3);
		
		System.out.println("----------Oyun Ekleme -------------");
		
		Game game1=new Game(1, "Pes 2021", "Spor", 50, 100);
		
		GameService gameService=new GameManager();
		gameService.add(game1);
		
		System.out.println("----------Kampanya Ekleme -------------");
		
		Campaign campaign1=new Campaign(1,"Kış Kampanyası",50);
		Campaign campaign2=new Campaign(2,"Yaz Kampanyası",30);
		
		CampaignService campaignService=new CampaignManager();
		campaignService.add(campaign1);
		campaignService.add(campaign2);
		
		
		
		
		System.out.println("----------Satış İşlemleri -------------");
		
		Sales sales1=new Sales(1, game1, gamer3, campaign2);
		Sales sales2=new Sales(2, game1, gamer1, campaign1);
		
		
		SalesService salesService=new SalesManager();
		salesService.add(sales1);
		salesService.add(sales2);
		
		
		System.out.println("----------Oyun Zamanı -------------");
		
		GamePlayedService gamePlayedService1=new GamePlayedManager(new CalculateGameManager());
		GamePlayedService gamePlayedService2=new GamePlayedManager(new CalculateGameManager());
		GamePlayedService gamePlayedService3=new GamePlayedManager(new CalculateGameManager());
		
		gamePlayedService1.play(gamer3, game1);
		gamePlayedService2.play(gamer1, game1);
		gamePlayedService3.play(gamer2, game1);
		
		
		
		
		
		
			
			
		
		

	}

}
