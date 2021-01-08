package runtime;

import java.util.InputMismatchException;
import java.util.Scanner;

import data.ErrorCheckingException;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Please enter your age: ");
				int tuoi = nhapTuoiNhanVien();
				System.out.println("Your age is: " + tuoi);
				break;
			} catch (ErrorCheckingException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static int nhapTuoiNhanVien() throws ErrorCheckingException {
		Scanner sc = new Scanner(System.in);
		int tuoi = 0;
		try {
			tuoi = sc.nextInt();
			if (tuoi < 0)
				throw new ErrorCheckingException("Age must be > 0 ");
		} catch (InputMismatchException e) {
			throw new ErrorCheckingException("Age must be a number ");
		}
		return tuoi;
	}
}
