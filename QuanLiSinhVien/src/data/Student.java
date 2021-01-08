package data;

import java.util.Scanner;

public class Student extends Person {
	private String id;
	private double gpa;
	private String email;

	public Student() {

	}

	public String getId() {
		return id;
	}

	public boolean setId(String id) {
		if (id != null) {
			this.id = id;
			return true;
		} else {
			System.out.println("Vui long dien thong tin: ");
			return false;
		}
	}

	public double getGpa() {
		return gpa;
	}

//	public boolean setGpa(double gpa) {
//		if (gpa >= 0 && gpa <= 10) {
//			this.gpa = gpa;
//			return true;
//		}else {
//			System.out.println("Vui long nhap trong khoang tu 1 den 10: ");
//			return false;
//		}
//		
//	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getEmail() {
		return email;
	}

	public boolean setEmail(String email) {
		if (email != null && email.contains("@") && !email.contains(" ")) {
			this.email = email;
			return true;
		} else {
			System.out.println("Email phai co @ va khong khoang trong");
			return false;
		}
	}

	@Override
	public void inputInfor() {
		// TODO Auto-generated method stub
		super.inputInfor();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter ID: ");
//		while(true) {
//			String inputID = sc.nextLine();
//			boolean check = setId(inputID);
//			if(check) {
//				break;
//			}
//		}
		
		while(true) {
			System.out.println("Enter Id: ");
			String checkId = sc.nextLine();	
			if (!checkId.isEmpty()) {
				id = checkId;
				break;
			}
		}
		
//		while(!setId(sc.nextLine()));
//		System.out.println("Nhap GPA: ");
//		while (true) {
//			double inputGpa = Double.parseDouble(sc.nextLine());
//			boolean check = setGpa(inputGpa);
//			if (check) {
//				break;
//			}
//		}
		do {
			try {
				System.out.println("Enter Gpa:");
				double input = Double.parseDouble(sc.nextLine());
				gpa = input;
				if (gpa < 0 || gpa > 10)
					System.out.println("GPA trong khoang 0 den 10");
			} catch (Exception e) {
				System.out.println("Khong duoc nhap ki tu");
			}
		} while (gpa < 0 || gpa > 10);
		

		System.out.println("Nhap Email: ");
		while (true) {
			String inputEmail = sc.nextLine();
			boolean check = setEmail(inputEmail);
			if (check) {
				break;
			}
		}
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.printf("|%-10s|%-10s|%-10s|%6.2f|%4d|%-30s\n", id, name, gender, gpa, yob, email);
	}

	public boolean checkSchoolarShip() {
		if (this.gpa >= 8)
			return true;
		return false;
	}

}
