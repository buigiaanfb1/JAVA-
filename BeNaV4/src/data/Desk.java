package data;

public class Desk extends Shape {
	public static final double PI = 3.14;
	private double radius;
	
	public Desk(String owner, String color, double radius) {
		super(owner, color);
		this.radius = radius;
	}
	
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return PI * Math.pow(radius, 2); 
	}
	
	public double getPerimeter() {
		return 2 * PI * radius;
	}
	public void paint() {
		System.out.printf("Desk     |%-20s|%-10s|%-10.2f|%6.2f|%6.2f\n", owner, color, radius, getArea(), getPerimeter());
	}
}
