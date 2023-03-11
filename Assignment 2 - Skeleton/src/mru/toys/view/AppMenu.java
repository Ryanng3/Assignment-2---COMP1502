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
	 * 
	 */
	
	public AppMenu() {
		scanner = new Scanner(System.in);
	}
	
	/**
	 * 
	 */

	public void openingMsg() {
		
		System.out.println("*****************************************************\n"
						+  "*            WELCOME TO TOY STORE COMPANY           *\n"
						+  "*****************************************************\n");
	}
	
	/**
	 * 
	 * @return
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
	 * 
	 * @return
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
	 * 
	 * @return
	 */
	
	public String searchSerialNumber() {
		System.out.println("Enter Serial Number: ");
		this.serialNumber = scanner.next();
		return serialNumber;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public String searchToyName() {
		System.out.println("Enter Toy Name: ");
		this.toyName = scanner.next();
		return toyName;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public String searchType() {
		System.out.println("Enter Toy Type: ");
		this.toyType = scanner.next();
		return toyType;
	}
	
	/**
	 * 
	 * @return
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
		
		newToy = serialNumber + ", " + name + ", " + brand + ", " + price + ", " + availableCount + ", " + appropriateAge + ", " + minPlayers + ", " + maxPlayers + ", " + designers;
	
		return newToy;
		
	}
	
	/**
	 * 
	 * @return
	 */
	
	public char figureMenu() {
		
		System.out.println("Enter Figure Classification: \n" 
						+ "Action (A)\n" 
						+ "Doll (D)\n" 
						+ "Historic (H)\n");
		
		this.figureClassi = scanner.next().charAt(0);
		
		return figureClassi;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public char animalsMenu() {
		
		System.out.println("Enter Animal Size: " 
						+ "Small (S)" 
						+ "Medium (M)" 
						+ "Large (L)");
		
		this.animalSize = scanner.next().charAt(0);
		
		return animalSize;
	}
	
	/**
	 * 
	 * @return
	 */

	public char puzzlesMenu() {
		
		System.out.println("Enter Puzzle-Type: " 
						+ "Mechanical (M)" 
						+ "Cryptic (C)" 
						+ "Logic (L)" 
						+ "Trivia (T)" 
						+ "Riddle (R)");
		
		 this.puzzleType = scanner.next().charAt(0);
		
		return puzzleType;
	}
	
	/**
	 * 
	 */
		
	public void closingMsg() {
		
		System.out.println("*****************************************************\n"
						+  "*                THANK YOU FOR VISITING             *\n"
						+  "*****************************************************\n");
	}
	
}
