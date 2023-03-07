package mru.toys.controller;

import java.util.ArrayList;
import mru.toys.model.Toys;
import mru.toys.view.AppMenu;

public class ToyManager {
	final String FILE_PATH = "res/toys.txt"; 
	ArrayList<Toys> toy;
	AppMenu appMen;
	
	public ToyManager() {		//Constructor
		toy = new ArrayList<>();
		appMen = new AppMenu();
//		loadData();
//		launchApplication();
	}
	
	/**
	 * Based on the users choice, it will direct user to the next menu
	 * Uses switch case to direct flow
	 */
	public void launchApplication() {		//Opens up the main menu and prompts user for selection
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
	 */
	public void search() {						
		int option = appMen.searchSubMenu();	//Prompts user the search menu
		
		switch(option) {
		case 1:
//			searchBySN();
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
	
}
