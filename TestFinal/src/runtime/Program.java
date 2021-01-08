package runtime;

import TestFinal.*;

public class Program {
	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
		hcn.inTen();
		hcn.tinhDienTich();
		hcn.inDienTich();
		
		HinhVuong hv = new HinhVuong();
		hv.inTen();
		hv.tinhDienTich();
		hv.inDienTich();
	}
}
