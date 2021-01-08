package data;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Menu extends Vector <String>{
	public Menu() {
		super();
	}
	
	void addMenuItem(String S) {
		this.add(S);
	}
	
	int getUserChoice() {
		System.out.println("1. Add new employee");
		System.out.println("2. Remove an employee");
		System.out.println("3. Promoting the employee's salary");
		System.out.println("4. Print the list");
		System.out.println("5. Save to files");
		System.out.println("6. Quit");
		Scanner sc = new Scanner(System.in);	
		int choice = sc.nextInt();
		return choice;
	}
}
