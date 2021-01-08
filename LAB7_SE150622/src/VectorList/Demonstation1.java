package VectorList;

import java.util.Enumeration;
import java.util.Vector;

public class Demonstation1 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(); 
	    vector.addElement("Cocacola"); 
	    vector.addElement("Pepsi"); 
	    vector.addElement("7up"); 
	
	    // traversing elements using Enumeration 
	    System.out.println("VectorList are:"); 
	    Enumeration e = vector.elements(); 
	    while (e.hasMoreElements()) 
	     System.out.println(e.nextElement()); 
	} 

}
