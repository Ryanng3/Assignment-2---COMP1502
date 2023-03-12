package mru.toys.view;

import java.util.Scanner;

public class AppMenu {
	
	Scanner scanner;
	String newToy;
	String serialNumber;
	String toyName;
	String toyType;
	char figureClassi;
	char animalSize;
	char puzzleType;
	int input;
	
	/**
	 * creating a instance of Scanner and assigning it to a variable
	 */
	
	public AppMenu() {
		scanner = new Scanner(System.in);
	}
	
	/**
	 * Void method that prints a welcome message 
	 */

	public void openingMsg() {
		System.out.println("*****************************************************\n"
						+  "*            WELCOME TO TOY STORE COMPANY           *\n"
						+  "*****************************************************\n");
	}
	
	/**
	 * Displaying the main menu for users and validating their input 
	 * @return the user's input as an int 
	 */
	
	public int showMainMenu() {
		
		System.out.println("How We May Help You?\n" 
						+  "(1)  Search Inventory and Purchase Toy\n"
						+  "(2)  Add New Toy\n"
						+  "(3)  Remove Toy\n"
						+  "(4)  Save & Exit\n"
						+  "Enter Option: \n");
		
		if (scanner.hasNextInt()) {
			this.input = scanner.nextInt();
			if (input > 4) {
				System.out.println("This is not a valid option! Try again.");
			} else{
				System.out.println("This is not an Integer number! Try again.);");
			}
		}
		return input;
	}
	
	/**
	 * Displaying the sub menu for users and validating their input 
	 * @return the user's input as an int
	 */
	
	public int showSubMenu() {
		
		System.out.println("Find Toys With:\n" 
						+  "(1)  Serial Number (SN) \n"
						+  "(2)  Toy Name\n"
						+  "(3)  Type\n"
						+  "(4)  Back to Main Menu\n"
						+  "Enter Option: \n");
		
		if (scanner.hasNextInt()) {
			this.input = scanner.nextInt();
			if (input > 4) {
				System.out.println("This is not a valid option! Try again.");
			} else{
				System.out.println("This is not an Integer number! Try again.);");
			}
		}
		return input;
	}
	
	/**
	 * Asking user for serial number of toy 
	 * @return the entered serial number as a string 
	 */
	
	public String searchSerialNumber() {
		System.out.println("Enter Serial Number: ");
		this.serialNumber = scanner.next();
		//validate
		return serialNumber;
	}
	
	/**
	 * Asking user for name of toy 
	 * @return the entered toy name as a string 
	 */
	
	public String searchToyName() {
		System.out.println("Enter Toy Name: ");
		this.toyName = scanner.next();
		//validate
		return toyName;
	}
	
	/**
	 * Asking user for type of toy 
	 * @return the entered type of toy as a string
	 */
	
	public String searchType() {
		System.out.println("Enter Toy Type: ");
		this.toyType = scanner.next();
		//validate
		return toyType;
	}
	
	/**
	 * Asking the user for the new toy's characteristics and assigning to individual variables 
	 * @return the new toy's characteristics all in one variable 
	 */
	
	public String addNewToy() {
		
		System.out.println("Enter Serial Number: ");
		String serialNumber = scanner.next();
		
		System.out.println("Enter Toy Name: ");
		String name = scanner.next();
		
		System.out.println("Enter Toy Brand: ");
		String brand = scanner.next();
		
		System.out.println("Enter Toy Price: ");
		String price = scanner.next();
		
		System.out.println("Enter Available Counts: ");
		String availableCount = scanner.next();
		
		System.out.println("Enter Appropriate Age: ");
		String appropriateAge = scanner.next();
		
		System.out.println("Enter Minimum Number of PLayers: ");
		String minPlayers = scanner.next();
		
		System.out.println("Enter Maximum Number of Players: ");
		String maxPlayers = scanner.next();
		
		System.out.println("Enter Designer Names (Use ',' to separate the names if there is more than one name): ");
		String designers = scanner.next();
		
		//validate
		newToy = serialNumber + ", " + name + ", " + brand + ", " + price + ", " + availableCount + ", " + appropriateAge + ", " + minPlayers + ", " + maxPlayers + ", " + designers;
		return newToy;
		
	}
	
	/**
	 * Asking user for the figure's classification
	 * @return the figure's classification as a char
	 */
	
	public char figureMenu() {
		System.out.println("Enter Figure Classification: \n" 
						+ "Action (A)\n" 
						+ "Doll (D)\n" 
						+ "Historic (H)\n");
		this.figureClassi = scanner.next().charAt(0);
		//validate
		return figureClassi;
	}
	
	/**
	 * Asking user for the animal's size 
	 * @return the animal's size as a char
	 */
	
	public char animalsMenu() {
		System.out.println("Enter Animal Size: " 
						+ "Small (S)" 
						+ "Medium (M)" 
						+ "Large (L)");
		this.animalSize = scanner.next().charAt(0);
		//validate
		return animalSize;
	}
	
	/**
	 * Asking user for the puzzle's type 
	 * @return the puzzle's type as a char
	 */

	public char puzzlesMenu() {
		System.out.println("Enter Puzzle-Type: " 
						+ "Mechanical (M)" 
						+ "Cryptic (C)" 
						+ "Logic (L)" 
						+ "Trivia (T)" 
						+ "Riddle (R)");
		 this.puzzleType = scanner.next().charAt(0);
		 //validate
		return puzzleType;
	}
	
	/**
	 * Void method that prints a closing message 
	 */
		
	public void closingMsg() {
		System.out.println("*****************************************************\n"
						+  "*                THANK YOU FOR VISITING             *\n"
						+  "*****************************************************\n");
	}
	
}
