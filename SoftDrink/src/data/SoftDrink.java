package data;

import java.util.Scanner;

public class SoftDrink {
	protected String code;
	protected String name;
	protected String make;
	protected float price;

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

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public void inputSoftDrink() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code of drinks: ");
		this.code = sc.nextLine();
		System.out.println("Enter name of drinks: ");
		this.name = sc.nextLine();
		System.out.println("Enter make of drinks: ");
		this.make = sc.nextLine();
		System.out.println("Enter price of drinks: ");
		this.price = Float.parseFloat(sc.nextLine());	
	}
	
	public void showSoftDrink() {
		System.out.format("|%-10s|%-10s|%10s|%.4f\n", code, name, make, price);
	}

}
