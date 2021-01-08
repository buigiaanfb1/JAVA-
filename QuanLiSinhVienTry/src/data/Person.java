package data;

import java.util.*;

public class Person {
	protected String name;
	protected String gender;
	protected int yob;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYob() {
		return yob;
	}

	public void setYob(int yob) {
		this.yob = yob;
	}
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name: ");
		name = sc.nextLine();
		System.out.println("Input gender: ");
		gender = sc.nextLine();
		System.out.println("Input date of birth (just year!): ");
		yob = sc.nextInt();
	}
	
	public void showInfo() {
		System.out.printf("|%s|%s|%d\n", name, gender, yob);
	}
}
