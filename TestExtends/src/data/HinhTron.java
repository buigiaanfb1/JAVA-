package data;

import java.util.*;

public class HinhTron extends HinhHoc{
	public float banKinh;
	
	
	public HinhTron() {
		ten = "Hinh Tron";
	}
	public void nhapBanKinh() {
		Scanner sc = new Scanner(System.in);
		banKinh = sc.nextFloat();
	}
	public void tinhChuVi() {
		chuVi = 2 * banKinh * PI;
	}
	public void tinhDienTich() {
		dienTich =  PI * (banKinh * banKinh);
	}
}
