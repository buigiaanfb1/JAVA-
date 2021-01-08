package runtime;

import data.*;
import java.util.*;

public class Program {
	public static void main(String[] args) {
		Pet d1 = new Dog("Cậu Vàng", 1950, 10.0);
		Dog d2 = new Dog("Bê Tô", 2010, 8.0);
		Cat c1 = new Cat("Kitty", 1980, 0);
		Pet h1 = new Hamster("Mickey", 1950,4.0);
		Pet xxx = new Pet("Exciter", 2020, 0.2) {

			@Override
			public double run() {
				// TODO Auto-generated method stub
				return new Random().nextDouble() * 30;
			}

			@Override
			public void showRecord() {
				// TODO Auto-generated method stub
				System.out.printf("|Exciter|%-15s|%4d|%-5.2f|\n", name, yob, run());
			}
			};

			Pet racer[] = {d1, d2, c1, h1, xxx};
			
			for (Pet pet: racer) {
				pet.showRecord();
			}
			Motor ex = new Motor("Winner", 2020, 150, "59F2-6789");
			Motor cup = new Motor("Cub", 2020, 150, "59F2-2204");
			
			DeadRacer racerls[] = new DeadRacer[4];
			racerls[0] = (Dog)d1;
			racerls[1] = d2;
			racerls[2] = ex;
			
			racerls[3] = new DeadRacer() {

				@Override
				public double runToDead() {
					// TODO Auto-generated method stub
					return new Random().nextDouble() * 60 * 3;
				}

				@Override
				public void showToQuocGhiCong() {
					// TODO Auto-generated method stub
					System.out.printf("|MNN CTT|%-15s|%4d|%5.2f|\n", "Cô Cá", 2014, runToDead());
				}
			};
			for (DeadRacer racer1: racerls) {
				racer1.showToQuocGhiCong();
			}
	}
}

// ta dùng anonymous từ interface hoặc abstract mà không muốn thông qua 1 class trung gian thì ta dùng anonymous viết trên main 
