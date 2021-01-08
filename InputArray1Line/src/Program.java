import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int a[] = new int[100];
		for (int i = 0; i < 10; i++) {
			a[i] = Integer.parseInt(s[i]);
		}

		System.out.println(a[2]);
	}

}