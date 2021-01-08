import java.util.Scanner;

public class FindProfile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int find = sc.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i <= find; i++) {
			if (find == arr[i]) {
				System.out.print(i);
				return;
			}
		}
		System.out.println("-1");
	}

}
