package employeemanager;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfEmployee {
	// luu danh sach nhân viên
	private ArrayList<Staff> list = new ArrayList<>();

	public void input() {
		Scanner sc = new Scanner(System.in);
		// clean het noi dung trong danh sach
		list.clear();
		do {
			System.out.println("            TMA SOLUTIONS");
			System.out.println("           Employee manager");
			System.out.println("---------------------------------------");
			System.out.println(" * Input type of employee (number 4 is exit) ");
			System.out.println("1. Hrstaff ");
			System.out.println("2. Programming staff ");
			System.out.println("3. Accountant ");
			String type  = sc.nextLine();
			
			// ep kieu
            int n = Integer.parseInt(type);
          
            	if(n<1 || n>4) {
        			sc.nextLine();
        			}
            	else if(n == 4) {
            		break;
            	}
			switch (n) {
			case 1:
				HrStaff hr = new HrStaff();
				System.out.println("---------------------------------------");
				System.out.println("HR department");
				hr.inputHrStaff(sc);
				list.add(hr);
				break;
			case 2:
				ProgrammingStaff pg = new ProgrammingStaff();
				System.out.println("---------------------------------------");
				System.out.println("Programming department");
				pg.inputProgrammingStaff(sc);
				list.add(pg);
				break;
			case 3:
				Accountant at = new Accountant();
				System.out.println("---------------------------------------");
				System.out.println("Accountant department");
				at.inputAccountant(sc);
				list.add(at);
				break;

			}

		} while (true);

	}

	public void tyleOfEmployee() {

	}

	public void output() {
		System.out.println("List of employee");
		System.out.print("(Programming staff year of experience >2, total salary = salary * 2) ");
		System.out.println(
				"\n -------------------------------------------------------------------------------------------------------------------------------------------");
		for (Staff s : list) {
			// chuyen doi tuong thanh nha vien HRStaff
			if (s instanceof HrStaff) {
				((HrStaff) s).outputHr();
			} else if (s instanceof ProgrammingStaff) {
				((ProgrammingStaff) s).outputProgrammingStaff();
			} else if (s instanceof Accountant) {
				((Accountant) s).outputAccountant();
			}
			System.out.println(
					"\n -------------------------------------------------------------------------------------------------------------------------------------------");
		}
	}

	public void function() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" * Function (enter to exit) ");
		System.out.println("1. Search ");
		System.out.println("2. Delete ");
		System.out.println("3. Edit ");
		System.out.println("4. Display list");
		int n = sc.nextInt();

		do {

			switch (n) {
			case 1:
				searchStaff();
				break;
			case 2:
				deleteStaff();
				break;
			case 3:
				editStaff();
				break;
			case 4:
				output();
				break;
			default:
			}
			function();

		} while (n > 4 || n < 1);

	}

	public void searchStaff() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee code you are looking for : ");
		String codeStaff = sc.nextLine();
		Staff sFound = null;
		for (Staff s : list) {
			// equalsIgnoreCase tim kiem không phan biet hoc thuong
			if (s.getCodeStaff().equalsIgnoreCase(codeStaff)) {

				sFound = s;
				break;

			}

		}
		if (sFound != null) {
			System.out.print("Employee information found:");
			sFound.outputStaff();
		} else {
			System.out.print("Employee information not found:" + codeStaff);
			System.out.printf("\n");
		}

	}

	public void deleteStaff() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the code to delete:");
		String code = sc.nextLine();
		Staff sFound = null;
		for (Staff s : list) {
			if (s.getCodeStaff().equalsIgnoreCase(code)) {
				sFound = s;
				break;
			}
		}
		if (sFound != null) {
			list.remove(sFound);
			System.out.println("Employee has been delete.");
		} else {
			System.out.printf("Code staff %s not found.", code);
			System.out.printf("\n");
		}

	}

	public void editStaff() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the code to edit: ");
		String code = sc.nextLine();
		Staff sFound = null;
		for (Staff item : list) {
			if (item.getCodeStaff().equalsIgnoreCase(code)) {
				sFound = item;
				break;

			}
		}
		if (sFound != null) {
			if (sFound instanceof HrStaff) {
				((HrStaff) sFound).inputHrStaff(sc);
			} else if (sFound instanceof ProgrammingStaff) {
				((ProgrammingStaff) sFound).inputProgrammingStaff(sc);
			} else if (sFound instanceof Accountant) {
				((Accountant) sFound).inputAccountant(sc);
			}
		} else {
			System.out.print("Code staff not found" + code);
		}
	}
}
