import java.util.Scanner;

public class SumOfPair {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int space = 0;
		for (int i = 0; i<= s.length() - 1; i++) {
			if(s.charAt(i) == ' ') {
				space = i;
			}
		}
		String s1 = s.substring(0, space);
		String s2 = s.substring(space+1, s.length());
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		
		System.out.print(i1 + i2);
		
	}
}
