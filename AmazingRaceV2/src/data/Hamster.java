package data;

import java.util.Random;

public class Hamster extends Pet implements DeadRacer{
	
	public static final double MAX_SPEED = 10.0;

	public Hamster(String name, int yob, double weight) {
		super(name, yob, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double runToDead() {
		return run() * 3;
	}

	@Override
	public void showToQuocGhiCong() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public double run() {
		return new Random().nextDouble();
	}

	@Override
	public void showRecord() {
		System.out.printf("|Hamster|%-15s|%4d|%-5.2f|\n", name, yob, runToDead());
		
	}

}
