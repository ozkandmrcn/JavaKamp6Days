
public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("--------------Kategoriye göre gösterimi-----------------");
		
		GameCategoryService gameCategoryService=new GameCategoryService();
		
		for(GameCategory gameCategory:gameCategoryService.getAllCategory())
		{
			System.out.println(gameCategory);
		}
		
		
		System.out.println("-----------------Oyunlar------------------------------");
		
		GameService gameService=new GameService();
		
		for(Game game:gameService.getAllGames())
		{
			System.out.println(game);
		}
		
		
		
		System.out.println("------------------User-----------------------------------");
		
		UserService userService=new UserService();
		
		for(User user:userService.getAllUsers())
		{
			System.out.println(user);
		}

	}

}
