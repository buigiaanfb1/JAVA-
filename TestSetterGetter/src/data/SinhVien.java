package data;

public class SinhVien {
	private String name;
	private String age;
	
	public String getTen() {
		return name;
	}
	public void setTen(String name) {
		if (name == null || name.isEmpty()) this.name = null;
		else this.name = name;
	}
	public String getTuoi() {
		return age;
	}
	public void setTuoi(int age) {
		if (age >= 18) this.age = String.valueOf(age);
		else this.age = null;
	}
}
