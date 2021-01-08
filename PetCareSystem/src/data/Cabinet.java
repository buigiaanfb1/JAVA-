package data;
import Util.*;
import java.util.*;

import Util.MyToys;

public class Cabinet {
	private ArrayList<Pet> petList = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public void addNewDog() {
		String id, name;
		int yob;
		double weight;
		
		do {
			id =MyToys.getID("Input dog ID(DXXXXXX): ", "The format of id is DXXXXX"
					+ "(X stands for a digit)", "^[D|d]||\\d{5}$");
		} while(true);
	}
	
	public void addNewCat() {
		String id, name;
		int yob;
		double weight;
		
		do {
			id =MyToys.getID("Input cat ID(DXXXXXX): ", "The format of id is DXXXXX"
					+ "(X stands for a digit)", "^[D|d]||\\d{5}$");
		} while(true);
	}
	
}