import java.util.Scanner;

public class Hypothetical {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if (n == 1 || n == 2) {
			 System.out.print(1);
			 return;
		}
		int a1 = 1;
		int a2 = 2;
		int a = 0;
		int i = 3;
		int sum = 3;
		while(i < n) {
			a = a1 + a2;
			a1 = a2;
			a2 = a;
			i++;
			sum += a;
		}
		System.out.println("People positive with NCOV: " + (sum + 1));
	}
}
