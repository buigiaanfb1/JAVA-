package VectorList;

import java.util.Scanner;
import java.util.Vector;

public class Demonstration2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vector = new Vector<Integer>(); 
		System.out.println("Please input size of Vector List: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			vector.add(i);
		}
		System.out.println(vector);
		vector.add(100);
		System.out.println(vector);
		
		for (int i = 0; i < vector.size(); i++) System.out.print(vector.get(i) + " "); 
	}
}
