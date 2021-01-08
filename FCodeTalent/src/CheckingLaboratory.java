import java.util.Scanner;

public class CheckingLaboratory {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrInput = new int[n];

		for (int i = 0; i < n; i++) {
			arrInput[i] = sc.nextInt();
		}
		sc.close();
		int[] arr1 = new int[Integer.SIZE];
		int[] arr2 = new int[Integer.SIZE];
		int[] arr3 = new int[Integer.SIZE];
		int[] arr4 = new int[Integer.SIZE];
		int count4 = 0;
		int count3 = 0;
		int count2 = 0;
		int count1 = 0;
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < n; i++) {
				if (j == 0) {
					if (arrInput[i] % 4 == 0 && arrInput[i] > 0) {
						arr4[count4] = arrInput[i];
						arrInput[i] = 0;
						count4++;
					}
				}
				if (j == 1) {
					if (arrInput[i] % 3 == 0 && arrInput[i] > 0) {
						arr3[count3] = arrInput[i];
						arrInput[i] = 0;
						count3++;
					}
				}
				if (j == 2) {
					if (arrInput[i] % 2 == 0 && arrInput[i] > 0) {
						arr2[count2] = arrInput[i];
						arrInput[i] = 0;
						count2++;
					}
				}
				if (j == 3) {
					if (arrInput[i] % 4 != 0 && arrInput[i] % 3 != 0 && arrInput[i] % 2 != 0 && arrInput[i] > 0) {
						arr1[count1] = arrInput[i];
						arrInput[i] = 0;
						count1++;
					}
				}
			}
		}
		System.out.println((count1) + " " + (count2) + " " + (count3) + " " + (count4));
		for (int i = 0; i < count1; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < count2; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < count3; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < count4; i++) {
			System.out.print(arr4[i] + " ");
		}
	}
}
