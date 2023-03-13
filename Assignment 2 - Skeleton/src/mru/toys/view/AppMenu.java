package mru.toys.view;

import java.util.Scanner;

public class AppMenu {
	
	Scanner scanner;
	String newToy;
	String serialNumber;
	String toyName;
	char toyType;
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
		
		System.out.println("\nHow We May Help You?\n" 
						+  "(1)  Search Inventory and Purchase Toy\n"
						+  "(2)  Add New Toy\n"
						+  "(3)  Remove Toy\n"
						+  "(4)  Save & Exit\n");
		System.out.print("Enter Option: ");
		
			input = scanner.nextInt();
			if (input != 1 && input!= 2 && input!= 3 && input!= 4) {
				System.out.print("This is not a valid option! Try again.");
				input = scanner.nextInt();
			} else if (!Integer.toString(input).equals("1") && !Integer.toString(input).equals("2") && !Integer.toString(input).equals("3") && !Integer.toString(input).equals("4")){
				System.out.print("This is not an Integer number! Try again.);");
				input = scanner.nextInt();
			}
		
		return input;
		
	}
	
	/**
	 * Displaying the sub menu for users and validating their input 
	 * @return the user's input as an int
	 */
	
	public int showSubMenu() {
		
		System.out.println("\nFind Toys With:\n" 
						+  "(1)  Serial Number (SN) \n"
						+  "(2)  Toy Name\n"
						+  "(3)  Type\n"
						+  "(4)  Back to Main Menu\n");
		System.out.print("Enter Option: ");
						
		
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
		System.out.println("\nEnter Serial Number: ");
		this.serialNumber = scanner.next();
		//validate
		return serialNumber;
	}
	
	/**
	 * Asking user for name of toy 
	 * @return the entered toy name as a string 
	 */
	
	public String searchToyName() {
		System.out.print("\nEnter Toy Name: ");
		this.toyName = scanner.next();
		//validate
		return toyName;
	}
	
	/**
	 * Asking user for type of toy 
	 * @return the entered type of toy as a string
	 */
	
	public char searchType() {
		System.out.println("\nEnter Toy Type:\n"
						+  "(F) Figures"
						+  "(A) Animals"
						+  "(P) Puzzles"
						+  "(B) BoardGames");
		System.out.print("\nEnter Option: ");
		this.toyType = scanner.next().toUpperCase().charAt(0);
		//validate
		return toyType;
	}
	
	public char searchFigure() {
		System.out.println("\nEnter Figure type:\n");
		System.out.println("(A) Action");
		System.out.println("(D) Doll");
		System.out.println("(H) Historic");
		char option = scanner.next().toUpperCase().charAt(0);
		
		while(option != 'A' && option != 'D' && option != 'H') {
			System.out.print("Invalid Option. Enter option here: ");
			option = scanner.next().toUpperCase().charAt(0);
		}
		return option;
	}
	
	public char searchAnimal() {
		System.out.println("\nEnter Animal Size:\n");
		System.out.println("(S) Small");
		System.out.println("(M) Medium");
		System.out.println("(L) Large");
		System.out.print("\nEnter option: ");
		char option = scanner.next().toUpperCase().charAt(0);
		
		while(option != 'S' && option != 'M' && option != 'L') {
			System.out.print("Invalid Option. Enter option here: ");
			option = scanner.next().toUpperCase().charAt(0);
		}
		return option;
	}
	
	public char searchPuzzle() {
		System.out.println("\nEnter Puzzle Type:\n");
		System.out.println("(M) Mechanical");
		System.out.println("(C) Cryptic");
		System.out.println("(L) Logic");
		System.out.println("(T) Trivia");
		System.out.println("(R) Riddle");
		char option = scanner.next().toUpperCase().charAt(0);
		
		while(option != 'M' && option != 'C' && option != 'L' && option != 'T' && option != 'R') {
			System.out.print("Invalid Option. Enter option here: ");
			option = scanner.next().toUpperCase().charAt(0);
		}
		return option;
	}
	
	public String searchBoardGame() {
		System.out.println("\nEnter minimum players: ");
		int min = scanner.nextInt();
		System.out.println("\nEnter maximum players: ");
		int max = scanner.nextInt();
		
		String numOfPlayers = min + "-" + max;
		return numOfPlayers;
	}
	/**
	 * Asking the user for the new toy's characteristics and assigning to individual variables 
	 * @return the new toy's characteristics all in one variable 
	 */
	
	public String addNewToy() {
		
		System.out.print("Enter Serial Number: ");
		String serialNumber = scanner.next();
		
		System.out.print("Enter Toy Name: ");
		String name = scanner.next();
		
		System.out.print("Enter Toy Brand: ");
		String brand = scanner.next();
		
		System.out.print("Enter Toy Price: ");
		String price = scanner.next();
		
		System.out.print("Enter Available Counts: ");
		String availableCount = scanner.next();
		
		System.out.print("Enter Appropriate Age: ");
		String appropriateAge = scanner.next();
		
		System.out.print("Enter Minimum Number of PLayers: ");
		String minPlayers = scanner.next();
		
		System.out.print("Enter Maximum Number of Players: ");
		String maxPlayers = scanner.next();
		
		System.out.print("Enter Designer Names (Use ',' to separate the names if there is more than one name): ");
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
		System.out.println("\nEnter Figure Classification: \n" 
						+ "Action (A)\n" 
						+ "Doll (D)\n" 
						+ "Historic (H)\n");
		System.out.print("Enter Option: ");
		this.figureClassi = scanner.next().toUpperCase().charAt(0);
		//validate
		return figureClassi;
	}
	
	/**
	 * Asking user for the animal's size 
	 * @return the animal's size as a char
	 */
	
	public char animalsMenu() {
		System.out.println("\nEnter Animal Size:\n" 
						+ "Small (S)\n" 
						+ "Medium (M)\n" 
						+ "Large (L)\n");
		System.out.print("Enter Option: ");

		this.animalSize = scanner.next().toUpperCase().charAt(0);
		//validate
		return animalSize;
	}
	
	/**
	 * Asking user for the puzzle's type 
	 * @return the puzzle's type as a char
	 */

	public char puzzlesMenu() {
		System.out.println("\nEnter Puzzle-Type:\n " 
						+ "Mechanical (M)\n" 
						+ "Cryptic (C)\n" 
						+ "Logic (L)\n" 
						+ "Trivia (T)\n" 
						+ "Riddle (R)\n");
		System.out.print("Enter Option: ");
		 this.puzzleType = scanner.next().toUpperCase().charAt(0);
		 //validate
		return puzzleType;
	}
	
	/**
	 * Asking user for to purchase the toy
	 * @return
	 */
	public char purchaseToy() {
		System.out.print("\nWould you like to purchase this toy? ");
		char choice = scanner.next().toUpperCase().charAt(0);
		return choice;
	}
	
	/**
	 * Prompts user which toy to purchase
	 * @return
	 */
	public int whichToy() {
		System.out.print("\nWhich Toy would you like to purchase? ");
		int choice = scanner.nextInt();
		return choice;
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
