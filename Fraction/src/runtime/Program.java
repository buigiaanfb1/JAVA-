package runtime;

import java.util.Scanner;

import data.Fraction;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numerator of the first fraction: ");
		int a1 = sc.nextInt();
		System.out.print("Enter denominator of the first fraction: ");
		int a2 = sc.nextInt();
		System.out.print("Enter numerator of the second fraction: ");
		int b1 = sc.nextInt();
		System.out.print("Enter denominator of the second fraction: ");
		int b2 = sc.nextInt();
		Fraction ft = new Fraction(a1, a2, b1, b2);
		ft.fractionAdd();
		ft.fractionSub();
		ft.fractionMul();
		ft.fractionDiv();
	}
}
