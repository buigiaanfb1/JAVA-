
public class WrapperClass {
	public static void main(String[] args) {
		int a = 10;
		//	primitive, 4 bytes trong ram được on off thành 10,000000
		//	a. là ăn đòn// là rớt môn
			Integer b = new Integer(10);
		// đổ số 10 vào bên trong core(lõi) của Integer
		// lõi của nó là 1 primitive kiểu int chiến 4 byte
		// hao ram, cần biến con trỏ b, trỏ vùng new chà bá
		// chứa lõi là 10
		// gói 1 con int có value là 10 vào 1 object tên b
		// được tạo ra từ wrapper class tên Integer
		// => boxing
			System.out.println(a);
			System.out.println(b); // gọi thầm tên em
			// tức là mày phải hiểu là tao đang nói .toString
		int c = b;  // b là con trỏ mà làm sao bằng với 1 primitive
		// vùng chà bá làm sao bằng 4 byte(toilet)
		// từ con trỏ b, unboxing(mở hộp) lấy cáu lõi ra
		// cho c(primitive) mượn value
		// unboxing xuất hiện khi cho primitive = WrapperClass
		System.out.println(c);
		int d = b;
		// xài như bình thường
		// việc unboxing hay boxing sẽ được tự động
		if (b == d) System.out.println("Bang nhau");
		else System.out.println("Khong Bang Nhau");
		int x = 500;
		Integer y = new Integer(x);
		int i = Integer.parseInt("x");
		System.out.println(i);

		
		
		
		
			
	}
}
