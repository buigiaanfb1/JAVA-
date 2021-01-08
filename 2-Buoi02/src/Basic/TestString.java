package Basic;

public class TestString {
	public static void main(String[] args) {
		String s1 = "I love";
		String s2 = "you";
		String s3 = s1 + " " + s2;

		System.out.println(s3);
		s3 = s3 + 9;
		System.out.println(s3);
	}
}
