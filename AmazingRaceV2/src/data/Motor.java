package data;
import data.*;
import java.util.*;

public class Motor implements DeadRacer{
	//motor muốn kết nối với các Racer, motor muốn là
	//1 member trong DeadRacer, gia nhập hội nhóm đua xe
	// tức là implements
	private String model;
	private int yob;
	private double volume;
	public static final double MAX_SPEED = 230;
	private String vin; //vehicle identifier 
	public Motor(String model, int yob, double volume, String vin) {
		super();
		this.model = model;
		this.yob = yob;
		this.volume = volume;
		this.vin = vin;
	}
	@Override
	public double runToDead() {
		// TODO Auto-generated method stub
		return new Random().nextDouble() * MAX_SPEED * 2;
	}
	@Override
	public void showToQuocGhiCong() {
		// TODO Auto-generated method stub
		System.out.printf("|Motor  |%-15s|%11s|%4s|%-5.2f|\n", model, vin, yob, runToDead());
	}
	
	
	
}
