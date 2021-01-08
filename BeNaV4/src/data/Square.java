package data;

public class Square extends Rectangle{
	
	
	public Square(String owner, String color, double edge) {
		super(owner, color, edge, edge);
		// TODO Auto-generated constructor stub
	}

	public void paint() {
		System.out.printf("Square   |%-20s|%-10s|%4.2f|%4.2f|%6.2f|%6.2f\n", owner, color, width, length, getArea(), getPerimeter());
	}
	
	public void drawTitle() {
		System.out.printf("Vẽ\n");
	}
}
