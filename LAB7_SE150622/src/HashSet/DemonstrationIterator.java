package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class DemonstrationIterator {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
	    for (int i = 0; i < 5; i++) {
	    	int s = sc.nextInt();
	    	hashSet.add(s);
		}
	    Iterator<Integer> iterator = hashSet.iterator();
	    System.out.println("elements in HashSet: ");
	    while (iterator.hasNext()) {
	    	System.out.print(iterator.next() + "\t");
	    }
	}
}
