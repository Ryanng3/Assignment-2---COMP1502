package mru.toys.model;

import mru.toys.exceptions.MinPlayersException;

public class BoardGames extends Toys {
	
	public int minPlayers;
	public int maxPlayers;
	public String[] designers;
	public String numOfPlayers;
	
	/**
	 * Retrieving variables from Toys superclass and instantiating the local variables 
	 * @param serialNumber the Board games's serial number 
	 * @param name the Board games's name
	 * @param brand the Board games's brand
	 * @param price the Board games' cost 
	 * @param availableCount the Board games's count in stock
	 * @param ageAppropriate the Board games's appropriate age 
	 * @param numOfPlayers the Board games's range of players 
	 * @param designers the Board games's designers 
	 */
	
	public BoardGames(Long serialNumber, String name, String brand, double price, int availableCount,
			int ageAppropriate, String numOfPlayers, String designers) {
		super(serialNumber, name, brand, price, availableCount, ageAppropriate);
		
		this.numOfPlayers = numOfPlayers;
		this.designers = designers.split(",");
	}
	
	/**
	 * @return minPlayers the minimum number of players 
	 */
	
	public int getMinPlayers() {
		return minPlayers;
	}
	
	/**
	 * @return maxPlayers the maximum number of players 
	 */
	
	public int getMaxPlayers() {
		return maxPlayers;
	}
	
	/**
	 * Instantiating the local variables and throws an exception if the 
	 * minimum number of players is greater than the number of maximum number of players
	 * @param minPlayers the min players of the game 
	 * @param maxPlayers the max players of the game 
	 */
	
	public void setNumOfPlayers(int minPlayers, int maxPlayers) throws MinPlayersException {
		
		if (minPlayers > maxPlayers) {
			throw new MinPlayersException("Error: Minimum number of Players cannot "
					+ "be greater than maximum number of players");
		}
		
		this.minPlayers = minPlayers;
		this.maxPlayers = maxPlayers;
	}
	
	/**
	 * @return the min players and max players as a string 
	 */
	
	public String getNumofPlayers() {
		return minPlayers + " - " + maxPlayers;
	}
	
	/**
	 * @return the list of designers of the board game
	 */
	
	public String[] getDesigners() {
		return designers;
	}
	
	/**
	 * Instantiating the designers variable 
	 * @param designers the list of designers 
	 */

	public void setDesigners(String[] designers) {
		this.designers = designers;
	}
	
	/**
	 * @return the figures's characteristics as a string 
	 * overrides the same method in the Toys superclass
	 */
	@Override
	public String format() {
		return serialNumber + ", " + name + ", " + brand + ", " + price + ", " + availableCount + ", " + ageAppropriate + ", " + numOfPlayers + ", "  + designers;
	}
	
	/**
	 * @return the figure's characteristics as a string 
	 * overrides the same method in the Toys superclass
	 */
	@Override
	public String toString() {
		return "Category: Board Game, " + "Serial Number: " + serialNumber + ", " + "Name: " + name + ", " + "Brand: " + brand + ", "+ "Price: " + price + ", " + "Available Count: " + availableCount + ", " + "Age Appropriate: " + ageAppropriate + ", " + "Number of Players: " + numOfPlayers + ", " + "Designers: " + designers;
	}
	
	
	

	
	
}
