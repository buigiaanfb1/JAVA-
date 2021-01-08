package runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import data.Employee;

public class Program {
	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			menu();
			System.out.print("What do you want to do: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Employee employee = new Employee();
				employee.inputInfo();
				employeeList.add(employee);
				break;

			case 2:
				boolean check = false;
				do {
					System.out.println("Enter EmployeeID you want to update salary: ");
					sc.nextLine();
					String checkId = sc.nextLine();
					for (Employee o : employeeList) {
						if (o.getCode().equalsIgnoreCase(checkId)) {
							System.out.print("Enter salary you want to update: ");
							int updateSalary = sc.nextInt();
							o.setSalary(updateSalary);
							check = true;
						}
					}
				} while (check == false);

				break;
			case 3:
				Collections.sort(employeeList, new Comparator<Employee>() {
					@Override
					public int compare(Employee o1, Employee o2) {
						if (o1.getSalary() < o2.getSalary())
							return 1;
						return -1;
					}
				});
				for (Employee o : employeeList) {
					o.showInfo();
				}
				break;

			case 4:
				System.out.println("See you again");
				break;
			default:
				System.out.print("Input in range 1 --> 4");
				break;
			}
		} while (choice != 5);
	}

	public static void menu() {
		System.out.println("1. Add a new employee to the list.");
		System.out.println("2. Updating salary of employee base on a code inputted");
		System.out.println("3. sorting employee list in descending order of salary.");
		System.out.println("4. Quit");
	}
}
