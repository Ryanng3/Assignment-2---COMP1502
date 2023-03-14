package mru.toys.view;

import java.util.Scanner;

public class AppMenu {
	
	Scanner scanner;
	
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
		
			int input = scanner.nextInt();
			if (input != 1 && input!= 2 && input!= 3 && input!= 4) {
				System.out.print("This is not a valid option! Try again.");
				input = scanner.nextInt();
			} else if (!Integer.toString(input).equals("1") && !Integer.toString(input).equals("2") && !Integer.toString(input).equals("3") && !Integer.toString(input).equals("4")){
				System.out.print("This is not an Integer number! Try again.");
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
						
		int input = scanner.nextInt();
			if (input > 4) {
				System.out.print("This is not a valid option! Try again.");
			} else if (!Integer.toString(input).equals("1") && !Integer.toString(input).equals("2") && !Integer.toString(input).equals("3") && !Integer.toString(input).equals("4")){
				System.out.print("This is not an Integer number! Try again.);");
			}
		return input;
	}
	
	/**
	 * Asking user for serial number of toy 
	 * @return the entered serial number as a string 
	 */
	
	public String searchSerialNumber() {
		System.out.print("\nEnter Serial Number: ");
		String serialNumber = scanner.next();
		//validate
		return serialNumber;
	}
	
	/**
	 * Asking user for name of toy 
	 * @return the entered toy name as a string 
	 */
	
	public String searchToyName() {
		System.out.print("\nEnter Toy Name: ");
		String toyName = scanner.next();
		//validate
		return toyName;
	}
	
	/**
	 * Asking user for type of toy 
	 * @return the entered type of toy as a string
	 */
	
	public char searchType() {
		System.out.println("\nEnter Toy Type:\n"
						+  "(F) Figures\n"
						+  "(A) Animals\n"
						+  "(P) Puzzles\n"
						+  "(B) BoardGames");
		System.out.print("\nEnter Option: ");
		char toyType = scanner.next().toUpperCase().charAt(0);
		//validate
		return toyType;
	}
	
	public char searchFigure() {
		System.out.println("\nEnter Figure type:\n"
						+  "(A) Action\n"
						+  "(D) Doll\n"
						+  "(H) Historic\n");
		System.out.print("Enter Option: ");
		char option = scanner.next().toUpperCase().charAt(0);
		
		while(option != 'A' && option != 'D' && option != 'H') {
			System.out.print("This is not a valid option! Try again.");
			option = scanner.next().toUpperCase().charAt(0);
		}
		return option;
	}
	
	public char searchAnimal() {
		System.out.println("\nEnter Animal Size:\n"
						+  "(S) Small\n"
						+  "(M) Medium\n"
						+  "(L) Large");
		System.out.print("\nEnter option: ");
		char option = scanner.next().toUpperCase().charAt(0);
		
		while(option != 'S' && option != 'M' && option != 'L') {
			System.out.print("This is not a valid option! Try again.");
			option = scanner.next().toUpperCase().charAt(0);
		}
		return option;
	}
	
