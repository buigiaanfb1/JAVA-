package runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import data.Student;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<>();
		int choice;
		do {
			menu();
			System.out.print("Enter your choice: ");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				Student student = new Student();
				student.addInfo();
				student.highestGPA();
				studentList.add(student);
				break;

			case 2:
				System.out.print("Please enter code of the student you want to delete: ");
				String find = sc.nextLine();
				Iterator<Student> iter = studentList.iterator();
				while (iter.hasNext()) {
					Student stu = iter.next();
					if (stu.getCode().equalsIgnoreCase(find))
						iter.remove();
				}
				break;

			case 3:
				Collections.sort(studentList, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						// TODO Auto-generated method stub
						if (o1.getHighestGPA() >= o2.getHighestGPA()) {
							return -1;
						}
						return 1;
					}
				});
				for (Student o : studentList) {
					o.showInfo();
				}
				break;

			case 4:
				Collections.sort(studentList, new Comparator<Student>() {


//					@Override
//					public int compare(Student o1, Student o2) {
//						// TODO Auto-generated method stub
//						if (o1.getHighestGPA() >= o2.getHighestGPA()) {
//							return 1;
//						}
//						return -1;
//					}
				});
				
//				for (Student o : studentList) {
//					o.showInfo();
//				}
				break;

			case 5:
				System.out.println("Goodbye");
				break;

			default:
				System.out.println("Input in range 1 --> 5");
			}
		} while (choice != 5);

	}

	public static void menu() {
		System.out.println("--------------------");
		System.out.println("1. Add student.");
		System.out.println("2. Remove an student based on a code inputted");
		System.out.println("3. Print the list of students with the highest GPA ");
		System.out.println("4. Print the list in descending order based on GPA.");
		System.out.println("5. Exit");
		System.out.println("--------------------");
	}
}
