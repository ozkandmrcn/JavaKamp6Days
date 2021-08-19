import java.util.ArrayList;

public class GameService {
	
	 ArrayList<Game> games=new ArrayList<Game>();
	 
	 public void add(Game game)
		{
			System.out.println("Eklendi");
			
			games.add(game);
		}
		
		public ArrayList<Game> getAllGames()
		{
			
			Game g1=new Game(1,"Pes 2021",150);
			Game g2 = new Game(2,"GTA 5",100);
			
			this.games.add(g1);
			this.games.add(g2);
		
			
			return games;
		}

}
