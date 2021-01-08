package runtime;

import data.RightTriangle;
import data.Triangle;

public class Program {
	public static void main(String[] args) {
		Triangle ds[] = new Triangle[4];
		ds[0] = new Triangle("Cha", "Đỏ", 3, 4, 5);
		ds[1] = new Triangle("Chú", "Vàng", 2, 3, 4);
		ds[2] = new Triangle("Dượng", "Hường", 7, 8, 13);
		ds[3] = new RightTriangle("Con", "Đỏ", 3, 2);
		for (Triangle o: ds) {
			o.paint();
		}
	}
}
