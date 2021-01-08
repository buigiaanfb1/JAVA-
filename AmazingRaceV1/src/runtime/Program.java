package runtime;
import data.*;

public class Program {
	public static void main(String[] args) {
		Pet d1 = new Dog("Cậu Vàng",1950,10.0);
		Pet d2 = new Dog("Bê Tô", 2010, 8.0);
		Cat c1 = new Cat("Kitty", 1980, 0);
		Pet h1 = new Hamster("Mickey", 1950, 4.0);
		
		//  tạo mảng nhét hết đán này vào
		Pet racer[] = {d1,d2,c1,h1};
		
		for (Pet o : racer) {
			o.showRecord();
		}
		
	}
}
