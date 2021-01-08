package data;

public class HinhHoc {
	public float PI = 3.14f;
	public String ten;
	public float chuVi;
	public float dienTich;
	public float theTich;
	
	public HinhHoc() {
		
	}
	public void xuatTen() {
		System.out.println("===== " + ten + " =====");
	}
	public void inChuVi() {
		System.out.println("Chu Vi: " + chuVi);
	}
	public void inDienTich() {
		System.out.println("Dien Tich: " + dienTich);
	}
	public void inTheTich() {
		System.out.println("The Tich: " + theTich);
	}
	
}
