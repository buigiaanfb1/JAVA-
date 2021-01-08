
public class Student {
	public String name;
	public String id;
	
	public Student() {
		name = "Bui Gia An";
		id = "SE150622";
	}

	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void showInfo() {
		System.out.println("Name: " + name + " - " + id);
	}
	
}
