package data;

public abstract class Marathoner implements IMarathonDifference{
	protected String name;
	protected double height;
	protected double weight;
	
	public Marathoner(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public abstract double runToDead();

	@Override
	public abstract void showRecord();
	
}
