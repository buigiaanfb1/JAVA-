
public  class Moto {
	public void output() {
		System.out.println("this is moto class");
	}
}

class SH extends Moto {
	int speed;
	public SH(int speed) {
		this.speed = speed;
	}
	public static void main(String[] args) {
		SH s1 = new SH(120);
		s1.output();
	}
}
