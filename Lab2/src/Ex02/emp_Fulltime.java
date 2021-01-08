package Ex02;

public class emp_Fulltime extends employee{
	private int salary;
	private int Comission;
	private int bonus;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getComission() {
		return Comission;
	}
	public void setComission(int comission) {
		Comission = comission;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public long calsalary() {
		return salary + Comission + bonus;
	}
	public void displayInfo() {
		System.out.println(code + " - " + name + " - " + address + " - " + phone + " - " + calsalary());
		}
}
