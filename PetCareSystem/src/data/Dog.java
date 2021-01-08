package data;

import java.util.Random;

public class Dog extends Pet{
	public static final double MAX_SPEED = 40;
	public Dog(String id, String name, int yob, double weight) {
		super(id, name, yob, weight);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public double run() {
		// TODO Auto-generated method stub
		return new Random().nextDouble() * MAX_SPEED;
	}

	@Override
	public void showProfile() {
		// TODO Auto-generated method stub
		String msg;
		msg = String.format("|%6s|%-15s|%4d|%4.1f|%4.1f", id, name, yob, weight, run());
		System.out.println(msg);
	}
	
	
}
