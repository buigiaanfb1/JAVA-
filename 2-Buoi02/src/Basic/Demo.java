package Basic;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
//		String fullname;
//		int age;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your Fullname: ");
//		fullname = sc.nextLine();
//		try {
//			System.out.println("Enter your age: ");
//			age = Integer.parseInt(sc.nextLine());
//			System.out.println("Fullname: " + fullname);
//			System.out.println("Age: " + age);
//		} catch (NumberFormatException nfe) {
//			System.out.println("Invail number");
//		}
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		System.out.println("Sum(x + y) = " + (x + y));
	}
}
