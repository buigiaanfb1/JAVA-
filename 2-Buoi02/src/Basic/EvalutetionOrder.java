package Basic;

public class EvalutetionOrder {
	public static void main(String[] args) {
		int[] a = { 4, 4 };
		int b = 1;
		a[b] = b = 5;
		System.out.println("a: " + a[0] + ", " + a[1]);
	}
}
