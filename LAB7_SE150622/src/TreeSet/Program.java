package TreeSet;

import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		 TreeSet<Student> treeSet = new TreeSet<Student>();
	        Student st1 = new Student("Bui Gia An", 19, "Long An");
	        Student st2 = new Student("An Gia", 19, "DakLak");
	        Student st3 = new Student("Nguyen Thi Teo", 20, "Da Nang");
	        Student st4 = new Student("Nguyen Chi Tai", 21, "Long Bien");

	        treeSet.add(st1);
	        treeSet.add(st2);
	        treeSet.add(st3);
	        treeSet.add(st4);

	        for (Student o : treeSet) {
	            System.out.println(o.toString());
	        }
	}
}
