package codeLearnIO;

public class Entry {
	public static void main(String[] args) {
		Student st = new Student();
		st.show();

	}

}

class Student {
	String name = "toi la long";
	int age = 19;

	public void show() {
		System.out.println("ten: " + name + " tuoi: " + age);
	}
}