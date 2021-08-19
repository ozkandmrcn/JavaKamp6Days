import java.util.ArrayList;

public class GameCategoryService {
	
	ArrayList <GameCategory> gameCategories=new ArrayList<GameCategory>();
	
	public void add(GameCategory gameCategory)
	{
	   gameCategories.add(gameCategory);
	}
	
	
	public ArrayList <GameCategory> getAllCategory()
	{
		Game g1=new Game(1,"Pes 2021",150);
		Game g2 = new Game(2,"GTA 5",100);
		
		ArrayList<Game> games = new ArrayList<Game>();
		games.add(g1);
		games.add(g2);
		
		
		GameCategory gameCategory1=new GameCategory(1,"Aksiyon");
		gameCategory1.setGames(games);
		
		GameCategory gameCategory2=new GameCategory(2,"Spor");
		gameCategory2.setGames(games);
		
		
		gameCategories.add(gameCategory1);
		gameCategories.add(gameCategory2);
		
		return this.gameCategories;
		
		
		
	}
	

}
