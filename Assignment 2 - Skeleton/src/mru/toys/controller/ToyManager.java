package mru.toys.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
	private void loadData() throws IOException{		//Loads txt file into an ArrayList
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
					Toys showToy = new Figures(Long.parseLong(SN), splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), Integer.parseInt(splittedLine[5]), splittedLine[6].charAt(0));
					toy.add(showToy);
				}else if(firstSN == '2' || firstSN == '3') {
					Toys showToy = new Animals(Long.parseLong(SN), splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), Integer.parseInt(splittedLine[5]), splittedLine[6], splittedLine[7].charAt(0));
					toy.add(showToy);
				}else if (firstSN == '4' || firstSN == '5' || firstSN == '6') {
					Toys showToy = new Puzzle(Long.parseLong(SN), splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), Integer.parseInt(splittedLine[5]), splittedLine[6].charAt(0));
					toy.add(showToy);
				}else if (firstSN == '7' || firstSN == '8' || firstSN == '9') {
					Toys showToy = new BoardGames(Long.parseLong(SN), splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]), Integer.parseInt(splittedLine[5]), splittedLine[6], splittedLine[7]);
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
//				addToy();
				break;
			case 3:
//				removeToy();
				break;
			case 4:
//				save();
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
//			searchByName();
			break;
		case 3:
//			searchByType();
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
		String serialNum = appMen.searchSerialNumber();
		Long searchSN = Long.parseLong(serialNum);
		for (Toys i : toy) {
			if(i.getSerialNumber() == searchSN) {
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

	
}
