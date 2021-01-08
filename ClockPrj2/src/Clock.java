import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Clock {
  String code="", make="";
  int size=0, price=0;
  Scanner sc = new Scanner(System.in);
  public Clock(String code, String make, int size, int price) {
		super();
		this.code = code;
		this.make = make;
		this.size = size;
		this.price = price;
}
  
  public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public Scanner getSc() {
	return sc;
}

public void setSc(Scanner sc) {
	this.sc = sc;
}

public Clock() {
	  
  }
  public void input() {
	  System.out.println("code: ");
	  this.code = sc.nextLine();
	  System.out.println("make: ");
	  this.make = sc.nextLine();
	  System.out.println("size: ");
	  this.size = Integer.parseInt(sc.nextLine());
	  System.out.println("price: ");
	  this.price = Integer.parseInt(sc.nextLine());
  }
  
  public void showInfo() {
	  System.out.printf("|%-15s|%-15s|%4d|%4d|", code, make, size, price);
  }

}
