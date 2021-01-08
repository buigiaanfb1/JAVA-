
public class StaticCodeDemo {
	static int N=10;
	int x = 5, y = 7;
	
	static {
		System.out.println("Static code: " + N);
	}
	int sum() {
		return x + y;
	}
	static {
		System.out.println("Static code: HEllo");
	}
	
	public static void main(String[] args) {
		System.out.println(StaticCodeDemo.N);
		StaticCodeDemo obj = new StaticCodeDemo();
		System.out.println(obj.sum());
	}
}
	
