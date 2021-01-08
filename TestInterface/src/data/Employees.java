package data;

import java.util.Scanner;

public class Employees implements IEmployees{
	public String name;
	public long salary;
	
	public Employees() {
		
	}
	public Employees(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void name() {
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		salary = sc.nextLong();
	}

	@Override
	public void show() {
		System.out.println("Ten: " + name);
		System.out.println("Luong: " + salary);
	}

}
