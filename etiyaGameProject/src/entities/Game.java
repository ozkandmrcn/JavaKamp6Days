package entities;

public class Game {
	private int id;
	private String name;
	private String type;
	private double unitPrice;
	private double gamePoint;
	
	public Game() {
		super();
	}
	public Game(int id, String name,String type, double unitPrice,double gamePoint) {
		super();
		this.id = id;
		this.name = name;
		this.type=type;
		this.unitPrice = unitPrice;
		this.gamePoint=gamePoint;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getGamePoint() {
		return gamePoint;
	}
	public void setGamePoint(double gamePoint) {
		this.gamePoint = gamePoint;
	}
	
	
}
