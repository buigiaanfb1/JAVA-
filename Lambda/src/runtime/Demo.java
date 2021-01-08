package runtime;

public class Demo {
	public static void main(String[] args) {
		//biểu thức lambda có nhiều hoặc 1 parameter
		Math sum = (a,b) -> {
			return a + b;
		};
		System.out.println(sum.add(1, 2));
		
		Math mt = new Math() {

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		
		};
		System.out.println("a + b: " + mt.add(1, 2));
	}
}
//lambda chỉ xuất hiện JDK SE 8
//nhiện vụ lớn nất của lambda là viết code tạo object từ
//interface nhanh hơn, gọn hơn
//trong 1 file chỉ có 1 class được public thôi
//mà interface là 1 abstract class nên nó k được để public
interface Math {
	public int add(int a, int b); //trong interface dù không ghi abstract thì java vẫn hiểu
								  //bạn đang viết abstract
	
}
