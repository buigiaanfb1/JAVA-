package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class DemonstrationContains {
	public static void main(String[] args) {
	HashSet<String> numbers = new HashSet<String>();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input student's name to to the list: ");
    for (int i = 0; i < 5; i++) {
    	String s = sc.nextLine();
    	numbers.add(s);
	}
    
    System.out.println("Enter student's name you want to find in the list: ");
    	String find = sc.nextLine();
	for (String o : numbers) {
		if (o.contains(find)) {
			System.out.println(find + " in the list.");
			return;
		}
	 }
	System.out.println("Can't find " + find);
	}
}
