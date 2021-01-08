import java.util.Scanner;

public class kwH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int elec = sc.nextInt();
		int total;
				
	total =	elec > 100 ? (elec > 150 ? (elec > 200 ? (total = 313600 + 500 * (elec - 200)) : (total = 1651 * (elec - 150) + 189400)) : (total = (1304 * (elec - 100))) + 124200) : (total = 1242 * elec);
	
	System.out.print(total);
	}
}
