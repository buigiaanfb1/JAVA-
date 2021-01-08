package data;

import java.util.*;

public class HinhChuNhat extends HinhHoc{
	public float dai;
	public float rong;
	
	public HinhChuNhat() {
		ten = "Hinh Chu Nhat";
	}
	
	public void nhapChieuDai() {
		Scanner sc = new Scanner(System.in);
		dai = sc.nextFloat();
	}
	
	public void nhapChieuRong() {
		Scanner sc = new Scanner(System.in);
		rong = sc.nextFloat();
	}
	
	public void tinhChuVi() {
		chuVi = 2 * (dai + rong);
	}
	
	public void tinhDienTich() {
		dienTich = dai * rong;
	}
}
