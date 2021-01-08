package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class DemonstrationAdd {
	public static void main(String[] args) {
	ArrayList<String> arrList = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input student's name to to the list: ");
		for (int i = 0; i < 5; i++) {
			String s = sc.nextLine();
			arrList.add(s);
		}	
	System.out.println("Show student's name after add to the list: ");
	for (String o : arrList) {
	      System.out.println(o);
	    }
	}
}
