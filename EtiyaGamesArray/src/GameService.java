import java.util.ArrayList;

public class GameService {
	
	ArrayList<Game> games=new ArrayList<Game>();
	
	
	public void add(Game game)
	{
		System.out.println("Oyun eklendi : " + game.getGameName());
		games.add(game);
	}
	
	public ArrayList<Game> getAllGame()
	{
		return games;
	}

}
