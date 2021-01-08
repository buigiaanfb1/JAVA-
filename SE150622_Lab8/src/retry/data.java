package retry;

import java.util.Scanner;

public class data {
	private String name;
	private String Classes;
	private double mark;
	
	public data(String name, String class1, double mark) {
		super();
		this.name = name;
		this.Classes = class1;
		this.mark = mark;
	}

	public data() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClasses() {
		return Classes;
	}

	public void setClass(String class1) {
		Classes = class1;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== Collection Sort Program ======");
		System.out.println("Please input student information");
		System.out.print("Name: ");
		this.name = sc.nextLine();
		System.out.print("Classes: ");
		this.Classes = sc.nextLine();
		System.out.print("Mark: ");
		this.mark = sc.nextDouble();
	}
	
	public void sorted() {
		System.out.format("%20s |%20s |%20f", name, Classes, mark);
	}
	
}
