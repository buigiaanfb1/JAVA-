package data;

public class Triangle{
	protected String owner;
	protected String color;
	protected double a;
	protected double b;
	protected double c;
	
	public Triangle(String owner, String color, double a, double b, double c ) {
		this.owner = owner;
		this.color = color;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	// tính chu vi
	public double getPerimeter() {
		return a + b + c;
	}
	// tính diện tích
	public double getArea() {
		double p = getPerimeter()/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	public void paint() {
		System.out.printf("Triangle|%-15s|%-10s|%-4.1f|%-4.1f|%-6.2f|%-6.2f\n", owner, color, a, b, c, getPerimeter(), getArea());
	}
	
	
	
}
