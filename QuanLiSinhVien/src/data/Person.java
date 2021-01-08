package data;

import java.util.*;

public class Person {
	protected String name;
	protected String gender;
	protected int yob;
	
	public Person() {
		
	}
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
	public void inputInfor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter name of student: ");
		name = sc.nextLine();
		System.out.println("Please enter gender of student: ");
		gender = sc.nextLine();
		System.out.println("Please enter year of birth: ");
		yob = Integer.parseInt(sc.nextLine());
	}
	public void showInfo() {
		System.out.printf("|%s|%s|%d\n", name, gender, yob);
	}
	
}
