
public class Constructor {
	int x;
	int  y;
	public Constructor(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void output() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	public static void main(String[] args) {
		Constructor ct1 = new Constructor(5, 10);
		ct1.output();
	}
}
