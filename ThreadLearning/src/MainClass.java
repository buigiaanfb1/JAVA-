import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhấn phím bất kỳ để quay số");
		sc.nextLine();
		CountTheNumberThread countingThread = new CountTheNumberThread();
		countingThread.start();
		System.out.println("Nhấn phím bất kỳ để kết thúc quay số");
		sc.nextLine();
		countingThread.end();
		System.out.println("Con số may mắn: " + countingThread.getCount());
	}
}
