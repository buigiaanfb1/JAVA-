package data;

public class Employee implements Comparable{
	private String code;
	private String name;
	private int salary;
	
	public Employee(String code, String name, int salary) {
		super();
		this.code = code;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.getCode().compareTo(((Employee)o).getCode());
	}
	
	public void print() {
		System.out.format("|%-20s|%-20s|%-6d\n", code, name, salary);
	}

}
