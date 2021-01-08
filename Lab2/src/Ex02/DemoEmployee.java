package Ex02;

public class DemoEmployee {
	public static void main(String[] args) {
		emp_Fulltime emp01 = new emp_Fulltime();
		emp01.setCode("SE150622");
		emp01.setName("Bui Gia An");
		emp01.setAddress("175/21 Nguyen Van Tang - District 9, HCMC");
		emp01.setPhone("0948451791");
		emp01.setSalary(5000);
		emp01.setComission(200);
		emp01.setBonus(500);
		emp01.displayInfo();
		
		System.out.println("-------------------------------------------------------");
		emp_Parttime emp02 = new emp_Parttime();
		emp02.setCode("0002");
		emp02.setName("Nguyen Thuy Trang");
		emp02.setAddress("20- Quang Trung - Tan Canh Hiep Ward, District 12, HCMC");
		emp02.setPhone("0907444333");
		emp02.setWage(25);
		emp02.displayInfo();
		
	}
}
