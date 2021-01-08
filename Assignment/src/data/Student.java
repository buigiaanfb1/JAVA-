package data;

import java.util.Scanner;

public class Student {
	private String code;
	private String name;
	private String address;
	private double salary;
	private double allowance;
	public double wages;

	public Student() {
		super();
	}

	public Student(String code, String name, String address, double ssalary, double allowance) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.salary = ssalary;
		this.allowance = allowance;
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public void wages() {
		this.wages = this.salary + this.allowance;
	}

	public void addInfo() {
		boolean isCheck = false;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter code of employee: ");
	//		this.code = sc.nextLine();
			String check = sc.nextLine();
			if (check.contains("SE")) {
				isCheck = true;
				this.code = check;
				break;
			}
			System.out.println("ID Code must contain SExxxxxx");
		}
		System.out.print("Enter name of employee: ");
		this.name = sc.nextLine();
		System.out.print("Enter address of employee: ");
		this.address = sc.nextLine();
		System.out.print("Enter salary of employee: ");
		this.salary = sc.nextDouble();
		System.out.print("Enter allowance of employee: ");
		this.allowance = sc.nextDouble();
		System.out.format("\n");
		wages();

	}

	public void updateInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of employee: ");
		this.name = sc.nextLine();
		System.out.print("Enter address of employee: ");
		this.address = sc.nextLine();
		System.out.print("Enter salary of employee: ");
		this.salary = sc.nextDouble();
		System.out.print("Enter allowance of employee: ");
		this.allowance = sc.nextDouble();
		System.out.format("\n");
		wages();
	}

	public void showWages() {
		System.out.format("|%-20s|%-20f|%-20f|%-20f\n", name, salary, allowance, wages);
	}

	public void showInfo() {
		System.out.format("|%-20s|%-20s|%-20s|%-20f|%-20f\n", code, name, address, salary, allowance);

	}

}
