package runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import data.Person;
import data.Student;

/*
 * Tạo class Person gồm các thuộc tính name, gender, yob
 * tạo getter setter cho các thuộc tính
 * không tạo Constructor
 * tạo hàm input infor để ép người dùng nhập thông tin cho object
 * tạo hàm show info để show ra thông tin của object
 * tạo class Student kế thứa class Person ID GPA EMAIL
 * tạo constructor không đối số
 * tạo hàm input info hoặc độ lại hàm từ Person
 * ép người dùng nhập đúng
 * tạo hàm show Info student
 * 
 * 
 * main:
 * xây dựng chương trình quản lí sinh viên 
 * 1/ nhập vào 1 sinh viên
 * 2/ hiển thị thông tin sinh viên
 * 3/ hiển thị max min theo điểm GPA
 * 4/ tìm kiếm theo mã sinh viên
 * 5/ short từ a --> z theo tên sinh viên và hiển thị
 * 6/ hiển thị các sinh viên được học bổng từ cao xuống thấp(phải trên 8 điểm)
 * 7/ 
 */
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<>();
		Student std = new Student();
		int choice = 0;
		do {
			showMenu();
			System.out.println("Vui long chon lua chon: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				std.inputInfo();
				studentList.add(std);
				break;

			case 2:
				for (Student o : studentList)
					o.showInfo();
				break;

			case 3:
				System.out.println("Please choose Student you want to update ID: ");
				sc.nextLine();
				String checkId = sc.nextLine();
				System.out.println("Please enter new ID: ");
				String updateId = sc.nextLine();
				for (Student o : studentList) {
					if (o.getId().equalsIgnoreCase(checkId)) {
						o.setId(updateId);
					}
				}
			}
		} while (choice != 7);
	}

	public static void showMenu() {
		System.out.println("1. Nhập vào thông tin sinh viên");
		System.out.println("2. Hiển thị thông tin sinh viên");
		System.out.println("3. Chinh sua Gpa");
		System.out.println("4. Tìm kiếm theo mã sinh viên");
		System.out.println("5. Sort từ A->Z theo tên sinh viên và hiển thị");
		System.out.println("6. Hiển thị các sinh viên có học bổng từ cao đến thấp");
		System.out.println("7. Quit");
		System.out.println("Easy game vai lon cac ban oi!!!!!!!!!!!!!!!!!!!!!");
	}
}
