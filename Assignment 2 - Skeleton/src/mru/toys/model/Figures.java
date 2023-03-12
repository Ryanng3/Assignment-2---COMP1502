package mru.toys.model;

public class Figures extends Toys {

	public char classification;
	public String classi;
	
	/**
	 * Retrieving variables from Toys superclass and instantiating the classi variable
	 * @param serialNumber the figures's serial number 
	 * @param name the figures's name
	 * @param brand the figures's brand
	 * @param price the figures's cost
	 * @param availableCount the figures's count in stock 
	 * @param ageAppropriate the figures's appropriate age to use 
	 * @param classification the figures's classification
	 */
	
	public Figures(Long serialNumber, String name, String brand, double price, int availableCount, int ageAppropriate, char classification) {
		super(serialNumber, name, brand, price, availableCount, ageAppropriate);
		this.classification = classification;
	}
	
	/**
	 * @return classification the figure's classification as a char
	 */
	
	public char getClassification() {
		return classification;
	}
	
	/**
	 * @return the figures's characteristics as a string
	 * overrides the same method in the Toys superclass
	 */
	@Override
	public String format() {
		return serialNumber + ", " + name + ", " + brand + ", " + price + ", " + availableCount + ", " + ageAppropriate + ", " + classification;
	}
	
	/**
	 * takes in the char classification and determine's the name in full form 
	 * @return the figure's characteristics as a string 
	 * overrides the same method in the Toys superclass
	 */
	@Override
	public String toString() {
		
		switch (classification) {
		
		case 'A':
		case 'a':
			classi = "Action";
			break;
			
		case 'D':
		case 'd':
			classi = "Doll";
			break;
			
		case 'L':
		case 'l':
			classi = "Historic";
			break;
		}
		
		return "Category: Figures," + "Serial Number: " + serialNumber + ", " + "Name: " + name + ", " + "Brand: " + brand + ", "+ "Price: " + price + ", " + "Available Count: " + availableCount + ", " + "Age Appropriate: " + ageAppropriate + ", " + "Classification: " + classi;
	}

	

}
