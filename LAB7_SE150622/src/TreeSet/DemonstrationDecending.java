package TreeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemonstrationDecending {
	 public static void main(String[] args) {
	        // Creating a TreeSet with a custom Comparator (Descending  Order)
	        SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());
	        // Adding new elements to a TreeSet
	        fruits.add("A");
	        fruits.add("B");
	        fruits.add("C");
	        fruits.add("D");

	        System.out.println("Fruits Set : " + fruits);
	    }
}
