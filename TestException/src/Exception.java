import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Exception {
	public static void main(String[] args) {
//		try {
//			FileOutputStream outputStream;
//			outputStream = new FileOutputStream("E://file.txt");
//			outputStream.write(65);
//			outputStream.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		Random rd = new Random();
//		int arr[] = new int[10];
//		for (int i = 0; i < 10; i++) {
//			arr[i] = rd.nextInt(100);
//		}
//
//		Scanner sc = new Scanner(System.in);
//		try {
//			System.out.println("Bạn muốn in ra phần tử mảng thứ mấy? ");
//			int index = sc.nextInt();
//			System.out.println("OK, phần tử mảng thứ " + index + " mang giá trị " + arr[index]);
//		} catch (ArrayIndexOutOfBoundsException a) {
//			System.out.println("Cannot find the value out of bound");
//		} catch (InputMismatchException i) {
//			System.out.println("Please input integer number");
//		}
//		try {
//			Scanner input = new Scanner(System.in);
//			Integer intNumber = null;
//			System.out.println("Hãy nhập vào một số nguyên: ");
//			String strNumber = input.nextLine();
//			intNumber = new Integer(strNumber);
//			System.out.println("Chuyển thành Hexa: " + Integer.toHexString(intNumber));
//		} catch (NumberFormatException e) {
//			System.out.println("Vui lòng nhập vào một số nguyên");
//		}
		
		FileOutputStream outputStream = null;
		try {
		    outputStream = new FileOutputStream("E://file.txt");
		    outputStream.write(65);
		    outputStream.close();
		} catch (FileNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}

	}
}
