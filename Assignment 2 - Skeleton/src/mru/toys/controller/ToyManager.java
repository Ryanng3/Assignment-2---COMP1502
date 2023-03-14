package mru.toys.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import mru.toys.exceptions.NegativeException;
import mru.toys.model.Animals;
import mru.toys.model.BoardGames;
import mru.toys.model.Figures;
import mru.toys.model.Puzzle;
import mru.toys.model.Toys;
import mru.toys.view.AppMenu;

public class ToyManager {
	final String FILE_PATH = "res/toys.txt"; 
	ArrayList<Toys> toy;
	AppMenu appMen;
	
	public ToyManager() throws IOException {		//Constructor
		toy = new ArrayList<>();
		appMen = new AppMenu();
		loadData();
		launchApplication();
	}
	
	/**
	 * This method loads the txt file into an ArrayList and splits the ";" and stores it into its corresponding attributes.
	 * @throws IOException
	 */
	public void loadData() throws IOException{		//Loads txt file into an ArrayList
		File file = new File(FILE_PATH);
		String currentLine;
		String[] splittedLine; 
		String SN;
		char firstSN;
		
		if(file.exists()) {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				currentLine = input.nextLine();
				splittedLine = currentLine.split(";");
				SN = splittedLine[0];
				firstSN = splittedLine[0].charAt(0);
				
				
				if(firstSN == '0' || firstSN == '1') {
					Toys showToy = new Figures(splittedLine[0], splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), Integer.parseInt(splittedLine[5]), splittedLine[6].charAt(0));
					toy.add(showToy);
				}else if(firstSN == '2' || firstSN == '3') {
					Toys showToy = new Animals(splittedLine[0], splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), Integer.parseInt(splittedLine[5]), splittedLine[6], splittedLine[7].charAt(0));
					toy.add(showToy);
				}else if (firstSN == '4' || firstSN == '5' || firstSN == '6') {
					Toys showToy = new Puzzle(splittedLine[0], splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), Integer.parseInt(splittedLine[5]), splittedLine[6].charAt(0));
					toy.add(showToy);
				}else if (firstSN == '7' || firstSN == '8' || firstSN == '9') {
					Toys showToy = new BoardGames(splittedLine[0], splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), Integer.parseInt(splittedLine[5]), splittedLine[6], splittedLine[7]);
					toy.add(showToy);
				}
				
			}input.close();
			
		}

	}
	
	/**
	 * Based on the users choice, it will direct user to the next menu
	 * Uses switch case to direct flow
	 * @throws IOException 
	 */
	public void launchApplication() throws IOException {
		appMen.openingMsg();				//Opens up the main menu and prompts user for selection
		boolean flag = true;
		int option;
		
		while(flag) {
			option = appMen.showMainMenu();
			
			switch(option) {
			case 1:
				search();
				break;
			case 2:
				addToy(toy);
				break;
			case 3:
				removeToy(toy);
				break;
			case 4:
				save(toy);
				appMen.closingMsg();
				flag = false;
				System.exit(0);
			}
		}
		
	}
	
	
	/**
	 * Based on users choice, it will prompt the user the next menu
	 * Uses switch case to direct flow
	 * @throws IOException 
	 */
	public void search() throws IOException {						
		int option = appMen.showSubMenu();	//Prompts user the search menu
		
		switch(option) {
		case 1:
			searchBySN(toy);
			break;
		case 2:
			searchByName(toy);
			break;
		case 3:
			searchByType(toy);
			break;
		case 4:
			launchApplication();
			break;
		}
	}
	
	/**
	 * Takes in the list of toys and searches by the Serial Number
	 * Prompts the user if they want to purchase it
	 * @param toy
	 * @throws IOException
	 */
	public void searchBySN(ArrayList<Toys>toy) throws IOException {
		boolean found = false;
		String searchSN = appMen.searchSerialNumber();
		for (Toys i : toy) {
			if(i.getSerialNumber().equals(searchSN)) {
				if(i.getAvailableCount() > 0) {
					System.out.println("\nHere are the search results:\n");
					System.out.println("\n" + i);
					char choice = appMen.purchaseToy();
					
					if(choice == 'Y') {
						i.setAvailableCount(i.getAvailableCount() - 1);
						System.out.println("\nThe Transaction Successfully Terminated!");
						launchApplication();
					}else {
						search();
					}
					found = true;
				}else {
					System.out.println("Toy is not available");
					found = true;
				}
			}
		}
	}
	
	/**
	 * Searches through the list of toys that contains the specified word
	 * asks user to purchase toy
	 * @param toy
	 * @throws IOException
	 */

	public void searchByName(ArrayList<Toys>toy) throws IOException {
		ArrayList<String> serialNumList = new ArrayList<>();		
		ArrayList<Toys> toyList = new ArrayList<>();
		boolean found = false;
		String searchToy = appMen.searchToyName();
		for (Toys i : toy) {
			if(i.getName().toLowerCase().contains(searchToy.toLowerCase())) {	//searches for the name
				serialNumList.add(((Toys) i).getSerialNumber());
				toyList.add(i);
			}
		}
		int a = 1;
		System.out.println("\nHere are the results:\n");
		for (Toys i : toyList) {
			System.out.println("(" + a + ")" + i);		//prints out the list of toys and user will select one
			a++;
		}
		int choose = appMen.whichToy();
		for (Toys i: toy) {
			if (i.getSerialNumber() == serialNumList.get(choose - 1)){
				if(i.getAvailableCount() > 0) {
					System.out.println("\nChosen toy: " + i);
					char choice = appMen.purchaseToy();					//Asks user if they would like the purchase toy
						
					if(choice == 'Y') {	
						i.setAvailableCount(i.getAvailableCount() - 1);
						System.out.println("\nThe transaction Successfully Terminated!");
						search();
					}else {
						search();
					}
					found = true;
				}else {
					System.out.println("Toy is not available");
					found = true;
				}
			}
		}
		
	}
	
	/**
	 * This method searches based on the type of toy the user wants to search for
	 * @param toy
	 * @throws IOException
	 */
	public void searchByType(ArrayList<Toys>toy) throws IOException {
		ArrayList<String> serialNumList = new ArrayList<>();
		ArrayList<Toys> toyList = new ArrayList<>();
		char searchType = appMen.searchType();
		
		switch(searchType) {														
		case 'F':
			char classification = appMen.searchFigure();							
			for (Toys i : toy) {
				if(i instanceof Figures) {										
					if(((Figures) i).getClassification() == classification) {
						serialNumList.add(((Figures) i).getSerialNumber());			//Add to list
						toyList.add(i);									
					}
				}
			}
			break;
		case 'A':
			char size = appMen.searchAnimal();
			for (Toys i : toy) {
				if (i instanceof Animals) {
					if (((Animals) i).getSize() == size) {
						serialNumList.add(((Animals) i).getSerialNumber());
						toyList.add(i);
					}
				}
			}
			break;
		case 'P':
			char type = appMen.searchPuzzle();
			for (Toys i: toy) {
				if (i instanceof Puzzle) {
					if (((Puzzle) i).getPuzzleType() == type) {
						serialNumList.add(((Puzzle) i).getSerialNumber());
						toyList.add(i);
					}
				}
			}
			break;
		case 'B':
			String num = appMen.searchBoardGame();
			for (Toys i : toy) {
				if (i instanceof BoardGames) {
					if (((BoardGames) i).getNumOfPlayers().equals(num)) {
						serialNumList.add(((BoardGames) i).getSerialNumber());
						toyList.add(i);
					}
				}
			}
			break;
		}
		
		int a = 1;
		for (Toys i : toyList) {
			System.out.println(" (" + a + ")" + i);
			a++;
		}
		boolean found = false;
		while(!found) {
			int option = appMen.whichToy();
			for (Toys i : toy) {
				if(i.getSerialNumber() == serialNumList.get(option - 1)) { //Checks to see if the serial number matches
					if(i.getAvailableCount() > 0) {
						System.out.println("Choosen toy: " + i);
						char choice = appMen.purchaseToy();
						
						if(choice == 'Y') {
							i.setAvailableCount(i.getAvailableCount() - 1);
							System.out.println("\nThe transaction Successfully Terminated!");
							search();
							
						}else {
							search();
						}
						found = true;
						
					}
					else {
						System.out.println("Toy is not available");
						found = true;
					}
					
				}
			}
		}
	}
	
	/**
	 * This method prompts user from the app menu and adds the toy to the list
	 * @param toy
	 */
	public void addToy(ArrayList<Toys>toy) {
		char option = appMen.addNewToy();
		String[] splittedLine;
		String addFigures;
		switch (option) {
		case 'F':
			try {
				addFigures = appMen.addNewFigure();
			} catch (NegativeException e) {
				e.getMessage();
			}
			splittedLine = addFigure.split(";");
			toy.add(new Figures(splittedLine[0], splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), Integer.parseInt(splittedLine[5]), splittedLine[6].charAt(0)));		
			System.out.println("New Toy Added!");
			break;
		case 'A':
			String addAnimal = appMen.addNewAnimal();
			splittedLine = addAnimal.split(";");
			toy.add(new Animals(splittedLine[0], splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), Integer.parseInt(splittedLine[5]), splittedLine[6], splittedLine[7].charAt(0)));
			System.out.println("New Toy Added!");
			break;
		case 'P':
			String addPuzzle = appMen.addNewPuzzle();
			splittedLine = addPuzzle.split(";");
			toy.add(new Puzzle(splittedLine[0], splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), Integer.parseInt(splittedLine[5]), splittedLine[6].charAt(0)));
			System.out.println("New Toy Added!");

			break;
		case 'B':
			String addBoardGame = appMen.addNewBoardGame();
			splittedLine = addBoardGame.split(";");
			toy.add(new BoardGames(splittedLine[0], splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), Integer.parseInt(splittedLine[5]), splittedLine[6], splittedLine[7]));
			break;
		}
	}
	
	/**
	 * Removes toy from the list of toys
	 * @param toy
	 * @throws IOException
	 */
	public void removeToy(ArrayList<Toys>toy) throws IOException {
		boolean found = false;
		String serialNum = appMen.searchSerialNumber();		//prompt from appMenu
		
		for(Toys i : toy) {									
			if (i.getSerialNumber().equals(serialNum)) {
				System.out.println("\nThis item found!");
				System.out.println("\n\t" + i);
				char choice = appMen.removeToy();
				
				if (choice == 'Y') {
					toy.remove(i);
					System.out.println("\nItem Removed!\n");
					launchApplication();
				}else {
					launchApplication();
				}
				found = true;
			}else {
				System.out.println("Item cannot be found");
				found = true;
			}
		}
	}

	/**
	 * This method writes and updates the existing txt file
	 * @param toy
	 * @throws IOException
	 */
	public void save(ArrayList<Toys>toy) throws IOException {		//Saves to txt files
		PrintWriter pw = new PrintWriter(FILE_PATH);
		for (Toys i : toy) {
			pw.println(i.format());
		}
		pw.close();
	}
	
}
