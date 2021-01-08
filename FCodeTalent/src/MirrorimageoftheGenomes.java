import java.util.Scanner;

public class MirrorimageoftheGenomes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[1000];

		for (int i = 0; i <= n; i++) {
			arr[i] = sc.nextLine();
		}
		sc.close();
		for (int i = 0; i <= n; i++) {
			for (int j = arr[i].length() - 1 ; j >= 0; j--) {
				System.out.print(arr[i].charAt(j));
				if (j == 0) System.out.println();
			}

		}
	}
}
