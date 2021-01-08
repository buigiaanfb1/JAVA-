package main;

import data.Student;
import util.Filter;
import util.FilterGeneric;

public class Main {
	public static void main(String[] args) {
		Student list[] = initStudentList();

		Filter whereGPA8 = new FilterByGpa();
		selectStudent(list, whereGPA8);

		Filter where1990To1995 = new Filter() {

			@Override
			public boolean check(Student x) {
				// TODO Auto-generated method stub
				return x.getYob() >= 1990 && x.getYob() <= 1995;
			}
		};
		selectStudent(list, where1990To1995);
		Filter where1995To2000 = (x) -> x.getYob() >= 1995 && x.getYob() <= 2000;
		selectStudent(list, where1995To2000);
		
		FilterGeneric<Student> whereGPA7toGPA9 = (Student x) -> x.getGpa() >= 7 && x.getGpa() <= 9;
		selectStudent(list, whereGPA7toGPA9);
	}

	public static void selectStudent(Student list[], Filter whereCondition) {
		if (list.length == 0) {
			System.out.println("The list is empty, Nothing to filter");
			return;
		}
		System.out.println("The student list after filtering");
		for (Student x : list) {
			if (whereCondition.check(x)) {
				x.showProfile();
			}
		}
	}
	
	public static void selectStudent(Student list[], FilterGeneric whereCondition) {
		if (list.length == 0) {
			System.out.println("The list is empty, Nothing to filter");
			return;
		}
		System.out.println("The student list after filtering");
		for (Student x : list) {
			if (whereCondition.check(x)) {
				x.showProfile();
			}
		}
	}

	// tao mang va nhet phan tu cho truoc
	public static Student[] initStudentList() {
		Student list[] = new Student[10];
		list[0] = new Student("SE01", "Mot", 1991, 1.0);
		list[1] = new Student("SE02", "Hai", 1992, 2.0);
		list[2] = new Student("SE03", "Ba", 1993, 3.0);
		list[3] = new Student("SE04", "Bon", 1994, 4.0);
		list[4] = new Student("SE05", "Nam", 1995, 5.0);
		list[5] = new Student("SE06", "Sau", 1996, 6.0);
		list[6] = new Student("SE07", "Bay", 1997, 7.0);
		list[7] = new Student("SE08", "Tam", 1998, 8.0);
		list[8] = new Student("SE09", "Chin", 1999, 9.0);
		list[9] = new Student("SE10", "Muoi", 2000, 10.0);
		return list;

	}
}
