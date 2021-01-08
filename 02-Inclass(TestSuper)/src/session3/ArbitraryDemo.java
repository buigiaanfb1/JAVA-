package session3;

public class ArbitraryDemo {
	public double sum(double... group) {
		double S = 0;
		for (double o : group)
			S += o;
		return S;
	}

	public String concate(String... group) {
		String S = "";
		for (String o : group)
			S += o + " ";
		return S;
	}

	public static void main(String[] args) {
		ArbitraryDemo obj = new ArbitraryDemo();
		double total = obj.sum(5.4, 3.2, 9.08, 4);
		System.out.println(total);
		String line = obj.concate("I", "love", "you", "!");
		System.out.println(line);
	}
}
