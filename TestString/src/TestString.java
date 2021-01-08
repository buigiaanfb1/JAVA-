
import java.util.Scanner;

public class TestString {
	public static void main(String[] args) {
//		String s1 = "Bui Gia An";
//		String s2 = "Bui Gia An";
//
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s1.compareTo(s2));
//	
////	Giả sử bạn lấy đâu đó ra hai chuỗi “1.5.5.3” và “1.5.6.1”,
////	đây chính là hai version của ứng dụng. Bằng cách nào bạn có thể 
////	in ra console version nào là version mới nhất?
//		String s3 = "1.5.5.3";
//		String s4 = "1.5.6.1";
//		
//		if (s3.compareTo(s4) > 0) System.out.println("Version " + s3 + "is the latest");
//		else if (s3.compareTo(s4) == 0) System.out.println("They have the same verion");
//		else System.out.println("Version " + s4 + " is the latest");
//		
//		String s5 = "Tiểu Hổ";
//		String s6 = "trẻ trâu";
//		System.out.println(s5 + " " + s6);
//		System.out.println(s5.concat(s6));
//		
//		String s7 = "Tiểu Hổ trẻ trâu";
//		System.out.println(s7.substring(5));
//		
//		String s8 = "Tiểu Hổ trẻ trâu";
//		System.out.println(s8.substring(5, s8.length()));
//		
//		String s9 = "Tiểu Hổ trẻ trâu";
//		System.out.println(s9.toUpperCase());
//		
//		String s10 = "      Tiểu Hổ trẻ trâu       ";
//		System.out.println(s10.trim());
//		
//		String s11 = "Tiểu Hổ trẻ trâu";
//		String s12 = "Tiểu";
//		String s13 = "trẻ";
//		System.out.println(s11.startsWith(s12));
//		System.out.println(s11.endsWith(s13));
//		
//		String s14 = "Tiểu Hổ trẻ trâu";
//		s14 = s14.replace("Tiểu Hổ", "Small Lion");
//		System.out.println(s14);
//		
//		Scanner sc = new Scanner(System.in);
		StringBuffer str1 = new StringBuffer("01234567");
		System.out.println(str1);
		str1.append("ABC");
		System.out.println(str1);
		str1.insert(2, "Viet Nam");
		System.out.println(str1);
		
		String s3 = " How Are You     !";
		String delim ="[au\\s]+";
		Scanner sc3 = new Scanner(s3);
		sc3.useDelimiter(delim);
		while(sc3.hasNext()) System.out.println(sc3.next());
		
		
		
		
		
	}
}
