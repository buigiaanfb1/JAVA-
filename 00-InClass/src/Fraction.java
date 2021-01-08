
public class Fraction {
	protected int a1;
	protected int a2;
	protected int b1;
	protected int b2;

	public Fraction() {
		
	}
	public Fraction(int a1, int a2, int b1, int b2) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.b1 = b1;
		this.b2 = b2;
	}

	public void fractionAdd() {
		int a;
		int b;
		a = (a1 * b2) + (a2 * b1);
		b = a2 * b2;
//		simplify(a, b);
		System.out.println("Sum of them: " + a + "/" + b);
	}

	public void fractionSub() {
		
	}

	public void fractionMul() {

	}

	public void fractionDiv() {

	}
	
	public void simplify(int a, int b) {
		for (int i = b; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				a = a / i;
				b = b / i;
			}
		}
	}
	
//	public int gcd(int a, int b) {
//		
//	}

}
