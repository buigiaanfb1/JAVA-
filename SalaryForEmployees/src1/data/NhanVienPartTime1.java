package data;

public class NhanVienPartTime1 extends NhanVien1{
	private int gioLamViec;
	
	public NhanVienPartTime1(String ten, int gioLamViec) {
		this.ten = ten;
		this.gioLamViec = gioLamViec;
	}
	
	public String loaiNhanVien1() {
		return "Nhan Vien tre trau";
	}
	
	public void tinhLuong() {
		luong = gioLamViec * Configs1.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO;
	}
}
