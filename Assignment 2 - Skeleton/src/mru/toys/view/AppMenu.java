package mru.toys.view;

public class AppMenu {

	public void openingMsg() {
		System.out.println("*****************************************************\n"
						+  "*            WELCOME TO TOY STORE COMPANY           *\n"
						+  "*****************************************************\n");
	}
	
	
	public void showMainMenu() {
		System.out.println("How We May Help You?\n" 
						+  "(1)  Search Inventory and Purchase Toy\n"
						+  "(2)  Add New Toy\n"
						+  "(3)  Remove Toy\n"
						+  "(4)  Save & Exit\n"
						+  "Enter Option: \n");
	}
	
	public void showSubMenu() {
		System.out.println("Find Toys With:\n" 
						+  "(1)  Serial Number (SN) \n"
						+  "(2)  Toy Name\n"
						+  "(3)  Type\n"
						+  "(4)  Back to Main Menu\n"
						+  "Enter Option: \n");
				}
	
	public void addNewToy() {
		System.out.println("Enter Serial Number: \n" 
	+ "Enter Toy Name: \n" 
	+ "Enter Toy Brand: \n"
	+ "Enter Toy Price: \n"
	+ "Enter Available Counts: \n"
	+ "Enter Appropriate Age: \n"
	+ "Enter Minimum Number of PLayers: \n"
	+ "Enter Maximum Number of Players: \n"
	+ "Enter Designer Names (Use ',' to separate the names if there is more than one name): \n");
	}
	
	
	public void closingMsg() {
		System.out.println("*****************************************************\n"
						+  "***             THANK YOU FOR VISITING            ***\n"
						+  "*****************************************************\n");
	}
	
}
