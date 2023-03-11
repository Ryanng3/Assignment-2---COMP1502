package mru.toys.model;

public class BoardGames extends Toys {
	
	public int minPlayers;
	public int maxPlayers;
	public String[] designers;
	public String numOfPlayers;
	
	/**
	 * 
	 * @param serialNumber
	 * @param name
	 * @param brand
	 * @param price
	 * @param availableCount
	 * @param ageAppropriate
	 * @param numOfPlayers
	 * @param designers
	 */
	
	public BoardGames(Long serialNumber, String name, String brand, double price, int availableCount,
			int ageAppropriate, String numOfPlayers, String designers) {
		super(serialNumber, name, brand, price, availableCount, ageAppropriate);
		this.numOfPlayers = numOfPlayers;
		this.designers = designers.split(",");
	}
	
	/**
	 * 
	 * @return
	 */
	
	public int getMinPlayers() {
		return minPlayers;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public int getMaxPlayers() {
		return maxPlayers;
	}
	
	/**
	 * 
	 * @param minPlayers
	 * @param maxPlayers
	 */
	
	public void setNumOfPlayers(int minPlayers, int maxPlayers) {
		this.minPlayers = minPlayers;
		this.maxPlayers = maxPlayers;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public String getNumofPlayers() {
		return minPlayers + " - " + maxPlayers;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public String[] getDesigners() {
		return designers;
	}
	
	/**
	 * 
	 * @param designers
	 */

	public void setDesigners(String[] designers) {
		this.designers = designers;
	}
	
	/**
	 * 
	 */

	public String format() {
		return serialNumber + ", " + name + ", " + brand + ", " + price + ", " + availableCount + ", " + ageAppropriate + ", " + numOfPlayers + ", "  + designers;
	}
	
	/**
	 * 
	 */
	
	public String toString() {
		return "Category: Board Game, " + "Serial Number: " + serialNumber + ", " + "Name: " + name + ", " + "Brand: " + brand + ", "+ "Price: " + price + ", " + "Available Count: " + availableCount + ", " + "Age Appropriate: " + ageAppropriate + ", " + "Number of Players: " + numOfPlayers + ", " + "Designers: " + designers;
	}
	
	
	

	
	
}
