

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-------Kullanıcılar---------");
			
			UserService userService=new UserService();
			
			User user1=new User("Özkan","Demircan",18);
			User user2=new User("Murat","Demircan",17);
			
			userService.add(user1);
			userService.add(user2);
			
			System.out.println("-------Kullanıcı Listesi---------");
			
			for(User users:userService.getAllUsers())
			{
				System.out.println(users.getFirstName()+" "+ users.getLastName());
				
				
			}
			
			System.out.println("-------Oyunlar---------");
			
			GameService gameService=new GameService();
			
			Game game1=new Game("Pes 2021",150,"Spor");
			Game game2=new Game("Gta 5",750,"Aksiyon");
			
			gameService.add(game1);
			gameService.add(game2);
			
			
			System.out.println("-------Oyun Listesi---------");
			
			for(Game games:gameService.getAllGame())
			{
				System.out.println(games.getGameName() + "----" + games.getPrice());
			}
			
	      
			

	}

}
