package data;

public class HinhChuNhat extends HinhHoc{
	public int chieuDai;
	public int chieuRong;
	
	public HinhChuNhat(int chieuDai, int chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
		ten = "Hinh Chu Nhat";
	}

	@Override
	public int tinhChuVi() {
		// TODO Auto-generated method stub
		return chuVi = 2 * (chieuDai + chieuRong);
	}

	@Override
	public int tinhDienTich() {
		// TODO Auto-generated method stub
		return dienTich = chieuDai * chieuRong;
	}

}
