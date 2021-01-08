package runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import data.SoftDrink;

/*Information about a softdrink include: code, name, make, price(float).
Write a Java program that allows users:
- Add a softdrink
- Update the price of a softdrink  based on a code inputted
- Find softdrinks based on a code inputted
- Delete softdrinks based on a name  inputted
- List all products using ascending order of  name and  Descending order of prices
*/
public class Program {
	public static void main(String[] args) {
		int choice;
		ArrayList<SoftDrink> softDrinkList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		do {
			choice();
			System.out.print("Please enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				SoftDrink sd = new SoftDrink();
				sd.inputSoftDrink();
				softDrinkList.add(sd);
				break;

			case 2:
				boolean check = false;
				do {
					System.out.print("Please enter drink code's that you want to change the price: ");
					sc.nextLine();
					String checkCode = sc.nextLine();
					for (SoftDrink o : softDrinkList) {
						if (o.getCode().equalsIgnoreCase(checkCode)) {
							System.out.print("Enter price of this drink you want to change: ");
							Float changePrice = sc.nextFloat();
							o.setPrice(changePrice);
							check = true;
						}
					}
				} while (check == false);
				break;

			case 3:
				System.out.print("Find softdrinks based on a code inputted: ");
				sc.nextLine();
				String checkCode = sc.nextLine();
				for (SoftDrink o : softDrinkList) {
					if (o.getCode().equalsIgnoreCase(checkCode)) {
						o.showSoftDrink();
					}
				}
				break;

			case 4:
				System.out.print("Enter name you want to delete: ");
				sc.nextLine();
				String delName = sc.nextLine();
				Iterator<SoftDrink> iter = softDrinkList.iterator();
				while (iter.hasNext()) {
					SoftDrink str = iter.next();
					if (str.getName().equalsIgnoreCase(delName))
						iter.remove();
				}
				break;


			case 5:
				Collections.sort(softDrinkList, new Comparator<SoftDrink>() {
					@Override
					public int compare(SoftDrink o1, SoftDrink o2) {
						if (o1.getName().equalsIgnoreCase(o2.getName()) && o1.getPrice() > o2.getPrice()) {
							return 1;
						}
						return -1;
					}
				});
				for (SoftDrink o : softDrinkList) {
					o.showSoftDrink();
				}
				break;


			case 6:
				for (SoftDrink o : softDrinkList) {
					o.showSoftDrink();
				}
				break;
			}
		} while (choice != 7);
	}

	public static void choice() {
		System.out.println("1. Add a softdrink");
		System.out.println("2. Update the price of a softdrink  based on a code inputted");
		System.out.println("3. Find softdrinks based on a code inputted");
		System.out.println("4. Delete softdrinks based on a name  inputted");
		System.out.println("5. List all products using ascending order of name and Descending order of prices");
		System.out.println("6. Quit");
	}
}
