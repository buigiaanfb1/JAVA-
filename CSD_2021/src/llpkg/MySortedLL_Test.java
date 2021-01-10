package llpkg;

public class MySortedLL_Test {
	public static void main(String[] args) {
		
		MySortedLL list = new MySortedLL();
		list.add(9, 5, 1, 2, 6, 8, 7, 3, 4, 0);
		
		MyIterator iterator = list.iterator();
		while (iterator.hasNext()) System.out.print(iterator.next() + ", ");
		System.out.println();
		
		LL_Element result = list.search(8);
		if (result != null) System.out.println("8 existed.");
		else System.out.println("8 doest'n existed.");
		
		list.remove(8);
		System.out.println("After 8 was removed");
		iterator = list.iterator();
		while (iterator.hasNext()) System.out.print(iterator.next() + ", ");
		System.out.println();
	}
}
