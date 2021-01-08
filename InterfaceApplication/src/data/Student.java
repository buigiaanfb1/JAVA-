package data;

public class Student {
	private String id;
	public String name;
	public int yob;
	public double gpa;

	public Student(String id, String name, int yob, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.yob = yob;
		this.gpa = gpa;
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

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getRank() {
		if (gpa < 5)
			return "poor";
		if (gpa < 6)
			return "average";
		else
			return "good";
	}

	public void showProfile() {
		System.out.printf("|%-8s|%-25s|%4d|%4.1f|%-10s\n", id, name, yob, gpa, getRank());
	}
}
