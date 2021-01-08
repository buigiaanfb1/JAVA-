package data;

public class NhanVienFullTime1 extends NhanVien1{
	private int ngayLamThem;
	private int loaiChucVu;
	
	public NhanVienFullTime1(String ten) {
		this.ten = ten;
		this.loaiChucVu = Configs1.NHAN_VIEN_LINH;
	}
	
	public NhanVienFullTime1(String ten, int ngayLamThem) {
		this.ten = ten;
		this.ngayLamThem = ngayLamThem;
		this.loaiChucVu = Configs1.NHAN_VIEN_LINH;
	}
	public void setLoaiChucVu(int loaiChucVu) {
		this.loaiChucVu = loaiChucVu;
	}

	@Override
	protected String loaiNhanVien1() {
		if (loaiChucVu == Configs1.NHAN_VIEN_LINH) 
			return "Nhan Vien FullTime" + (ngayLamThem > 0 ? " (Co lam them)" : "");
		else return "Sep" + (ngayLamThem > 0 ? " (Co lam them)" : "");
	}
	
	public void tinhLuong() {
		if (loaiChucVu == 1)
			luong = Configs1.LUONG_NHAN_VIEN_FULL_TIME_LINH + (ngayLamThem * Configs1.LUONG_LAM_THEM_MOI_NGAY);
		else
			luong = Configs1.LUONG_NHAN_VIEN_FULL_TIME_SEP + (ngayLamThem * Configs1.LUONG_LAM_THEM_MOI_NGAY);
		
	}
	
	
}
