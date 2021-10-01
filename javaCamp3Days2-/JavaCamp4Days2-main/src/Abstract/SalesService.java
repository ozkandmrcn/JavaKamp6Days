package Abstract;

import Entity.Discount;
import Entity.Game;
import Entity.User;

public interface SalesService {
	
	void sale(Game [] games, User user ,Discount discount);
	void addToList(Game [] games,User user);

}
