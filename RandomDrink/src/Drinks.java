
import java.util.*;

public class Drinks {
	public static void main(String[] args) {
		int amountDrinks;
		List<String> ds = new ArrayList<>();
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input you drink you have left: ");
		amountDrinks = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i <= amountDrinks - 1; i++) {			
			System.out.print("Type " + (i + 1) + ": ");
			String nameDrinks = sc.nextLine();
			ds.add(nameDrinks);
		}
		
		System.out.println("Congratulations you need to drink: " + ds.get(rd.nextInt(4)));
		}

}
