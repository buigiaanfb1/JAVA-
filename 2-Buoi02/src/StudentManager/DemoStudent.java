package StudentManager;

public class DemoStudent {
	public static void main(String[] args) {
		Student st = new Student();
		st.setCode("SE150622");
		st.setFullname("Bui Gia An");
		st.setAge(19);
		st.info();
		
		System.out.println("---------------------------------------");
		
		Student st2 = new Student();
		st.setCode("SE150623");
		st.setFullname("Micheal jackson");
		st.setAge(19);
		st.info();
		
	}
}
