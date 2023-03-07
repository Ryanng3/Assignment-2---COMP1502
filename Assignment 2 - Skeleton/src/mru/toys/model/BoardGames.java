package mru.toys.model;

public class BoardGames extends Toys {
	
	public int minPlayers;
	public int maxPlayers;
	public String[] designers;
	public String numOfPlayers;
	
	public BoardGames(Long serialNumber, String name, String brand, double price, int availableCount,
			int ageAppropriate, int minPlayers, int maxPlayers, String designers, String numOfPlayers) {
		super(serialNumber, name, brand, price, availableCount, ageAppropriate);;
		this.minPlayers = minPlayers;
		this.maxPlayers = maxPlayers;
		this.designers = designers.split(",");
	}
	
	public int getMinPlayers() {
		return minPlayers;
	}
	
	public int getMaxPlayers() {
		return maxPlayers;
	}
	
	public void setNumOfPlayers(int minPlayers, int maxPlayers) {
		this.minPlayers = minPlayers;
		this.maxPlayers = maxPlayers;
	}
	
	public String getNumofPlayers() {
		return minPlayers + " , " + maxPlayers;
	}
	
	public String[] getDesigners() {
		return designers;
	}
	
	public String format() {
		return serialNumber + "," + name + "," + brand + "," + price + "," + availableCount + "," + ageAppropriate + "," + numOfPlayers + ","  + designers;
	}
	
	public String toString() {
		return "Category: Board Game, " + "Serial Number: " + serialNumber + "," + "Name: " + name + "," + "Brand: " + brand + ","+ "Price: " + price + "," + "Available Count: " + availableCount + "," + "Age Appropriate: " + ageAppropriate + "," + "Number of Players: " + numOfPlayers + "," + "Designers: " + designers;
	}
	
	
	

	
	
}
