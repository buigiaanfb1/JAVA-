import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Please input your age: ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.println("Your age is: " + age);
				break;

			} catch (Exception e) {
				System.out.print("Age must be a number");
			}
		}
	}
}
