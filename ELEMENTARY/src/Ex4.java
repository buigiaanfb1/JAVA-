import java.util.*;
public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int count = 0;
		int random = rd.nextInt(9) + 1;
		do {
			System.out.println("Please guess the number in range 1 to 10: ");
			int guess = sc.nextInt();
			count++;
			
			if (guess == random) {
				System.out.println("Congrats! You guessed the number");
				return;
			}
		}while(count < 3);
		System.out.println("You lose");
	}
}
