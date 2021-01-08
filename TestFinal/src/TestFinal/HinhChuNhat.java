package TestFinal;

import java.util.*;

public class HinhChuNhat extends HinhHoc{
	public float chieuDai;
	public float chieuRong;
	
	public HinhChuNhat() {
		name = "Hinh Chu Nhat";
	}
	public float tinhDienTich() {
		Scanner sc = new Scanner(System.in);
		chieuDai = sc.nextFloat();
		chieuRong = sc.nextFloat();
		return dienTich = chieuDai * chieuRong;
	}
}
