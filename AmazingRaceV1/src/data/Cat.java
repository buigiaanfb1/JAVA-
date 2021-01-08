package data;
import java.util.Random;

public class Cat extends Pet {
	
	// nếu không có đặc tính nào khác cha thì thui, nếu có thì liệt kê ra
	// giống như disk có radius
	// tốc độ tối đa là một đặc tính của riêng Dog
	
	public static final double MAXSPEED = 60.0d;
	
	public Cat(String name, int yob, double weight) {
		super(name, yob, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double run() {
		// TODO Auto-generated method stub
		Random rd = new Random();
		return rd.nextDouble() * MAXSPEED;
	}

	@Override
	public void showRecord() {
		// TODO Auto-generated method stub
		System.out.printf("|CAT    |%-15s|%4d|%4.2f |%4.2f|\n", name, yob, weight, run());
	}
	
}
