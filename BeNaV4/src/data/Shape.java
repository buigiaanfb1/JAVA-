package data;
//cha chứa nhân tử chung của đám con 
//attribute: owner/color/
//method: getArea(){..}
//		getPerimeter(){}
//		paint(){}
//overload không phân biệt cha con miễn là cùng tên method cùng constructor được gọi là 
//override con độ lai hàm cha 
//1 class abstract đôi khi chứa hàm abstract nhưng cũng đôi khi không chứa abstract, 
//đôi khi chứa abstract chứa hàm thường,

public abstract class Shape {
	protected String owner;
	protected String color;
	
	// tạo constructor
	public Shape(String owner, String color) {
		this.owner = owner;
		this.color = color;
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
	//getter/setter
	
	//method:
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract void paint();
	
}
