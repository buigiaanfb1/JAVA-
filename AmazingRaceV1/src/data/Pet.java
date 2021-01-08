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

//	@Override
//	public String toString() {
//		return "Pet [name=" + name + ", yob=" + yob + ", weight=" + weight + "]";
//	}
	
	// mỗi con pet cụ thể sẽ run() khác nhau, nên run() sẽ là abtract nha
	
	public abstract double run();
	// mỗi đứa khi về đích sẽ có cách ăn mừng chiến khác nhau hoàn toàn 
	public abstract void showRecord();

}
