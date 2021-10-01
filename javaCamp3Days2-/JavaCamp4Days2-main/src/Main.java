import Adapter.MernisManagerAdapter;
import Concrete.DiscountManager;
import Concrete.GameManager;
import Concrete.SalesManager;
import Concrete.UserManager;
import Entity.Discount;
import Entity.Game;
import Entity.User;

public class Main {

	public static void main(String[] args) {
		
		
		UserManager userManager=new UserManager(new MernisManagerAdapter());
		
		User ozkan=new User(1,"özkan","demircan","507574521",1996);
		
		userManager.add(ozkan);
		
		
		System.out.println("-------------OYUNLAR-------------------");
		
		GameManager gameManager=new GameManager();
		
		Game game1=new Game (1,"Fifa",59.50);
		
		Game game2=new Game (2,"Pes 2021 ",78);
		
		gameManager.add(game1);
		
		System.out.println("----------------------------");
		
		Game [] games= {game1,game2};
		gameManager.addMultiple(games);
		
		
		

		System.out.println("-------------İNDİRİMLER-------------------");
		
		DiscountManager discountManager=new DiscountManager();
		
		Discount indirim1=new Discount(50,"Sezon indirimi");
		
		Discount indirim2=new Discount(90,"Büyük Kampanya  indirimi");
		
		discountManager.add(indirim1);
		discountManager.add(indirim2);
		discountManager.delete(indirim2);
		
		
		
		System.out.println("-------------SATIS-------------------");
		
		SalesManager salesManager=new SalesManager();
		salesManager.addToList(games, ozkan);
		
		System.out.println("----------------------------");
		
		salesManager.sale(games, ozkan, indirim2);
		
		
		
		
		
		
	}

}
