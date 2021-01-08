
import java.util.*;
public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		sc.close();
		
		for (int i = number.length() ; i > 0; i--) {
			System.out.print(i);
		}
	}
}
