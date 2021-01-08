package session3;

public class DemoSE1260 {
	public static void main(String[] args) {
		SE1260 student01 = new SE1260("SE150622", "Bui Gia An", "29/12/2001", 19, 7.5f, 9.0f);
		student01.printInfo();
		student01.printMark();
		
		System.out.println("After Update");
		student01.name = "Duckkk";
		student01.printInfo();
		student01.printMark();
	}
}
