package runtime;

import java.util.Random;

import data.*;

public class Program {
	public static void main(String[] args) {
		Marathoner a1 = new Human("Gia An", 170, 55);
		Marathoner b1 = new Alien("Ta da", 210, 100);
	
		Marathoner race1[] = {a1, b1};
	
		for (Marathoner race: race1) {
			race.showRecord();
		}

			
		IMarathonDifference Difference[] = new IMarathonDifference[3];
		Difference[0] = a1;
		Difference[1] = b1;
		Difference[2] = new IMarathonDifference() {
			//public static final double MAX_SPEED = 100;
			@Override
			public double runToDead() {
				// TODO Auto-generated method stub
				Random rd = new Random();
				return rd.nextInt(90) + 10;
			}

			@Override
			public void showRecord() {
				// TODO Auto-generated method stub
				System.out.printf("|Anomaly  |%-15s|%-6.2f|%4.2f|%-5.2f|\n", "Sky Ring", 50f, 70f, runToDead());
			}
			
		};
		for (IMarathonDifference df: Difference) {
			df.showRecord();
		}
		}
	}
	
