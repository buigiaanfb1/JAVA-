import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class TimeSystem {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int []arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < 4; i++) {
			System.out.println(arr[i]);
		}
		long end = System.currentTimeMillis();
		System.out.println("Cố len bán nhé" + (end - start));
		
		//Display the System Time
		DateFormat dataFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		Date date = new Date();
		String day = dataFormat.format(date);
		System.out.println(day);
	}
}
