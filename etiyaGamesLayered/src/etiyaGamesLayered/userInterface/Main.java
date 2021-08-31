package etiyaGamesLayered.userInterface;

import java.time.LocalDate;

import etiyaGamesLayered.business.abstracts.GamePlayedService;
import etiyaGamesLayered.business.concretes.CampaingManager;
import etiyaGamesLayered.business.concretes.GameManager;
import etiyaGamesLayered.business.concretes.GamePlayedManager;
import etiyaGamesLayered.business.concretes.GamerManager;
import etiyaGamesLayered.business.concretes.KidsCalculateGameManager;
import etiyaGamesLayered.business.concretes.ManCalculateGameManager;
import etiyaGamesLayered.business.concretes.OldCalculateGameManager;
import etiyaGamesLayered.business.concretes.SalesManager;
import etiyaGamesLayered.core.MernisServiceAdapter;
import etiyaGamesLayered.dataAccess.concretes.hibernate.HibernateCampaignDao;
import etiyaGamesLayered.dataAccess.concretes.hibernate.HibernateGameDao;
import etiyaGamesLayered.dataAccess.concretes.hibernate.HibernateGamerDao;
import etiyaGamesLayered.dataAccess.concretes.hibernate.HibernateSalesDao;
import etiyaGamesLayered.entities.concretes.Campaign;
import etiyaGamesLayered.entities.concretes.Game;
import etiyaGamesLayered.entities.concretes.Gamer;
import etiyaGamesLayered.entities.concretes.Sales;



public class Main {

	public static void main(String[] args) {
		

		Gamer gamer1=new Gamer(1, "Özkan", "Demircan", "7856215625",LocalDate.of(1920, 9, 18),"Erkek");
		Gamer gamer2=new Gamer(2, "Murat", "Demircan", "7856215625",LocalDate.of(1996, 9, 18),"Erkek");
		Gamer gamer3=new Gamer(3, "Ensar", "Demircan", "7856215625",LocalDate.of(2010, 9, 18),"Erkek");
		
        System.out.println("----------Kullanıcı kontrol ve ekleme-------------");
		
		GamerManager gamerManager=new GamerManager(new MernisServiceAdapter(),new HibernateGamerDao());
		gamerManager.add(gamer1);
		gamerManager.add(gamer2);
		gamerManager.add(gamer3);
		
		
          System.out.println("----------Oyun Ekleme -------------");
		
		Game game1=new Game(1, "Pes 2021", "Spor", 50, 100);
		Game game2=new Game(2, "CS:GO", "Aksiyon", 80, 50);
		
		GameManager gameManager=new GameManager(new HibernateGameDao());
		gameManager.add(game1);
		gameManager.add(game2);
		
		System.out.println("----------Kampanya Ekleme -------------");
		
		Campaign campaign1=new Campaign(1,"Kış Kampanyası",50);
		Campaign campaign2=new Campaign(2,"Yaz Kampanyası",30);
		
		CampaingManager campaingManager=new CampaingManager(new HibernateCampaignDao());
		campaingManager.add(campaign1);
		campaingManager.add(campaign2);
		
		
		
		
		System.out.println("----------Satış İşlemleri -------------");
		
		Sales sales1=new Sales(1, game1, gamer3, campaign2);
		Sales sales2=new Sales(2, game1, gamer1, campaign1);
		
		
		SalesManager salesManager=new SalesManager(new HibernateSalesDao());
		salesManager.add(sales1);
		salesManager.add(sales2);
		
		
		System.out.println("----------Oyun Zamanı -------------");
		
		GamePlayedService gamePlayedService1=new GamePlayedManager(new OldCalculateGameManager());
		GamePlayedService gamePlayedService2=new GamePlayedManager(new ManCalculateGameManager());
		GamePlayedService gamePlayedService3=new GamePlayedManager(new KidsCalculateGameManager());
		
		gamePlayedService1.play(gamer1, game2);
		gamePlayedService2.play(gamer2, game1);
		gamePlayedService3.play(gamer3, game2);
		

	}
		
		

	}


