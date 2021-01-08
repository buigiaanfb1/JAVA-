import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AirportConstruction {
	public static void main(String[] args) throws IOException {
		check();
		System.exit(0);
	}

	public static void check() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = br.readLine().split(" ");
		int[] arr = new int[1000];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		sc.close();
		int amount = 0;
		int index = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i; j < n; j++) {
				if (arr[j] >= 0) {
					if (arr[j + 1] >= arr[j]) {
						count++;
					} else
						break;
				}
			}
			if (count >= amount) {
				amount = count;
				index = i;

			}
		}
		if (amount > 2) System.out.println((index + 1) + " " + (amount + 1));
		else System.out.print(-1);
	}
}
