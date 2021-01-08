package data;

import java.util.*;

public class HinhVuong extends HinhChuNhat{
	public HinhVuong() {
		ten = "Hinh Vuong";
	}
	
	public void nhapCanh() {
		Scanner sc = new Scanner(System.in);
		dai = rong = sc.nextFloat();
	}
}
