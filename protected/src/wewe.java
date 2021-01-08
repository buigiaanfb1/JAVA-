import java.util.Scanner;

public class wewe {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		sb.append(sc.nextLine());
		System.out.println("Enter index you want to find");
		int i = sc.nextInt();
		System.out.println(sb.charAt(i));
	}
}
