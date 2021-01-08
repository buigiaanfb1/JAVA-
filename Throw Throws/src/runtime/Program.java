package runtime;

import java.util.InputMismatchException;
import java.util.Scanner;

import data.ErrorCheckingException;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				int tuoi = nhapTuoiNhanVien();
				System.out.println("Your age is: " + tuoi);
				break;
			} catch (ErrorCheckingException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static int nhapTuoiNhanVien() throws ErrorCheckingException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int tuoi = 0;
		try {
			tuoi = sc.nextInt();
			if (tuoi < 0)
				throw new ErrorCheckingException("Your age must bigger than 0");
		} catch (InputMismatchException e) {
			throw new ErrorCheckingException("Your age must be a number");
		}
		return tuoi;
	}
}
