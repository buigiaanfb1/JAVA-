package data;


public abstract class Pet {
	protected double weight;
	protected double speed;
	public Pet(double weight, double speed) {
		super();
		this.weight = weight;
		this.speed = speed;
	}
	public abstract double MaxSpeed();
	public void showRecord() {
		System.out.println("Dua xe thui may con Pet tre trau");
	}
}
