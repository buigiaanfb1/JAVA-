import java.util.Scanner;

public class ProgramFraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		Fraction ft = new Fraction(a1, a2, b1, b2);
		ft.fractionAdd();
		System.out.println(1 + 2);
	}
}
