package runtime;

import java.util.*;
import data.*;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chieu dai: ");
		int chieuDai = Integer.parseInt(sc.nextLine());
		System.out.println();
		System.out.println("Nhap chieu rong: ");
		int chieuRong = Integer.parseInt(sc.nextLine());
		
		HinhChuNhat hh = new HinhChuNhat(chieuDai, chieuRong);
		hh.tinhChuVi();
		hh.tinhDienTich();
		hh.showDetails();
		
		HinhHoc HinhTron = new HinhHoc() {
			
			@Override
			public int tinhChuVi() {
				// TODO Auto-generated method stub
				return chuVi = (int) (2 * PI * banKinh);
			}

			@Override
			public int tinhDienTich() {
				// TODO Auto-generated method stub
				return dienTich = (int) (PI * Math.pow(banKinh, 2));
			}	
		};
		System.out.print("Nhap ban kinh: ");
		HinhTron.banKinh = Integer.parseInt(sc.nextLine());
		HinhTron.ten = "Hinh Tron";
		HinhTron.tinhChuVi();
		HinhTron.tinhDienTich();
		HinhTron.showDetails();
		
	}
}
