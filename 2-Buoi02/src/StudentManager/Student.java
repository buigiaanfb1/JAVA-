package StudentManager;

public class Student {
	public String code;
	public String fullname;
	public int age;
	public String phone;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void info() {
		System.out.println("Code: " + code);
		System.out.println("Fullname: " + fullname);
		System.out.println("Age: " + age);
//		System.out.println("Phone: " + phone);
	}
}
