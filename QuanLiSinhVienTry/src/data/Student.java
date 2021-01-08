package data;

import java.util.*;

public class Student extends Person {
	private String id;
	private double gpa;
	private String email;

	public Student() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void inputInfo() {
		// TODO Auto-generated method stub
		super.inputInfo();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("Enter Id: ");
			String checkId = sc.nextLine();	
			if (!checkId.isEmpty()) {
				id = checkId;
				break;
			}
		}
		
		/////////////////////
		
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
		
		/////////////////////
		
		while(true) {
			System.out.println("Enter email: ");
			String checkEmail = sc.nextLine();	
			if (!checkEmail.isEmpty() && checkEmail.contains("@") && !checkEmail.contains(" ")) {
				this.email = checkEmail;
				break;
			}
			else System.out.println("Email can't have blank, must contain @");
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
