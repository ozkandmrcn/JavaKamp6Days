package entities;

public class Sales {
	private int id;
	private Game game;
	private Gamer gamer;
	private Campaign campaign;
	private double CampaignPrice;
	
	public Sales() {
		super();
	}
	public Sales(int id, Game game, Gamer gamer, Campaign campaign) {
		super();
		this.id = id;
		this.game = game;
		this.gamer = gamer;
		this.campaign = campaign;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Gamer getGamer() {
		return gamer;
	}
	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	public double getCampaignPrice() {
		double result;
		result = ( this.game.getUnitPrice() * this.campaign.getDiscountRate())/100;
		this.CampaignPrice = this.game.getUnitPrice() - result ;
		
		return this.CampaignPrice;
	}
}
