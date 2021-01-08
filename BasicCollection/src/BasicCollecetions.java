import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BasicCollecetions {
	public static void main(String[] args) {
		//playWithInteger();
		//sortInteger();
		//swapInsideList();
		playWithSet();
	}
		
	
	
	public static void playWithInteger() {
		int fb1[] = {1,1,2,3,5,8,13,21};
		
		int fb2[] = new int[8];
		
		Integer fb3[] = {1,1,2,3,5,8};
		// boxing roi
		// vi fb3[0] = 1;
		
		// Mảng số nguyên int thì đỡ hao ram hơn mảng
		// objects
		// tất cả các cách tạo trên đều bị giới hạn về kích 
		ArrayList<Integer> fb = new ArrayList<Integer>();
		// không lưu dữ liệu kiểu primitive;
		//fb trỏ vùng new chà bá, y chang fb1 fb2 fb3;
		// fb là con trỏ
		// trỏ đến vùng biến má mì, tú bà/tú ông, quản lí 1 dám
		// co trỏ Interger;
		fb.add(new Integer(1));
		// đưa toạ độ vùng new cho tao, tao cất vào fb
		// trong con trỏ fb[0];
		fb.add(1);// đưa toạ độ vùng new có chứa core là 1
		//cho con trỏ fb[1];
		//fb[1] đảm nhiệm vị trí sợi dây để dắt tới con chó
		fb.add(2);
		fb.add(3);
		fb.add(5);
		fb.add(8);
		fb.add(13);
		fb.add(21);
		
		System.out.println("FB :" + fb);
		
		for (int i = 0; i <= fb.size() -1 ; i++) {
			System.out.println(fb.get(i));
		}
		
		for (Integer o : fb) {
			System.out.println(o);
		}
	}
	
	public static void sortInteger() {
		ArrayList<Integer> ds = new ArrayList<>();
		
		ds.add(1);
		ds.add(-1);
		ds.add(10);
		ds.add(30);
		ds.add(40);
		ds.add(13);
		ds.add(20);
		System.out.println("DS :" + ds);
		
		Collections.sort(ds);
		System.out.println("DS :" + ds);
		
	}
	
	public static void swapInsideList() {
		ArrayList<Integer> ds = new ArrayList<>();
		ds.add(10000);
		ds.add(50);
		System.out.println(ds);
		// toString is a very special function, tong hop data
		// va bien tat ca data ben6 trong object thanh2 chuoi64
		//  vi trong ds chua cung 1 loai du lieu
		Integer tmp = ds.get(0);
		ds.set(0, ds.get(1));
		ds.set(1, tmp);
		System.out.println(ds);
	}
	
	public static void playWithSet() {
		//set la cai gio cam trung
		//tro trung 1 vung new, khong chap nhan 2 chang tro 1 nang
		Set<Integer> ds = new HashSet<>();
		ds.add(1000);
		ds.add(1000);
		ds.add(-500);
		ds.add(10);
		
		System.out.println(ds);
	}
}
