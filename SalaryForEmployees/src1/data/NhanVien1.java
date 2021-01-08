package data;

public class NhanVien1 {
	protected String ten;
	protected long luong;
	
	public NhanVien1() {
		
	}
	
	public NhanVien1(String ten) {
		this.ten = ten;
	}
	
	protected String loaiNhanVien1() {
		return "";
	}
	
	public void xuatThongTin() {
		System.out.println("Ten: " + ten);
		System.out.println("- Loại nhân viên: " + loaiNhanVien1());
		System.out.println("Luong: " + luong);
	}
	
	
}
