package Concrete;

import Abstract.SalesService;
import Entity.Discount;
import Entity.Game;
import Entity.User;

public class SalesManager implements SalesService {
	
	
	private double discountPercent;
	private double gamePrice;

	@Override
	public void sale(Game[] games, User user, Discount discount) {
		
		for(Game game :games)
		{
			discountPercent=discount.getDiscountPercent();
			gamePrice=game.getGamePrice();
			gamePrice=gamePrice-(gamePrice*discountPercent/100);
			
			System.out.println(game.getGameName() + "oyunu " + discount.getInfo() + "uygulanarak " + user.getFirstName() + 
					
					"tarafından" + gamePrice + "TL'ye alınmıştır.");
		}
		
	}

	@Override
	public void addToList(Game[] games, User user) {
		
		for (Game game:games)
		{
			System.out.println(game.getGameName() + "Alışveriş sepetine" + game.getGamePrice() + "TL'ye eklenmistir.");
		}
		
	}

}