	public char searchPuzzle() {
		System.out.println("\nEnter Puzzle Type:\n"
						+  "(M) Mechanical\n"
						+  "(C) Cryptic\n"
						+  "(L) Logic\n"
						+  "(T) Trivia\n"
						+  "(R) Riddle");
		System.out.print("Enter Option: ");
		char option = scanner.next().toUpperCase().charAt(0);
		
		while(option != 'M' && option != 'C' && option != 'L' && option != 'T' && option != 'R') {
			System.out.print("This is not a valid option! Try again.");
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
	
	public char addNewToy() {
		System.out.println("\nWhich type of toy are you adding?\n"
						+  "(F) Figure\n"
						+  "(A) Animal\n"
						+  "(P) Puzzle\n"
						+  "(B) Board Game");
		System.out.print("\nEnter option: ");
		char option = scanner.next().toUpperCase().charAt(0);
		return option;
		
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
		char figureClassi = scanner.next().toUpperCase().charAt(0);
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

		char animalSize = scanner.next().toUpperCase().charAt(0);
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
		 char puzzleType = scanner.next().toUpperCase().charAt(0);
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
	
	public String addNewFigure() {
		System.out.print("\nEnter Serial Number: ");
		long serialNumber = scanner.nextLong();
		while ((String.valueOf(serialNumber).length() != 10) && (String.valueOf(serialNumber).charAt(0) != 0 || String.valueOf(serialNumber).charAt(0) != 1)) {
			System.out.println("\nPlease enter 10 digit number starting with 0 or 1 !");
			System.out.print("\nEnter Serial Number: ");
			serialNumber = scanner.nextLong();
		}
		System.out.print("\nEnter Toy Name: ");
		String toyName = scanner.next();
		System.out.print("\nEnter Toy Brand: ");
		String toyBrand = scanner.next();
		System.out.print("\nEnter Toy Price: ");
		double toyPrice = scanner.nextDouble();
		System.out.print("\nEnter Available Counts: ");
		int availableCounts = scanner.nextInt();
		System.out.print("\nEnter Appropriate Age: ");
		int appropraiteAge = scanner.nextInt();
		System.out.print("\nEnter Classification: ");
		char classification = scanner.next().toUpperCase().charAt(0);
		
		String newToy = serialNumber + ";" + toyName + ";" + toyBrand + ";" + toyPrice + ";" + availableCounts + ";" + appropraiteAge + ";" + classification;
		
		return newToy;
	}
	
	public String addNewAnimal() {
		System.out.print("\nEnter Serial Number: ");
		long serialNumber = scanner.nextLong();
		while ((String.valueOf(serialNumber).length() != 10) && (String.valueOf(serialNumber).charAt(0) != 2 || String.valueOf(serialNumber).charAt(0) != 3)) {
			System.out.println("\nPlease enter 10 digit number starting with 0 or 1 !");
			System.out.print("\nEnter Serial Number: ");
			serialNumber = scanner.nextLong();
		}
		System.out.print("\nEnter Toy Name: ");
		String toyName = scanner.next();
		System.out.print("\nEnter Toy Brand: ");
		String toyBrand = scanner.next();
		System.out.print("\nEnter Toy Price: ");
		double toyPrice = scanner.nextDouble();
		System.out.print("\nEnter Available Counts: ");
		int availableCounts = scanner.nextInt();
		System.out.print("\nEnter Appropriate Age: ");
		int appropraiteAge = scanner.nextInt();
		System.out.print("\nEnter type of Material: ");
		String material = scanner.next();
		System.out.print("\nEnter size of Animal: ");
		char size = scanner.next().toUpperCase().charAt(0);
		String newToy = serialNumber + ";" + toyName + ";" + toyBrand + ";" + toyPrice + ";" + availableCounts + ";" + appropraiteAge + ";" + material + ";" + size;
		
		return newToy;
	}
	
	public String addNewPuzzle() {
		System.out.print("\nEnter Serial Number: ");
		long serialNumber = scanner.nextLong();
		while ((String.valueOf(serialNumber).length() != 10) && (String.valueOf(serialNumber).charAt(0) != 4 || String.valueOf(serialNumber).charAt(0) != 5 || String.valueOf(serialNumber).charAt(0) != 6) ) {
			System.out.println("\nPlease enter 10 digit number starting with 0 or 1 !");
			System.out.print("\nEnter Serial Number: ");
			serialNumber = scanner.nextLong();
		}
		System.out.print("\nEnter Toy Name: ");
		String toyName = scanner.next();
		System.out.print("\nEnter Toy Brand: ");
		String toyBrand = scanner.next();
		System.out.print("\nEnter Toy Price: ");
		double toyPrice = scanner.nextDouble();
		System.out.print("\nEnter Available Counts: ");
		int availableCounts = scanner.nextInt();
		System.out.print("\nEnter Appropriate Age: ");
		int appropraiteAge = scanner.nextInt();
		System.out.print("\nEnter Puzzle type: ");
		char type = scanner.next().toUpperCase().charAt(0);
		
		String newToy = serialNumber + ";" + toyName + ";" + toyBrand + ";" + toyPrice + ";" + availableCounts + ";" + appropraiteAge + ";" + type;
		
		return newToy;
	}
	
	public String addNewBoardGame() {
		System.out.print("\nEnter Serial Number: ");
		long serialNumber = scanner.nextLong();
		while ((String.valueOf(serialNumber).length() != 10) && (String.valueOf(serialNumber).charAt(0) != 7 || String.valueOf(serialNumber).charAt(0) != 8 || String.valueOf(serialNumber).charAt(0) != 9) ) {
			System.out.println("\nPlease enter 10 digit number starting with 0 or 1 !");
			System.out.print("\nEnter Serial Number: ");
			serialNumber = scanner.nextLong();
		}
		System.out.print("\nEnter Toy Name: ");
		String toyName = scanner.next();
		System.out.print("\nEnter Toy Brand: ");
		String toyBrand = scanner.next();
		System.out.print("\nEnter Toy Price: ");
		double toyPrice = scanner.nextDouble();
		System.out.print("\nEnter Available Counts: ");
		int availableCounts = scanner.nextInt();
		System.out.print("\nEnter Appropriate Age: ");
		int appropraiteAge = scanner.nextInt();
		System.out.print("\nEnter Minimum Number of Players: ");
		int minPlayers = scanner.nextInt();
		System.out.print("\nEnter Maximum Number of Players: ");
		int maxPlayers = scanner.nextInt();
		System.out.print("\nEnter Designer Names (Use ',' to seperate the name if there is more than one name): " );
		String designer = scanner.next();
		
		String newToy = serialNumber + ";" + toyName + ";" + toyBrand + ";" + toyPrice + ";" + availableCounts + ";" + appropraiteAge + ";" + minPlayers + "-" + maxPlayers + ";" + designer;
		
		return newToy;
	}
	
	public char removeToy() {
		System.out.print("\nDo you want to remove it (Y/N)? ");
		char option = scanner.next().toUpperCase().charAt(0);
		return option;
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
