package data;

import java.util.Scanner;

public class Student {
	private String name;
	private String classofStudent;
	private double mark;
	
	public Student(String name, String class1, double mark) {
		super();
		this.name = name;
		classofStudent = class1;
		this.mark = mark;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getclassofStudent() {
		return classofStudent;
	}
	public void setClass(String classofStudent) {
		this.classofStudent = classofStudent;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	public void addInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.print("Please enter name of student: ");
		this.name = sc.nextLine();
		System.out.print("Please enter class of student: ");
		this.classofStudent = sc.nextLine();
		System.out.print("Please enter mark of student: ");
		this.mark = Double.parseDouble(sc.nextLine());
		System.out.println("------------------------------");
	}
	
	public void showInfo() {
		System.out.format("|%-20s|%-20s|%-20f\n", name, classofStudent, mark);
	}
}
	

	
