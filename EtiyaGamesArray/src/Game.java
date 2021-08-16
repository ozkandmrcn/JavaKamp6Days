
public class Game {
	
	private String gameName;
	private double price;
	private String gameType;
	
	
	public Game() {
		
		super();
	}


	public Game(String gameName, double price, String gameType) {
		super();
		this.gameName = gameName;
		this.price = price;
		this.gameType = gameType;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getGameType() {
		return gameType;
	}


	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

}
