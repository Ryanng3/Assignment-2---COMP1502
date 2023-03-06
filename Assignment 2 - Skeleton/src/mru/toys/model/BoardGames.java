package mru.toys.model;

public class BoardGames extends Toys {
	
	public int minPlayers;
	public int maxPlayers;
	public String[] designers;
	
	
	public BoardGames(Long serialNumber, String name, String brand, double price, int availableCount,
			int ageAppropriate, int minPlayers, int maxPlayers, String designers) {
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
	
	public String[] getDesigners() {
		return designers;
	}
	
	

	
	
}
