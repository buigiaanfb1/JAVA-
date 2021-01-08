package data;
import java.util.*;

public class Dog extends Pet {
	public static final double MAXSPEED = 50.0d;

	public Dog(double weight, double speed) {
		super(weight, speed);
		// TODO Auto-generated constructor stub
	}
	public double MaxSpeed() {
		Random rd = new Random();
		return rd.nextDouble() * MAXSPEED;
	}
	@Override
	public void showRecord() {
		super.showRecord();
		// TODO Auto-generated method stub
		System.out.printf("Dog | %f | %f\n", weight, MaxSpeed());
	}
	
	
}
