package data;

import java.util.Scanner;

public class Employee {
	protected String code;
	protected String name;
	protected int salary;
	
	
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee code: ");
		code = sc.nextLine();
		System.out.print("Enter employee name: ");
		name = sc.nextLine();
		System.out.print("Enter employee salary: ");
		salary = sc.nextInt();
	}
	
	public void showInfo() {
		System.out.format("|%-20s|%-20s|%-6d\n", code, name, salary);
	}
}
