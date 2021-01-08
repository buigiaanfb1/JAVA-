package Ex02;

public class emp_Parttime extends employee{
	private int wage;
	private int workday;
	
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public int getWorkday() {
		return workday;
	}
	public void setWorkday(int workday) {
		this.workday = workday;
	}
	
	public long calsalary() {
		return wage * workday;
	}
	
	public void displayInfo() {
		System.out.println(code + " - " + name + " - " + address + " - " + phone + " - " + calsalary());
	}
}
