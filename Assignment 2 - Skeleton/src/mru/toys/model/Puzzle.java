package mru.toys.model;

public class Puzzle extends Toys {
	
	public char puzzleTypeChar;
	public String puzzleTypeFull;
	
	/**
	 * Retrieving variables from Toys superclass and instantiating the local variables 
	 * @param serialNumber the puzzle's serial number 
	 * @param name the puzzle's name
	 * @param brand the puzzle's brand
	 * @param price the puzzle's cost
	 * @param availableCount the puzzle's available count in stock 
	 * @param ageAppropriate the puzzle's appropriate age 
	 * @param puzzleType the puzzle's type 
	 */
	

	public Puzzle(String serialNumber, String name, String brand, double price, int availableCount, int ageAppropriate, char puzzleType) {
		super(serialNumber, name, brand, price, availableCount, ageAppropriate);
		this.puzzleTypeChar = puzzleType;
	}
	
	/** 
	 * @return the puzzle's type as a character 
	 */
	
	public char getPuzzleType() {
		return puzzleTypeChar;
	}
	
	/**
	 * @return the puzzle's characteristics as a string 
	 * overrides the same method in the Toys superclass
	 */
	@Override
	public String format() {
		return serialNumber + ";" + name + ";" + brand + ";" + price + ";" + availableCount + ";" + ageAppropriate + ";" + puzzleTypeChar;
	}
	
	/**
	 * takes in the char puzzle type and determine's the name in full form 
	 * @return the puzzle's characteristics as a string 
	 * overrides the same method in the Toys superclass
	 */
	@Override
	public String toString() {
		
		switch (puzzleTypeChar) {
		
		case 'M':
		case 'm':
			puzzleTypeFull = "Mechanic";
			break;
			
		case 'C':
		case 'c':
			puzzleTypeFull = "Cryptic";
			break;
			
		case 'L':
		case 'l':
			puzzleTypeFull = "Logic";
			break;
			
		case 'T':
		case 't':
			puzzleTypeFull = "Trivia";
			break;
	
		case 'R':
		case 'r':
			puzzleTypeFull = "Riddle";
			break;	
			
		}
		
		return "Category: Puzzle," + "Serial Number: " + serialNumber + ", " + "Name: " + name + ", " + "Brand: " + brand + ", "+ "Price: " + price + ", " + "Available Count: " + availableCount + ", " + "Age Appropriate: " + ageAppropriate + ", " + "Puzzle Type: " + puzzleTypeFull;
	}

}
