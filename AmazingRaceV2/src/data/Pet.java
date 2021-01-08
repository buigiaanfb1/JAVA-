package data;

public abstract class Pet {
	protected String name;
	protected int yob;
	protected double weight;
	
	public Pet(String name, int yob, double weight) {
		super();
		this.name = name;
		this.yob = yob;
		this.weight = weight;
	}
	
	public abstract double run();
	public abstract void showRecord();
}
