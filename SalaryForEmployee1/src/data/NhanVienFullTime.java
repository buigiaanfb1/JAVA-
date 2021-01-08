package data;

public class NhanVienFullTime extends NhanVien{
	private int ngayLamThem;
	private int loaiChucVu;
	
	public NhanVienFullTime (String ten) {
		this.ten = ten;
	}

	public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {
		super();
		this.ten = ten;
		this.ngayLamThem = ngayLamThem;
		this.loaiChucVu = loaiChucVu;
	}
	
	public void setLoaiChucVu(int loaiChucVu) {
		this.loaiChucVu = loaiChucVu;
	}
	
	
	
	@Override
	public String loaiNhanVien() {
		// TODO Auto-generated method stub
		if (loaiChucVu == Configs.NHAN_VIEN_LINH)
			return "Nhan vien toan thoi gian" + (ngayLamThem > 0 ? " (co lam them)" : "");
		else
			return "SEP" + (ngayLamThem > 0 ? " (co lam them)" : "");
	}

	public void tinhLuong() {
		if (loaiChucVu == Configs.NHAN_VIEN_LINH)
			luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + (ngayLamThem * Configs.LUONG_NHAN_THEM_MOI_NGAY);
		if (loaiChucVu == Configs.NHAN_VIEN_SEP)
			luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + (ngayLamThem * Configs.LUONG_NHAN_THEM_MOI_NGAY);
	}
	
}
