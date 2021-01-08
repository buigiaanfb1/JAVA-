package runtime;

import data.*;
import java.util.*;

public class Program {
	public static void main(String[] args) {
		System.out.println("How many employee you want to add: ");
		Scanner sc = new Scanner(System.in);
		int tongNhanVien = Integer.parseInt(sc.nextLine());
		NhanVien mangNhanVien[] = new NhanVien[tongNhanVien];

		for (int i = 0; i < tongNhanVien; i++) {
			System.out.print("Tên nhân viên " + (i + 1) + ": ");
			String ten = sc.nextLine();
			System.out.print("Là nhân viên (1-Toàn thời gian; 2-Bán thời gian): ");
			int laNhanVien = Integer.parseInt(sc.nextLine());
			if (laNhanVien == 1) {
				System.out.print("Chức vụ nhân viên (1-Sếp; 2-Lính): ");
				int chucVu = Integer.parseInt(sc.nextLine());
				System.out.print("Ngày làm thêm (nếu có): ");
				int ngayLamThem = Integer.parseInt(sc.nextLine());
				mangNhanVien[i] = new NhanVienFullTime(ten, ngayLamThem, chucVu);
			} else {
				System.out.print("Giờ làm: ");
				int gioLamViec = Integer.parseInt(sc.nextLine());
				mangNhanVien[i] = new NhanVienPartTime(ten, gioLamViec);
			}
		}
			 System.out.println("\nKết quả tính lương\n");
	         
		        // Tính lương và xuất thông tin nhân viên
		        for (NhanVien nhanVien : mangNhanVien) {
		            nhanVien.tinhLuong();
		            nhanVien.xuatThongTin();
		        }
		}
	}
