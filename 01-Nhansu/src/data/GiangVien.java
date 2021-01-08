package data;

import java.util.Scanner;

class DataGiangVien {
	private String hoTen;
	public String lopDay;
	private int namSinh;
	private double salary;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getLopDay() {
		return lopDay;
	}
	public void setLopDay(String lopDay) {
		this.lopDay = lopDay;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class GiangVien {
	public static void main(String[] args){
		DataGiangVien b = new DataGiangVien();
		Scanner sc = new Scanner(System.in);
		b.setLopDay(sc.nextLine());
		sc.close();
	}
}

