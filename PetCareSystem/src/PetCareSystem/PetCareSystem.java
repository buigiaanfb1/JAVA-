package PetCareSystem;

import Util.Menu;
import data.Cabinet;

public class PetCareSystem {
	public static void main(String[] args) {
		Menu menu = new Menu("Happiness Pet Care System");
		menu.addNewOption("1. Add dog");
		menu.addNewOption("2. Add cat");
		menu.addNewOption("3.");
		menu.addNewOption("4.");
		menu.addNewOption("5.");
		menu.addNewOption("6.");
		menu.addNewOption("7.");
		menu.addNewOption("8.");
		
		Cabinet cage = new Cabinet();
		
		int choice;
		
		do {
			menu.printMenu();
			choice = menu.getChoice();
			switch(choice) {
			case 1:	
				System.out.println("You are preparing to input a new cat profile");
				cage.addNewDog();
				break;
			case 2:	
				System.out.println("You are preparing to input a new cat profile");
				cage.addNewCat();
				break;
			
			case 3:
				System.out.println("You are required to input a pet ID to search");
				cage.se
				break;
			
			case 4:
			break;
			
			case 5:
			break;
			
			case 6:
			break;
			
			case 7:
			break;
			
			case 8:
			break;
			
			}
		}
		
				
		
	}
}
