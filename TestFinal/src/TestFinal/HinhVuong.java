package TestFinal;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
	public HinhVuong() {
		name = "Hinh Vuong";
	}
	
	public float tinhDienTich() {
		Scanner sc = new Scanner(System.in);
		chieuDai = chieuRong = sc.nextFloat();
		return dienTich = (float)Math.pow(chieuDai, 2);
	}
}
