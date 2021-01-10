package llpkg;

public class MyLinkedListTest {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();

		list.addFirst(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		MyIterator iterator = list.iterator();
		while (iterator.hasNext()) System.out.print(iterator.next() + ", ");
		System.out.println();
		
		LL_Element p = list.search(5);
		if (p != null) System.out.println("5 existed.");
		else System.out.println("5 DOES NOT existed.");
		
		list.addBefore(new LL_Element(55), p);
		list.addAfter(new LL_Element(555), p);
		
		iterator = list.iterator();
		while (iterator.hasNext()) System.out.print(iterator.next() + ", ");
		System.out.println();
		
		list.remove(5);
		iterator = list.iterator();
		while (iterator.hasNext()) System.out.print(iterator.next() + ", ");
		System.out.println();
		
		list.addLast(11, 12, 13, 14);
		iterator = list.iterator();
		while (iterator.hasNext()) System.out.print(iterator.next() + ", ");
		System.out.println();
		
		list.removeFirst();
		list.removeLast();
		iterator = list.iterator();
		while (iterator.hasNext()) System.out.print(iterator.next() + ", ");
		System.out.println();
	}
}
