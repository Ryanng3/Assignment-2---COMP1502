package mru.toys.model;

public abstract class Toys {	//This is a superclass
	public String serialNumber;
	public String name;
	public String brand;
	public double price;
	public int availableCount;
	public int ageAppropriate;
	
	//Constructor for the Toys Class
	public Toys (String serialNumber, String name, String brand, double price, int availableCount, int ageAppropriate) {
		this.serialNumber = serialNumber;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.availableCount = availableCount;
		this.ageAppropriate = ageAppropriate;
	}

	/**
	 * Takes the value in the serialNumber field and returns it
	 * @return a Long that represents the serial number of the toy
	 */
	public String getSerialNumber() {
		return serialNumber;
	}
	
	/**
	 * Takes the serial number of the toy and sets it to the serialNumber field
	 * @param serialNumber
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	/**
	 * Takes the value stored in the name field and returns it
	 * @return a String that represents the name of the toy
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Takes the name of the toy and sets it to the name field
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Takes the value of the brand field and returns it
	 * @return a String that represents the brand of the toy
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * Takes the brand of the toy and sets it to the brand field
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * Takes the value of the price field and returns it
	 * @return a double value that represents the price of the toy
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Takes the price of the toy and sets it to the price field
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Takes the value of the availableCount field and returns it
	 * @return an integer that represents the available count of the toy
	 */
	public int getAvailableCount() {
		return availableCount;
	}
	
	/**
	 * Takes the available count number of the toy and sets it to the availableCount field
	 * @param availableCount
	 */
	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}

	/**
	 * Takes the value of ageAppropriate and returns it
	 * @return an integer that represents the age appropriateness of the toy
	 */
	public int getAgeAppropriate() {
		return ageAppropriate;
	}
	
	/**
	 * Takes the appropriate age value and sets it to the ageAppropriate field
	 * @param ageAppropriate
	 */
	public void setAgeAppropriate(int ageAppropriate) {
		this.ageAppropriate = ageAppropriate;
	}
	
	/**
	 * Returns the characteristics of the toys as a string
	 */
	public String toString() {
		return "SN: " + serialNumber + ", Name: " + name + ", Brand: " + brand + ", Price: " + price + ", Available Count: " + availableCount + ", Age-Appropriate: " + ageAppropriate;
	}
	
	/**
	 * This method formats the basic characteristics of the toy
	 * @return a String that displays the basic characteristics of the toy
	 */
	public abstract String format();
	
}
