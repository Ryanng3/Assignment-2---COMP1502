package mru.toys.model;

public class Figures extends Toys {

	public char classification;
	public String classi;
	
	/**
	 * 
	 * @param serialNumber
	 * @param name
	 * @param brand
	 * @param price
	 * @param availableCount
	 * @param ageAppropriate
	 * @param classification
	 */
	
	public Figures(Long serialNumber, String name, String brand, double price, int availableCount, int ageAppropriate, char classification) {
		super(serialNumber, name, brand, price, availableCount, ageAppropriate);
		this.classification = classification;
	}
	
	/**
	 * 
	 */
	
	public char getClassification() {
		return classification;
	}
	
	/**
	 * 
	 */

	public String format() {
		return serialNumber + ", " + name + ", " + brand + ", " + price + ", " + availableCount + ", " + ageAppropriate + ", " + classification;
	}
	
	/**
	 * 
	 */
	
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
