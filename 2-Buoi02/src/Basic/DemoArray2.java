package Basic;

public class DemoArray2 {
	public static void main(String[] args) {
		int[] copyFrom = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int[] copyTo = new int[5];
		
		System.arraycopy(copyFrom, 2, copyTo, 0, 5);
		
		for (int i = 0; i < copyTo.length; i++) {
			System.out.print(copyTo[i] + "\t");
		}
	}
}
