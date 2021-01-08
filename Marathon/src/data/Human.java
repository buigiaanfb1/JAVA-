package data;
import java.util.*;


public class Human extends Marathoner{
	public static final double MAX_SPEED = 30.0;
	
	public Human(String name, double height, double weight) {
		super(name, height, weight);
		// TODO Auto-generated constructor stub
	}
	
	public double run() {
		Random rd = new Random();
		return rd.nextInt(10) + 10;
	}

	@Override
	public double runToDead() {
		// TODO Auto-generated method stub
		return run() + MAX_SPEED;
	}

	@Override
	public void showRecord() {
		// TODO Auto-generated method stub
		System.out.printf("|HUMAN    |%-15s|%4.2f|%4.2f|%-5.2f|\n", name, height, weight, runToDead());
	}
	
}
