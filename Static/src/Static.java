
public class Static {
	public static void main(String[] args) {
		String string = "Viet Nam vo dich";
		try {
			System.out.println(string.charAt(0));
			System.out.println(string.charAt(100));
			System.out.println(string.charAt(9));
		} catch (java.lang.StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println(string.charAt(10));
	}
}
