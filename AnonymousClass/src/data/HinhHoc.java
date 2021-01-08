package data;

public abstract class HinhHoc {
	public static final float PI = 3.14f;
	public String ten;
	public int chuVi;
	public int dienTich;
	public int banKinh;
	
	public abstract int tinhChuVi();
	public abstract int tinhDienTich();
	
	public void showDetails(){
		System.out.println("==== " + ten + " ====");
		System.out.println("Chu vi " + ten + " la: " + chuVi);
		System.out.println("Dien tich " + ten + " la: " + dienTich);
	}
}
