import java.util.StringTokenizer;

public class DemoString {
	public static void main(String[] args) {
		String str1 = new String("Do It Now");
		// khởi tạo str2 tham chiếu tới str1
		String str2 = str1; // unboxing
		// String là 1 kiểu dữ liệu rất đặc biệt
		// String là immutable(là class không có getter/setter)
		// (bất kì hành động nào của String đều tạo ra object mới hết)
		// và vì nó đẻ ra object mới khi xài hàm nên phải hứng
		str1 = str1.concat("-Ngay và luôn");
		System.out.println(str1);
		System.out.println(str2);
		// giống C thôi, tuần tự

		/*
		 * StringBuilder và StringBuffer đều là mutable, có nghĩa là chuỗi lưu trong 2
		 * object này có thể bị sửa đổi thông tin qua việc gọi hàm nằm bên trong object
		 */
		StringBuilder msg1 = new StringBuilder("Do It Now StringBuilder");
		StringBuilder msg2 = msg1;
		// hành động trên là hành động mượn địa chỉ
		// msg = "hello"; // không được như vậy đối với StringBuilder
		msg1.append(" - Ngay và luôn");
		System.out.println(msg1);
		System.out.println(msg2);
		// không tuần tự, dưới đổi thì trên đổi
		// đồng bộ

		/* StringTokenizer */

		String information = "SE130390|An đẹp trai|2001|9.9";
		StringTokenizer st = new StringTokenizer(information, "|");
		System.out.println(information);
		while (st.hasMoreTokens() == true) {
			System.out.println(st.nextToken());
		}
		System.out.println("information = " + information);
		//playWithStringComparison();
		chamVoCuc();
	}
	
	public static void playWithStringComparison() {
		String s0 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");
		String s1 = "BÉ HỨA HỌC HÀNH CHĂM NGOAN";
		String s2 = "BÉ HỨA HỌC HÀNH CHĂM NGOAN";
		String s3 = "bé hứa học hành chăm ngoan";
		String s4 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");
		String s5 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");
		
		if (s0 == s1) System.out.println("bằng nhau");
		else System.out.println("không bằng");
		
		}
	
	public static void chamVoCuc() {
		String msg = "Xin chào ngày mới";
		// pool
		// chắc chắn có vùng new String();
		// 
		String msgU = msg.toUpperCase();
		// msg.toUpperCase(); return ra 1 chuỗi mới được upper
		// sau đó msgU hứng chuỗi này và msg vẫn bình thường
		msgU = msg.toLowerCase().toLowerCase().toUpperCase();
		
	}
}
