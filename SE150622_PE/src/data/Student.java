package data;

import java.util.Scanner;

public class Student {
	private String code;
	private String name;
	private String class_id;
	private float mark_pro192;
	private float mark_Pro201;
	private float mark_dbi202;
	private float highestGPA;
	
	public Student() {
		super();
	}

	public Student(String code, String name, String class_id, float mark_pro192, float mark_Pro201, float mark_dbi202) {
		super();
		this.code = code;
		this.name = name;
		this.class_id = class_id;
		this.mark_pro192 = mark_pro192;
		this.mark_Pro201 = mark_Pro201;
		this.mark_dbi202 = mark_dbi202;
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

	public String getClass_id() {
		return class_id;
	}

	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}

	public float getMark_pro192() {
		return mark_pro192;
	}

	public void setMark_pro192(float mark_pro192) {
		this.mark_pro192 = mark_pro192;
	}

	public float getMark_Pro201() {
		return mark_Pro201;
	}

	public void setMark_Pro201(float mark_Pro201) {
		this.mark_Pro201 = mark_Pro201;
	}

	public float getMark_dbi202() {
		return mark_dbi202;
	}

	public void setMark_dbi202(float mark_dbi202) {
		this.mark_dbi202 = mark_dbi202;
	}
		
	public float getHighestGPA() {
		return highestGPA;
	}

	public void setHighestGPA(float highestGPA) {
		this.highestGPA = highestGPA;
	}

	
	public void highestGPA() {
		this.highestGPA = (this.mark_pro192 + this.mark_Pro201 + this.mark_dbi202) / 3;
	}
	
	
	public void addInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter code: ");
		this.code = sc.nextLine();
		System.out.print("Enter name: ");
		this.name = sc.nextLine();
		System.out.print("Enter Class ID: ");
		this.class_id = sc.nextLine();
		System.out.print("Enter mark of PRO192: ");
		this.mark_pro192 = Float.parseFloat(sc.nextLine());
		System.out.print("Enter mark of PRO202: ");
		this.mark_Pro201 = Float.parseFloat(sc.nextLine());
		System.out.print("Enter mark of DBI202: ");
		this.mark_dbi202 = Float.parseFloat(sc.nextLine());
	}
	
	public void showInfo() {
		System.out.printf("|%-10s|%-10s|%-10s|PRO192: %12.2f|PRO202: %12.2f|DBI202: %12.2f|GPA: %12.2f\n", code, name
				, class_id, mark_pro192, mark_Pro201, mark_dbi202, highestGPA);
	}
}
