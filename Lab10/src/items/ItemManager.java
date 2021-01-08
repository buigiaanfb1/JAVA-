package items;

import java.util.Scanner;

public class ItemManager {
	public static void main(String[] args) {
		String filename = "items.txt";
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		menu.add("1-Add new item");
		menu.add("2-Remove an item");
		menu.add("3-Update an item's price");
		menu.add("4-Print the list");
		menu.add("5-Save to files");
		menu.add("6-Quit");
		int userChoice;
		NewItems list = new NewItems();
		list.loadStoredCode(filename);
		do {
			System.out.println("\nNEW ITEM MANAGER");
			userChoice = menu.getUserChoice();
			switch (userChoice) {
			case 1:
				list.addNewItem();
				break;
			case 2:
				list.removeItem();
				break;
			case 3:
				list.updatePrice();
				break;
			case 4:
				list.print();
				break;
			case 5:
				list.appendToFile(filename);
				break;
			default:
				if (list.size() > 0) {
					System.out.print("Save changes Y/N? ");
					String response = sc.nextLine().toUpperCase();
					if (response.startsWith("Y"))
						list.appendToFile(filename);
				}
			}
		} while (userChoice > 0 && userChoice < 6);
	}
}
