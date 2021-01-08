package runtime;

import data.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<>();
		Student student = new Student();
		student.addInfo();
		studentList.add(student);
		while (true) {
			System.out.print("Do you want to add another Student (Y/N): ");
			String enter = sc.nextLine();
			System.out.println(enter);
			if (enter.equalsIgnoreCase("Y")) {
				Student student1 = new Student();
				student1.addInfo();
				studentList.add(student1);
			} else
				break;
		}
//		Collections.sort(studentList, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				if (o1.getName().compareTo(o2.getName()) >= 0) {
//					return 1;
//				}
//				return -1;
//			}
//		});
//		System.out.println("--------------Sorted----------------");
//		for (Student o : studentList) o.showInfo();

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

	}
}
