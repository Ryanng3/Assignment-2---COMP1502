package mru.toys.model;

public class Animals extends Toys {
	
	//Declaring Fields
	private String materialType;
	private char size;
	private String animalSize;
	
	//Constructor for the class animal
	//Inherits characteristics from superclass Animals
	public Animals(Long serialNumber, String name, String brand, double price, int availableCount, int ageAppropriate, String materialType, char size) {
		super(serialNumber, name, brand, price, availableCount, ageAppropriate);
		// TODO Auto-generated constructor stub
		this.materialType = materialType;
		this.size = size;
	}
	
	/**
	 * 
	 * @return a String that represents the type of Material
	 */
	public String getMaterialType() {
		return materialType;
	}

	/**
	 * Sets the type of material to the materialType field and does not return anything
	 * @param materialType
	 */
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	
	/**
	 * Returns the size of the animal as a char
	 * @return size of animal as a char
	 */
	public char getSize() {
		return size;
	}

	/**
	 * Sets the size of the animal to the size field and does not return anything
	 * @param size
	 */
	public void setSize(char size) {
		this.size = size;
	}
	
	/**
	 * Overrides the Toys class and returns the characteristics of the Animal as a string
	 */
	@Override
	public String toString() {
		if(size == 'S') {
			animalSize = "Small";		//Determines the size of the animal based on the char
		}else if (size == 'M') {
			animalSize = "Medium";
		}else if (size == 'L') {
			animalSize = "Large";
		}
		return "Category: Animals" +  ", Serial Number: " + serialNumber + ", Name: " + name + ", Brand: " + brand + ", Price: " + price + ", Available Count: " 
				+ availableCount + ", Age-Appropriate: " + ageAppropriate + ", Material: " + materialType + ", Size: " + animalSize;
	}
	
	/**
	 * Overrides the Toys class returns the proper format of the toy as a string.
	 */
	@Override
	public String format() {
		return serialNumber + ";" + name + ";" + brand + ";" + price + ";" + availableCount + ";" + ageAppropriate + ";" + materialType + ";" + size;
	}
	
	

}
