package mru.toys.application;

import mru.toys.controller.ToyManager;
import mru.toys.view.AppMenu;

public class AppDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new ToyManager();
		AppMenu show = new AppMenu();
		show.openingMsg();
		show.showMainMenu();
		show.showSubMenu();
		show.closingMsg();
	}

}
