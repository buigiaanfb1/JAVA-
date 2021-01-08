package Lab01;

class Sum {
	public double num1, num2, num3, num4, num5;
	public Sum(double num1, double num2, double num3, double num4, double num5) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
	}
	public void sumOfThem() {
		System.out.printf("%f\n", num1+num2+num3+num4+num5);	
	}
	
	public void sumOfEven(int n) {
		int Sum = 0;
		for (int i =0; i < n; i++) {
			if (i%2 == 0) Sum += i;
		}
		System.out.println(Sum);
	}
	
	public static void main(String[] args) {
		Sum o1 = new Sum(1.1, 2, 4, 5, 6);
		o1.sumOfThem();
		o1.sumOfEven(10);
	}
}
