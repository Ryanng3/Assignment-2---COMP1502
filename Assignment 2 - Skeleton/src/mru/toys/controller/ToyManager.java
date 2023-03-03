package mru.toys.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import mru.toys.model.Toys;
import mru.toys.view.AppMenu;

public class ToyManager {
	final String FILE_PATH = "res/toys.txt"; 
	ArrayList<Toys> toy;
	AppMenu appMen;
	
	public ToyManager() {
		toy = new ArrayList<>();
		appMen = new AppMenu();
//		loadData();
//		launchApplication();
	}
	
	public void launchApplication() throws IOException {
		boolean flag = true;
		int option;
		
		while(flag) {
			option = appMen.showMainMenu();
			
			switch(option) {
			case 1:
//				search();
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
}
