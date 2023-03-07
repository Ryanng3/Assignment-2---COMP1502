package mru.toys.model;

public class Puzzle extends Toys {
	
	public char puzzleTypeChar;
	public String puzzleTypeFull;
	

	public Puzzle(Long serialNumber, String name, String brand, double price, int availableCount, int ageAppropriate, char puzzleType) {
		super(serialNumber, name, brand, price, availableCount, ageAppropriate);
		this.puzzleTypeChar = puzzleType;
	}
	
	public char getPuzzleType() {
		return puzzleTypeChar;
	}
	
	public String format() {
		return serialNumber + "," + name + "," + brand + "," + price + "," + availableCount + "," + ageAppropriate + "," + puzzleTypeChar;
	}
	
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
		
		return "Category: Puzzle," + "Serial Number: " + serialNumber + "," + "Name: " + name + "," + "Brand: " + brand + ","+ "Price: " + price + "," + "Available Count: " + availableCount + "," + "Age Appropriate: " + ageAppropriate + "," + "Puzzle Type: " + puzzleTypeFull;
	}

}
