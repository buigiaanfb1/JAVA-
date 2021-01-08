package data;

public class NhanVien {
	protected String ten;
	protected long luong;
	
	public NhanVien() {
		
	}
	
	public NhanVien(String ten) {
		this.ten = ten;
	}
	
	protected String loaiNhanVien() {
		return "";
	}
	
	public void tinhLuong() {
		
	}
	
	public void xuatThongTin() {
		System.out.println("=== " + ten + " ===");
		System.out.println("Chuc vu: " + loaiNhanVien());
		System.out.println("Luong: " + luong);
	}
	
}
