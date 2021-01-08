package session3;

public class Student {
	protected String code;
	protected String name;
	protected String birthday;
	protected int age;
	
	public Student(String code, String name, String birthday, int age) {
		super();
		this.code = code;
		this.name = name;
		this.birthday = birthday;
		this.age = age;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	protected void printInfo() {
		System.out.println("Code: " + code + " ,Name: " + name + " ,Birthday: " + birthday + ", Age: " + age);
	}
}
