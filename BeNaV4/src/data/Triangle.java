package data;

public class Triangle extends Shape {
	protected double a;
	protected double b;
	protected double c;
	
	
	public Triangle(String owner, String color, double a, double b, double c) {
		super(owner, color); //tương ứng với new Shape 
		this.a = a;
		this.b = b;
		this.c = c;
	}


	@Override
	public double getArea() {
		double p = getPerimeter()/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}


	@Override
	public double getPerimeter() {
		return a + b + c;
	}


	@Override
	public void paint() {
		System.out.printf("Triangle |%-20s|%-10s|%4.2f|  %4.2f|%4.2f|%6.2f|%6.2f\n", owner, color, a, b, c, getArea(), getPerimeter());
		
	}


	

}
