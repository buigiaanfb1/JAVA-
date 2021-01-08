
public class Student implements Comparable{
	int no;
	String name;
	
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	
	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student st = (Student) o;
		if (no > st.getNo()) return 1;
		else if (no == st.getNo()) return 0;
		else return -1;
	}

}
