package data;

import java.util.Scanner;

public class Student {
	protected String code;
	protected String name;
	protected int age;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code: ");
		code = sc.nextLine();
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("Enter age: ");
		age = Integer.parseInt(sc.nextLine());
	}
	public void showInfo() {
		System.out.format("|%10s|%10s|%6.1d", code, name, age);
	}
}
