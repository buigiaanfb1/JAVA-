package data;

public class NhanVienPartTime extends NhanVien{
	private int gioLamViec;
	
	public NhanVienPartTime(String ten, int gioLamViec) {
		this.ten = ten;
		this.gioLamViec = gioLamViec;
	}
	
	public String loaiNhanVien() {
		return "Nhan vien ban thoi gian";
	}
	
	public void tinhLuong() {
		luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
	}
	
}
