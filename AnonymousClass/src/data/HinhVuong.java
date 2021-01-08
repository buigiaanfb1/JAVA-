package data;

public class HinhVuong extends HinhHoc{

	public int chieuDai;
	public int chieuRong;
	
	public HinhVuong(int chieuDai, int chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
		ten = "Hinh Vuong";
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
