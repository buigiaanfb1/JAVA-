package retry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import data.Student;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		data dataStudent = new data();
		ArrayList<data> arrList = new ArrayList<>();
		while (true) {
			dataStudent.print();
			arrList.add(dataStudent);
			System.out.print("Do you want to enter more student " + "information?(Y/N): ");
			String choice = sc.nextLine();
			if (choice.equalsIgnoreCase("Y")) {
				dataStudent.print();
				arrList.add(dataStudent);
				System.out.print("Do you want to enter more student " + "information?(Y/N): ");
				choice = sc.nextLine();
			} else break;

		}

		Collections.sort(arrList, new Comparator<data>() {

			@Override
			public int compare(data o1, data o2) {
				// TODO Auto-generated method stub
				if (o1.getName().compareTo(o2.getName()) >= 0) {
					return 1;
				}
				return -1;
			}
		});
		
		for (data o : arrList) {
			o.sorted();
		}
	}
}
