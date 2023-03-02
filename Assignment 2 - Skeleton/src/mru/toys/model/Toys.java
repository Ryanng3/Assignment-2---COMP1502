package mru.toys.model;

public abstract class Toys {
	private Long serialNumber;
	private String name;
	private String brand;
	private double price;
	private int availableCount;
	private int ageAppropriate;
	
	public Toys (Long serialNumber, String name, String brand, double price, int availableCount, int ageAppropriate) {
		this.serialNumber = serialNumber;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.availableCount = availableCount;
		this.ageAppropriate = ageAppropriate;
	}

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailableCount() {
		return availableCount;
	}

	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}

	public int getAgeAppropriate() {
		return ageAppropriate;
	}

	public void setAgeAppropriate(int ageAppropriate) {
		this.ageAppropriate = ageAppropriate;
	}
	
	public String toString() {
		return "Serial Number: " + serialNumber + ", Name: " + name + ", Brand: " + brand + ", Price: " + price + ", Available Count: " + availableCount + ", Age Appropriate: " + ageAppropriate;
	}
	
	public String format() {
		return serialNumber + ";" + name + ";" + brand + ";" + price + ";" + availableCount + ";" + ageAppropriate;
	}
	
}
