package runtime;

import java.util.Random;

import data.*;


public class Program {
	public static void main(String[] args) {
		Shape ds[] = new Shape[4];
		ds[0] = new Rectangle("Tía", "Hường", 2, 3);
		ds[1] = new Square("Con", "Hồng", 3);
		
		Triangle tamGiac = new Triangle("Chị", "Đỏ", 3, 4, 5);
		ds[2] = tamGiac;
		ds[3] = new Desk("Anh", "Tím", 3);
		for (Shape o: ds) {
			o.paint();
		}

// muốn có object ta cần khuôn (không quan tâm quan hệ)
// dùng new để lôi cái khuôn ra
// biến con trỏ = new ??? trỏ đến vủng new

		// Dog chihuahua = new Dog(???);
		// object còn gì khác không?
		// khuôn, new, biến con trỏ
		// Square vuong = new Square(???);
		// khai con và new con

// 		xét về góc độ vùng nhớ new của con
//		nó là 1 vùng new con chứa vùng new cha
// ==> vùng new con to hơn new cha
//		cha có trước mới có con
// ==> ý nghĩa: phục hồi lại những thứ của con như khi chưa kế 
//		nhờ super mà con lấy lại được những gì mà nó đứng 1 mình vẫn làm được
//		không cần làm lại những gì người khác đã làm 
//	object con nhìn sau vài bên trong sẽ là
// Square s1 = new Square();
//				new Rectangle();//super
//	vùng new con = new cha + code riêng của con
//				super
//					di truyền + biến dị extends
//						inherit


// nếu cha là abstract thì sao:
//		new cha + code của riêng con
//		implements + code của riêng con

// bình thường ta muốn tạo object từ shape ta sẽ tạo 1 class trung gian (Rectangle, Triangle, Desc)
// nêu ta ngoan cố k tạo class trung gian thì lúc này ta sẽ tạo ra 1 anonymous class// mượn gió bẻ măng
// mượn shape tạo object
// giá phải trả cho kĩ thuật này là: không nhân bản được trừ khi copy.
// làm đồ hoạ, nút bấm 

// đi ăn cưới, nàh hàng nơi cô dâu chú rể tổ chức đám cưới
// Thực Khách Hoàng = new Thực Khách(Áo đẹp, Quần Tây, Phong bì 500k);
// Thực Khách Tùng = new Thực Khách(Áo đẹp, Quần Tây, Phong bì("mốt đến lượt tui đi lại)

// 1 thằng chen ngang vào hệ thống và chưa định hình rõ
// Drift/ Reflection(soi gương);

	// bé Na cắt 1 hình mẹ gì đó mà méo biết là tạo class gì, nên hong đặt được tênnn
// nhưng vẫn tính được diện tích và chu vi dù là nó hơi căng 
		Shape xxx = new Shape("Bé Na", "7 màu") { //class anonymous(inner class/ nested class)

			@Override
			public double getArea() {
				Random rd = new Random();
				return rd.nextDouble() * 50;
			}

			@Override
			public double getPerimeter() {
				return new Random().nextDouble()*100;
			}

			@Override
			public void paint() {
				System.out.printf("xxx      |%-20s|%-10s|%-4.2f|%-4.2f\n", owner, color, getArea(), getPerimeter());
			}
		};
		xxx.paint();
		
		Rectangle r1 = new Rectangle("r1", "red", 4, 5);
		r1.paint();
		
		Rectangle r2 = new Square("r2", "Tím", 4);
		
		Square s1 = new Square("r3", "Đỏ", 4);
		
		((Square)r2).drawTitle();
		
		
	}
}


