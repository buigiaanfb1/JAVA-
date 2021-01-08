package runtime;
import data.*;

public class Program {
	public static void main(String[] args) {
		Pet d1 = new Dog(20,10);
		Pet d2 = new Dog(20,10);
		Pet c1 = new Cat(20,10);
		Pet h1 = new Cat(20,10);
		
		//  tạo mảng nhét hết đán này vào
		Pet racer[] = {d1,d2,c1,h1};
		
		for (Pet o : racer) {
			o.showRecord();
		}
		
	}
}
