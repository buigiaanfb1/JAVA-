package items;

import java.util.Scanner;
import java.util.Vector;

public class Menu extends Vector <String>{
	public Menu() { super(); }
	void addMenuItem(String S) { this.add(S); }
	int getUserChoice () {
		for (int i = 0; i < this.size(); i++) {
			System.out.println(this.get(i)); 
		}
		System.out.println("------------------------------");
		System.out.print("Select 1..6: ");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		return choice = sc.nextInt();
	}
}
