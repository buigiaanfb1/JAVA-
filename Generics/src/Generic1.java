import java.util.Vector;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void print() {
		System.out.println(name + ", " + age);
	}
}

public class Generic1 {
	public static void main(String[] args) {
		Vector<Person> v = new Vector<>();
		v.add(new Person("Hoa", 23));
		v.add(new Person("Tuan", 27));
		
		for (int i = v.size() - 1; i >= 0; i--) {
			v.get(i).print();
		}
	}
}
