package data;

public class Rectangle extends Shape{
	protected double width;
	protected double length;
	
	
	public Rectangle(String owner, String color, double width, double length) {
		super(owner, color);
		this.width = width;
		this.length = length;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.width * this.length;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (this.length + this.width) * 2;
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.printf("Rectangle|%-20s|%-10s|%4.2f|%4.2f|%6.2f|%6.2f\n", owner, color, width, length, getArea(), getPerimeter());
		
	}
// vuong --> chữ nhật
// tam giac và tròn ---> shape
}
