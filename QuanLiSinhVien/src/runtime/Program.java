package runtime;

import java.util.*;
import data.*;
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

		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<>();
		Student st = new Student();
		int choose;
		do {
			showMenu();
			System.out.println("Vui long nhap lua chon: ");
			choose = Integer.parseInt(scanner.nextLine());
			switch (choose) {
			case 1:
				Student std = new Student();
				std.inputInfor();
				studentList.add(std);
				break;

			case 2:
				for (Student o : studentList)
					o.showInfo();
				break;

			case 3:
				double max = 0;
				double min = 10;
				for (Student o : studentList) {
					if (o.getGpa() >= max) max = o.getGpa();
					if (o.getGpa() <= min) min = o.getGpa();
				}
				for (Student o : studentList) if (o.getGpa() == max || o.getGpa() == min) o.showInfo();
				break;

			case 4:
				System.out.println("nHap ma sinh vien can tim kiem: ");
				String keyID = scanner.nextLine();
				int count = 0;
				for (Student o : studentList) {
					if (o.getId().equalsIgnoreCase(keyID)) {
						o.showInfo();
						count++;
					}
				}
				if (count == 0)
					System.out.println("Khong tim thay sinh vien nao");
				break;

			case 5:
//				Collections.sort(studentList, new Comparator<Student>() {
//
//					@Override
//					public int compare(Student o1, Student o2) {
//						// TODO Auto-generated method stub
//						if (o1.getName().compareTo(o2.getName()) >= 0) {
//							return 1;
//						}
//						return -1;
//					}
//				});
				Collections.sort(studentList, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						// TODO Auto-generated method stub
						if(o1.getName().compareTo(o2.getName()) >= 0) return 1;
						return -1;
					}
				});
				break;

			case 6:
				Collections.sort(studentList, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						// TODO Auto-generated method stub
						if (o1.getGpa() <= o2.getGpa()) {
							return 1;
						}
						return -1;
					}

				});
				for (Student o : studentList) {
					if (o.checkSchoolarShip())
						o.showInfo();
				}

				break;

			case 7:
				break;

			default:
				System.out.println("May biet nhap tu 1 --> 7 khong?");
				break;
			}
		} while (choose != 7);

	}

	static void showMenu() {
		System.out.println("1. Nhap vao2 1 sinh vien");
		System.out.println("2. Hien thi thong tin sinh vien");
		System.out.println("3. Hien thi max min theo diem trung binh");
		System.out.println("4. Tim kiem theo ma sinh vien");
		System.out.println("5. Sort tu A-Z theo ten sinh vien va hien thi");
		System.out.println("6. Hien thi cac sinh vien duoc hoc bong tu cao xuong thap");
		System.out.println("7. Thoat");
	}
}
