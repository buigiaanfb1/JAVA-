package runtime;

import data.*;

public class Program1 {
	public static void main(String[] args) {
		// Công ty có 3 nhân viên toàn thời gian, trong đó có 1 sếp, sếp không làm thêm ngày nào
        NhanVienFullTime1 sep = new NhanVienFullTime1("Trần Văn Sếp");
        sep.setLoaiChucVu(Configs1.NHAN_VIEN_SEP);
        NhanVienFullTime1 linh1 = new NhanVienFullTime1("Nguyễn Văn Lính"); // Không làm thêm ngày nào
        NhanVienFullTime1 linh2 = new NhanVienFullTime1("Lê Thị Lính", 3); // Làm thêm 3 ngày
         
        // Công ty đang thuê 1 nhân viên thời vụ
        NhanVienPartTime1 thoiVu = new NhanVienPartTime1("Phan Thị Thời Vụ", 240); // Cô ấy siêng làm lắm
         
        // Tính lương cho nhân viên
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
         
        // In thông tin nhân viên
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
	}
}
