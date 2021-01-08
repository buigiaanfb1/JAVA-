package data;
import java.util.Scanner;

class DataSinhVien {
	private String hoTen;
	public String lopHoc;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getLopHoc() {
		return lopHoc;
	}
	public void setLopHoc(String lopHoc) {
		this.lopHoc = lopHoc;
	}
	public float getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}
	public float getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}
	public float getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}
	public float Average() {
		return (diemToan + diemLy + diemHoa)/3;
	}
}
public class SinhVien{

	public static void main(String[] args) {
		DataSinhVien a = new DataSinhVien();
		DataGiangVien b = new DataGiangVien();
		Scanner sc = new Scanner(System.in);
		a.setHoTen(sc.nextLine());
		a.setLopHoc(sc.nextLine());
		b.setLopDay(sc.nextLine());
		a.setDiemToan(sc.nextFloat());
		a.setDiemLy(sc.nextFloat());
		a.setDiemHoa(sc.nextFloat());
		sc.close();
		
        System.out.printf("Điểm Tb: %.2f\n", a.Average());
        float point = a.Average();
        if (point < 5) System.out.print("Ngu");
        else if (point >= 5 && point < 8) System.out.print("Tạm ổn");
        else System.out.print("Giỏi");
        if (a.lopHoc.equals(b.lopDay)) {
        	System.out.println("\nThầy b dạy lớp: " + a.lopHoc);
        }
        else System.out.println("\nThầy b không dạy lớp: " + a.lopHoc);
	}
}
