package data;

public class Fraction {
	protected int a1;
	protected int a2;
	protected int b1;
	protected int b2;
	protected int a;
	protected int b;

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
		this.a = (a1 * b2) + (a2 * b1);
		this.b = a2 * b2;
		simplify(a, b);
		System.out.println("Sum of them: " + a + "/" + b);
	}

	public void fractionSub() {
		this.a = (a1 * b2) - (a2 * b1);
		this.b = a2 * b2;
		simplify(a, b);
		if (a == b || a == Math.abs(b) || b == Math.abs(a)) {
			System.out.println("Substract of them: " + a);
		} else {
			System.out.println("Substract of them: " + a + "/" + b);
		}

	}

	public void fractionMul() {
		this.a = a1 * b1;
		this.b = a2 * b2;
		simplify(a, b);
		System.out.println("Mul. of them: " + a + "/" + b);
	}

	public void fractionDiv() {
		this.a = a1 * b2;
		this.b = a2 * b1;
		simplify(a, b);
		System.out.println("Div. of them: " + a + "/" + b);
	}

	public void simplify(int a, int b) {
		for (int i = b; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				this.a = a / i;
				this.b = b / i;
				break;
			}
		}
	}

	public int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, b%a);
	}
}