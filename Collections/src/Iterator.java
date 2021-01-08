import java.util.Hashtable;

public class Iterator {
	public static void main(String[] args) {
		Hashtable hm = new Hashtable();
		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");
		
		java.util.Iterator iter = hm.keySet().iterator();
		while (iter.hasNext()) {
			Object key = iter.next();
			System.out.println(key + ": " + hm.get(key));
		}
	}
}