package data;

public abstract class Pet implements Comparable<Pet> {
	protected String id;
	protected String name;
	protected int yob;
	protected double weight;

	public Pet(String id, String name, int yob, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.yob = yob;
		this.weight = weight;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYob() {
		return yob;
	}

	public void setYob(int yob) {
		this.yob = yob;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// tạo hàm lấy tốc độ chạy của con pet
	public abstract double run();

	// show thông tin
	public abstract void showProfile();

	@Override
	public int compareTo(Pet that) {
		// TODO Auto-generated method stub
		return this.id.compareToIgnoreCase(that.id);
	}
	// các pet tự động ganh tị và so sanh nhau dựa trên
	// id, nếu sort theo

}
