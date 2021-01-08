package runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import data.Student;

public class Program {
	public static void main(String[] args) {
		int choice;
		ArrayList<Student> studentList = new ArrayList<>();
		do {
			choice();
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Student st = new Student();
				st.inputInfo();
				studentList.add(st);
				break;

			case 2:
				System.out.println("Please enter code of student you want to remove");
				String checkCodeRemove = sc.nextLine();
				for (Student o : studentList) {
					if (o.getCode().equalsIgnoreCase(checkCodeRemove)) {
						studentList.remove(o);
					}
				}
				break;

			case 3:
				System.out.print("Enter code of student you want to update info: ");
				String checkCodeUpdate = sc.nextLine();
				for (Student o : studentList) {
					if (o.getCode().equalsIgnoreCase(checkCodeUpdate)) {
						o.inputInfo();
					}
				}
				break;

			case 4:
				Collections.sort(studentList, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						// TODO Auto-generated method stub
						if (o1.getName().compareTo(o2.getName()) >= 0) {
							return 1;
						}
						return -1;
					}
				});
				break;

			case 5:
				System.out.println("Goodbiee!");
				break;

			default:
				System.out.println("in range 1 --> 5");
				break;
			}
		} while (choice != 5);
	}

	public static void choice() {
		System.out.println("1. Add new student");
		System.out.println("2. Remove a student");
		System.out.println("3. Update a student");
		System.out.println("4. List (descend)");
		System.out.println("5. Quit");
	}
}
