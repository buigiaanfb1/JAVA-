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
		Student student = new Student();

		int choice;
		int count = 0;
		do {
			choiceList();
			System.out.println("Please choose what you want: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Student student1 = new Student();
				count++;
				student1.addInfo();
				studentList.add(student1);
				break;

			case 2:
				if (count >= 3) {
					System.out.print("Please enter code of the employee you want to update information: ");
					sc.nextLine();
					String find = sc.nextLine();
					for (Student o : studentList) {
						if (o.getCode().equalsIgnoreCase(find))
							o.updateInfo();
					}
				} else {
					System.out.println("You need to add at least 3 employees. ");
					System.out.format("\n");
				}
				break;

			case 3:
				if (count >= 3) {
					for (Student o : studentList)
						o.showWages();
				} else {
					System.out.println("You need to add at least 3 employees. ");
					System.out.format("\n");
				}
				break;

			case 4:
				if (count >= 3) {
					System.out.print("Please enter code of the employee you want to delete: ");
					sc.nextLine();
					String find = sc.nextLine();
					Iterator<Student> iter = studentList.iterator();
					while (iter.hasNext()) {
						Student stu = iter.next();
						if (stu.getCode().equalsIgnoreCase(find))
							iter.remove();
					}
					System.out.format("\n");
				} else {
					System.out.println("You need to add at least 3 employees. ");
					System.out.format("\n");
				}
				break;

			case 5:
				if (count >= 3) {
					Collections.sort(studentList, new Comparator<Student>() {

						@Override
						public int compare(Student o1, Student o2) {
							// TODO Auto-generated method stub
							if (o1.wages > o2.wages)
								return 1;
							return -1;
						}
					});
					for (Student o : studentList)
						o.showInfo();
				} else {
					System.out.println("You need to add at least 3 employees. ");
					System.out.format("\n");
				}
				break;

			case 6:
				System.out.println("Have a nice day");
				return;

			default:
				System.out.println("Please choose in range 1-->6.");
				break;
			}
		} while (choice != 6);
	}

	public static void choiceList() {
		System.out.println("1. Add new employees.");
		System.out.println("2. Update information of an employee using his/her code.");
		System.out.println("3. Print the total wages of each employee.");
		System.out.println("4. Remove an employee  base on code inputted.");
		System.out.println("5. Print the list in ascending order based on total wages.");
		System.out.println("6. Exit");
		System.out.format("\n");
	}
}
